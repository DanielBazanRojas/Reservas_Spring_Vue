import { createRouter, createWebHistory } from "vue-router";
import Home from "../pages/Home.vue";
import Reservas from "../pages/Reservas.vue";
import Pago from "../pages/Pago.vue";
import Login from "../pages/Login.vue";
import Register from "../pages/Register.vue";

const routes = [
  {
    path: "/",
    component: Home,
  },
  {
    path: "/reservas",
    component: Reservas,
  },
  {
    path: "/pago",
    component: Pago,
  },
  {
    path: "/login",
    component: Login,
  },
  {
    path: "/register",
    component: Register,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
