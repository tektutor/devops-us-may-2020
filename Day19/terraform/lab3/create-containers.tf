provider "docker" {
  host="tcp://localhost:4243" 
}

#resource "docker_image" "tektutor_ansible_ubuntu_image" {
#	name = "tektutor/ansible-ubuntu"
#}

#resource "docker_image" "tektutor_ansible_centos_image" {
#	name = "tektutor/ansible-centos"
#}

resource "docker_container" "ubuntu1_container" {
	name = "ubuntu-001"
        hostname = "ubuntu-001"
        #image = docker_image.tektutor_ansible_ubuntu_image.name
        image = "tektutor/ansible-ubuntu"
        ports {
		internal  = "22"
		external  = "2001"
	}
        ports {
		internal  = "80"
		external  = "8001"
	}
}

resource "docker_container" "centos1_container" {
	name = "centos1"
        hostname = "centos1"
        #image = docker_image.tektutor_ansible_centos_image.name
        image = "tektutor/ansible-centos"
        ports {
		internal  = "22"
		external  = "2002"
	}
        ports {
		internal  = "80"
		external  = "8002"
	}
}
