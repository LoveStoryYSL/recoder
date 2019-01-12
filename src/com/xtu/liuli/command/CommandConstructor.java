package com.xtu.liuli.command;

import com.xtu.liuli.attribute.AudioAttributes;
import com.xtu.liuli.attribute.CaptionAttributes;
import com.xtu.liuli.attribute.EncodeAttributes;
import com.xtu.liuli.attribute.VideoAttributes;
import com.xtu.liuli.exception.FileNotExistException;
import com.xtu.liuli.util.BooleanUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandConstructor
{
    public static String getCommandString(Map Command)
    {
        return "";
    }
    public static String getCommand(EncodeAttributes attributes) throws FileNotExistException {
        List list=new ArrayList<String>();
        Map map=new HashMap<String,String>();
        VideoAttributes video=attributes.getVideoAttributes();
        AudioAttributes audio=attributes.getAudioAttributes();
        CaptionAttributes caption=attributes.getCaptionAttributes();
        File sourceFile=attributes.getSourceFile();
        File targetFile=attributes.getTargetFile();
        if(!sourceFile.exists())
        {
            throw new FileNotExistException();
        }
        if(!targetFile.getParentFile().exists())
        {
            targetFile.mkdirs();
        }
        String sourcePath=sourceFile.getAbsolutePath();
        String targetPath=targetFile.getAbsolutePath();
        if(BooleanUtil.checkBoolean(video.isIgnoreVideo()))
        {
            if(video.getBitRate()!=null)
            {
                list.add(" -b:v ");
                list.add(video.getBitRate());
            }
            if(video.getVframes()!=null)
            {
                list.add(" -vframes ");
                list.add(video.getVframes());
            }
            if(video.getRate()!=null)
            {
                list.add(" -r ");
                list.add(video.getRate());
            }
            if(video.getHeight()!=null&&video.getWidth()!=null)
            {
                list.add(" -s ");
                list.add(video.getWidth());
                list.add("x");
                list.add(video.getHeight());
            }
            if(video.getCropTop()!=null)
            {
                list.add(" -croptop ");
                list.add(video.getCropTop());
            }
            if(video.getCropLeft()!=null)
            {

            }
        }else
        {
            list.add(" -vn");
        }
        return getCommandString(map);
    }
}