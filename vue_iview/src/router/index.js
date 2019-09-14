import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import LoginDemo from "../components/LoginDemo";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/login',
      name: 'LoginDemo',
      component: LoginDemo
    }
    ,{
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
