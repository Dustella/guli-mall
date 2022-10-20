import { defineConfig } from "vite";
// import vue plugin
import vue from "@vitejs/plugin-vue";

export default defineConfig({
  plugins: [
    // vue
    vue(),
  ],
  //   resolve @ to src
  resolve: {
    alias: {
      "@": "/src",
    },
  },
});
