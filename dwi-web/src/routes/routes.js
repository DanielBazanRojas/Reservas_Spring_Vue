import { createRouter, createWebHistory } from "vue-router";
import Home from "../pages/Home.vue";
import Reservas from "../pages/Reservas.vue";

const routes = [
  {
    path: "/",
    component: Home,
  },
  {
    path: "/reservas",
    component: Reservas,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
