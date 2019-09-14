import {build} from '../request/api.build';

import login from '@/apis/login';
import test from '@/apis/test';

const apis = {
    test,
    login
};

export default build(apis);

