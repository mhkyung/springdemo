package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import com.example.demo.model.WebAlFrameModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserProfileController {
    private Map<String, UserProfile> userMap;

    @PostConstruct
    public void init() {
        userMap = new HashMap<>();
        userMap.put("1", new UserProfile("1", "홍길동", "111-1111", "성남시 분당구"));
        userMap.put("2", new UserProfile("2", "홍길동", "111-1111", "성남시 분당구"));
        userMap.put("3", new UserProfile("3", "홍길동", "111-1111", "성남시 분당구"));
        userMap.put("4", new UserProfile("4", "홍길동", "111-1111", "성남시 분당구"));
    }

    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathVariable("id") String id) {
        return userMap.get(id);
    }

    @GetMapping("/profile/all")
    public List<UserProfile> getAlFrameModel() {
        return userMap.values().stream().toList();
//        ArrayList<WebAlFrameModel.WebJoint> jointList = new ArrayList<>();
//        {
//            double size0[] = { 40, 20, 20};
//            double position0[] = { 980, -490, 150};
//            int[] segments0 = {0,4,8};
//            jointList.add(new WebAlFrameModel.WebJoint("Joint-0", size0, position0, segments0));
//            double[] size1 = {40,20,20};
//            double[] position1 = {-980, -490, 150};
//            int[] segments1 = {0,4,8 };
//            jointList.add(new WebAlFrameModel.WebJoint("Joint-1", size1, position1, segments1));
//
//            double[] size2 = {40,20,20};
//            double[] position2 = { -980,  490, 150 };
//            int[] segments2 = {2,5,8};
//            jointList.add(new WebAlFrameModel.WebJoint("Joint-2", size2, position2, segments2));
//
//            double[] size3 = {440,20,200};
//            double[] position3 = { 980,  490, 1500 };
//            int[] segments3 = {3,5,9};
//            jointList.add(new WebAlFrameModel.WebJoint("Joint-3", size3, position3, segments3));

//        {"name":"Joint-4", "size": [40,20,20], "position": [-980, -490, 150] "segment":[0,6,10] },
//        {"name":"Joint-5", "size": [40,20,20], "position": [ 980, -490, 150] "segment":[1,6,11] },
//        {"name":"Joint-6", "size": [40,20,20], "position": [-980,  490, 1990] "segment":[2,7,10] },
//        {"name":"Joint-7", "size": [40,20,20], "position": [ 980,  490, 1990] "segment":[3,7,11] } ],
//        "s

//        }
//        return (WebAlFrameModel.WebJoint[]) jointList.toArray();
//
//        ArrayList<WebAlFrameModel.WebSegment> segmentList = new ArrayList<>();
//        {
//            double[] scale0 = {1,1,200};
//            double[] rotate0 = { 0,0,0 };
//            double[] position0 = {980, -490, 0};
//            segmentList.add(new WebAlFrameModel.WebSegment("COL-0", "DF4020", scale0, rotate0, position0));
//
//            double[] scale1 = {1,1,200};
//            double[] rotate1 = { 0,0,0 };
//            double[] position1 = {980, -490, 0};
//            segmentList.add(new WebAlFrameModel.WebSegment("COL-1", "DF4020", scale1, rotate1, position1));
//
//        }
//
////        {"name":"COL-0", "mode":"DF4020", "scale": [1,1,2000], "rotate": [0,0,0], "position": [-980, -490, 0]},
////        {"name":"COL-1", "mode":"DF4020", "scale": [1,1,2000], "rotate": [0,0,0], "position": [ 980, -490, 0]},
////        {"name":"COL-2", "mode":"DF4020", "scale": [1,1,2000], "rotate": [0,0,180], "position": [-980, 490, 0]},
////        {"name":"COL-3", "mode":"DF4020", "scale": [1,1,2000], "rotate": [0,0,180], "position": [ 980, 490, 0]},
////        {"name":"XBEAM-4", "mode":"DF2020", "scale": [1,1,1920], "rotate": [0,90,0], "position": [-990, -490, 140]},
////        {"name":"XBEAM-5", "mode":"DF2020", "scale": [1,1,1920], "rotate": [0,90,180], "position": [-990,  490, 140]},
////        {"name":"XBEAM-6", "mode":"DF2020", "scale": [1,1,1920], "rotate": [0,90,0], "position": [-990, -490, 1990]},
////        {"name":"XBEAM-7", "mode":"DF2020", "scale": [1,1,1920], "rotate": [0,90,180], "position": [-990,  490, 1990]},
////        {"name":"YBEAM-8", "mode":"DF2020", "scale": [1,1,960], "rotate": [90,0,0], "position": [-990, -490, 140]},
////        {"name":"YBEAM-9", "mode":"DF2020", "scale": [1,1,960], "rotate": [90,0,180], "position": [ 990, -490, 140]},
////        {"name":"YBEAM-10", "mode":"DF2020", "scale": [1,1,960], "rotate": [90,0,0], "position": [-970, -490, 1990]},
////        {"name":"YBEAM-11", "mode":"DF2020", "scale": [1,1,960], "rotate": [90,0,180], "position": [ 970, -490, 1990]}],
//
//        return new WebAlFrameModel((WebAlFrameModel.WebJoint[])jointList.toArray(),
//                (WebAlFrameModel.WebSegment[])segmentList.toArray());
    }
}
