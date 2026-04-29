// Vue Router 라이브러리에서 필요한 함수들을 가져옴
// createRouter : Vue 라우터 인스턴스를 생성하는 함수
// createWebHistory : HTML 5 History API를 사용하여 URL 경로를 관리하는 함수
import { createRouter, createWebHistory } from 'vue-router';

// @: src -> vite.config.js
import Members from '@/pages/Members.vue';
import MemberInfo from '@/pages/MemberInfo.vue';
import Home from '@/pages/Home.vue';
import MembersLeft from '@/components/members/MembersLeft.vue';
import MembersFooter from '@/components/members/MembersFooter.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  //routes : URL 주소와 컴포넌트를 연결해 놓은 설정 목록
  routes: [
    { path: '/', name: 'home', component: Home },
    {
      path: '/members',
      name: 'members',
      components: {
        default: Members,
        left: MembersLeft,
        footer: MembersFooter,
      },
    },
    { path: '/members/:id(\\d+)', name: 'memberInfo', component: MemberInfo },
  ],
});

export default router;
