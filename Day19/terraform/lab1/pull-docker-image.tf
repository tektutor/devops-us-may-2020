provider "docker" {

}

resource "docker_image" "hello_img" {
	name = "hello-world:latest"
}

resource "docker_image" "ubuntu1604_img" {
	name = "ubuntu:16.04"
}

resource "docker_image" "ubuntu1804_img" {
	name = "ubuntu:18.04"
}
