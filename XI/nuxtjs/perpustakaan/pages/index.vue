<template>
  <v-row>
    <v-col cols="12" lg="12" sm="12" md="12">
      <v-card>
        <div class="d-flex flex-column justify-space-between align-center">
          <v-img
            class="mt-5"
            lazy-src="https://ppdb.smktelkom-mlg.sch.id/assets/home/img/logo_hitam.png"
            max-height="250"
            max-width="auto"
            src="https://ppdb.smktelkom-mlg.sch.id/assets/home/img/logo_hitam.png"
          ></v-img>
        </div>

        <v-card-title>
          <h1 class="display-1">Perpustakaan</h1>
        </v-card-title>
        <v-card-text>
          <p>
            Perpustakaan adalah tempat yang menyimpan dan mengelola koleksi buku
            dan majalah. Perpustakaan dapat dibagi menjadi perpustakaan umum,
            perpustakaan sekolah, perpustakaan universitas, perpustakaan khusus,
            dan perpustakaan digital.
          </p>
          <v-alert dense :type="typeAlertApi">
            API-Perpustakaan is <strong>{{ checkApi }}</strong>
          </v-alert>
        </v-card-text>
        <!-- Login & Register-->
        <v-col cols="12" lg="12" md="12" sm="12">
          <v-row no-gutters>
            <v-col cols="12" lg="6" md="6" sm="6" class="mb-5">
              <v-card class="mr-3">
                <v-card-title>
                  <h1 class="display-1">Login</h1>
                </v-card-title>
                <v-card-text>
                  <p>Login Sebagai Member,Admin, atau Petugas</p>
                </v-card-text>
                <v-row>
                  <v-col class="mx-3" cols="12" lg="11" md="12" sm="12">
                    <v-text-field
                      label="Name"
                      outlined
                      v-model="adminLogin.username"
                    ></v-text-field>
                    <v-text-field
                      label="Password"
                      outlined
                      v-model="adminLogin.password"
                    ></v-text-field>
                    <p>
                      {{ response }}
                    </p>
                  </v-col>
                  <v-col class="mx-3" cols="12" lg="11" md="12" sm="12">
                    <v-btn color="primary" block @click="loginAdmin()"
                      >Masuk</v-btn
                    >
                  </v-col>
                </v-row>
              </v-card>
            </v-col>
            <!-- Register -->
            <v-col cols="12" lg="6" md="6" sm="6">
              <v-card class="ms-3 mb-3">
                <v-card-title>
                  <h1 class="display-1">Register</h1>
                </v-card-title>
                <v-card-text>
                  <p>Register Sebagai Member,Admin, atau Petugas</p>
                </v-card-text>
                <v-row>
                  <v-col class="mx-3" cols="12" lg="11" md="11" sm="11">
                    <v-text-field
                      label="Name"
                      outlined
                      v-model="admindatas.name"
                    ></v-text-field>
                    <v-text-field
                      label="Contact"
                      outlined
                      v-model="admindatas.contact"
                    ></v-text-field>
                    <v-text-field
                      label="address"
                      outlined
                      v-model="admindatas.address"
                    ></v-text-field>
                    <v-text-field
                      label="Username"
                      outlined
                      v-model="admindatas.username"
                    ></v-text-field>
                    <v-text-field
                      label="Password"
                      outlined
                      v-model="admindatas.password"
                    ></v-text-field>
                    <!-- <v-file-input
                      show-size
                      truncate-length="50"
                      accept="image/*"
                      label="Photo"
                      outlined
                      v-model="admindatas.photo"
                    ></v-file-input> -->
                    <p>
                      {{ response }}
                    </p>
                  </v-col>
                  <v-col class="mx-3" cols="12" lg="11" md="12" sm="12">
                    <v-btn color="primary" block @click="registerAdmin()"
                      >Daftar</v-btn
                    >
                  </v-col>
                </v-row>
              </v-card>
            </v-col>
          </v-row>
        </v-col>
      </v-card>
    </v-col>
  </v-row>
</template>

<script>
var md5 = require("md5");
export default {
  name: "IndexPage",
  data() {
    return {
      name: "IndexPage",
      checkApi: "null",
      typeAlertApi: "null",
      adminLogin: {
        username: "",
        password: "",
      },

      admindatas: {
        name: "",
        contact: "",
        address: "",
        username: "",
        password: "",
      },
      response: "",
    };
  },
  methods: {
    async checkApiPerpustakaan() {
      try {
        const response = await this.$axios.get("http://localhost:8080/");
        this.checkApi = "Connected";
        this.typeAlertApi = "success";
      } catch (error) {
        this.checkApi = "Not Connected";
        this.typeAlertApi = "error";
      }
    },
    registerAdmin() {
      this.$axios
        .post("http://localhost:8080/api/admin/create", this.admindatas)
        .then((response) => {
          console.log(response);
          this.response = response.data;
        })
        .catch((error) => {
          console.log(error);
        });
    },
    loginAdmin() {
      this.$axios
        .post(`http://localhost:8080/api/auth`, this.adminLogin)
        .then((response) => {
          console.log(response);
          if (response.data.success == true) {
            this.response = response.data;
          } else {
            this.response = "Password Salah";
          }
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
  mounted() {
    this.checkApiPerpustakaan();
  },
};
</script>
