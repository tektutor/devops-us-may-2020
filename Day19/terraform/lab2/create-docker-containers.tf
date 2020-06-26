provider "docker" {

}

resource "docker_image" "tektutor_ubuntu1604_img" {
	name = "ubuntu:16.04"
}

resource "docker_image" "tektutor_centos67_img" {
	name = "centos:6.7"
}

resource "docker_container" "ubuntu_container1" {
	name = "ubuntu_server1"
	hostname = "ubuntu_server1"
	image = docker_image.tektutor_ubuntu1604_img.name

	command = ["tail", "-f", "/dev/null"]
	must_run = "true"
}

resource "docker_container" "centos_container1" {
	name = "centos_server1"
	hostname = "centos_server1"
	image = docker_image.tektutor_centos67_img.name

	command = ["tail", "-f", "/dev/null"]
	must_run = "true"
}
