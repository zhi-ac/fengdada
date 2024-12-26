import { createRouter, createWebHistory, RouteRecordRaw } from "vue-router";
import HomeView from "../views/HomeView.vue";
import UserLayout from "@/layouts/UserLayout.vue";

const routes: Array<RouteRecordRaw> = [
  {
    path: "/",
    name: "home",
    component: HomeView,
  },
  {
    path: "/about",
    name: "about",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/AboutView.vue"),
  },
  {
    path: "/user/login",
    name: "用户",
    component: UserLayout,
    // children: [
    //   {
    //     path: "/user/login",
    //     name: "用户登录",
    //     component: UserLoginView,
    //   },
    //   {
    //     path: "/user/register",
    //     name: "用户注册",
    //     component: UserRegisterView,
    //   },
    // ],
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
