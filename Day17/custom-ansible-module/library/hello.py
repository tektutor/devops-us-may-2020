from ansible.module_utils.basic import AnsibleModule

def main():
    module = AnsibleModule(
        argument_spec=dict(
            msg=dict(type='str', default='TekTutor Ansible Module')
        )
    )

    argument = module.params['msg']
    
    message = 'Hello ' + str( argument ) + ' !'

    result = dict(
        output=message,
        changed=True
    )

    module.exit_json(**result)

    errorMsg = dict (
        error="Error occured"
    )
   
    #module.fail_json(msg="Error occurred")


if __name__ == '__main__':
    main()

