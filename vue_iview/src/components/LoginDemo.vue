<template>
    <div>
        <el-form :model="form" :rules="rules" ref="form" label-width="100px">
            <el-form-item label="账号：" prop="name">
                <el-input v-model="form.name" placeholder="请输入用户名"></el-input>
            </el-form-item>
            <el-form-item label="密码：" prop="password">
                <el-input v-model="form.password" placeholder="请输入密码"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="submitForm('form')" :loading="tmp">登录</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>

<script>
    import api from '../apis'
    import qs from 'qs'

    export default {
        name: 'LoginDemo',
        data () {
            return {
                form: {
                    name: '',
                    password: ''
                },
                tmp: false,
                rules: {
                    name: [
                        {required: true, message: '请输入用户名', trigger: 'blur'},
                        {min: 2, max: 16, message: '长度在6到16个字符之间', trigger: 'blur'}
                    ],
                    password: [
                        {required: true, message: '请输入密码', trigger: 'blur'},
                        {min: 6, max: 16, message: '长度在6到16个字符之间', trigger: 'blur'}
                    ]
                }
            }
        },
        methods: {
            submitForm (formName) {
                let _this = this;
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        _this.tmp = true;
                        /*axios.post('/login', qs.stringify({
                            'username': _this.form.name,
                            'password': _this.form.password
                        })).then(res => {
                            this.$message.info('res: ' + res.data.message)
                            console.log(res)
                        }).catch((err) => {
                            this.$message.error('res: ' + err.message)
                        })*/
                        api.login.createLogin({
                            data: qs.stringify({
                                'username': _this.form.name,
                                'password': _this.form.password
                            })
                        }).then((res) => {
                            this.$message.success('res: ' + res.data.message)
                            console.log(res)
                        }).catch((err) => {
                            if (err.status === 504) {
                                this.$message.error('连接服务器异常')
                            } else {
                                this.$message.error('未知错误')
                            }
                        }).finally(() => {
                            _this.tmp = false
                        })
                    }
                })
                // _this.load = false
            }
        }
    }
</script>

<style scoped>

</style>
