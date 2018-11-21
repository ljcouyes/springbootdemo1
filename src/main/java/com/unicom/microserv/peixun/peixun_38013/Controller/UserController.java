package com.unicom.microserv.peixun.peixun_38013.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("/peixun/38013/")
public class UserController {

    @RequestMapping(value = "users", method = RequestMethod.GET)
    @ApiOperation(
            value = "查询所有用户"
    )
    public List<User> users() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        User user2 = new User();

        user1.setName("liu");
        user1.setAge(26);
        user2.setName("zhao");
        user2.setAge(18);

        users.add(user1);
        users.add(user2);

        return users;
    }

    @RequestMapping(
            value = "users",
            method = RequestMethod.POST
    )
    @ApiOperation(
            value = "添加一个用户"
    )
    public User saveuser(
            @ApiParam(name="user",value="用户实体类",required=true)
            @RequestBody User user
    ) {
        return user;
    }

    @ApiOperation(
            value = "根据ID查找用户"
    )
    @RequestMapping(
            value = "users/{id}",
            method = RequestMethod.GET
    )
    public User findUserbyId(
            @ApiParam(name="id",value="用户id",required=true) @PathVariable String id
    ) {
        User user=new User();
        return user;
    }

    @ApiOperation(
            value = "根据ID定位用户并修改信息"
    )
    @RequestMapping(
            value = "users/{id}",
            method = RequestMethod.PUT
    )
    public User updateUser(
            @PathVariable String id,
            @RequestBody User user
    ) {
        return null;
    }

    @ApiOperation(
            value = "根据ID删除用户"
    )
    @RequestMapping(
            value = "users/{id}",
            method = RequestMethod.DELETE
    )
    public User delete() {
        return null;
    }

    @ApiOperation(
            value = "根据姓名查找用户"
    )
    @RequestMapping(
            value = "users/name/{name}",
            method = RequestMethod.GET
    )
    public List<User> findUsersByName(
            @PathVariable String name
    ) {
        return null;
    }

    @ApiOperation(
            value = "根据ID查找用户的age"
    )
    @RequestMapping(
            value = "users/{id}/age",
            method = RequestMethod.GET
    )
    public int findUserAgeById(
            @PathVariable String id
    ) {
        return 0;
    }

}

