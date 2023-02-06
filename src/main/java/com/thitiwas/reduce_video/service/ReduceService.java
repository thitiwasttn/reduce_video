package com.thitiwas.reduce_video.service;

import lombok.extern.slf4j.Slf4j;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFmpegExecutor;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.builder.FFmpegBuilder;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;
import net.bramp.ffmpeg.probe.FFmpegStream;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;


@Service
@Slf4j
public class ReduceService {

    private String ffmpegPath = "C:\\Users\\Admin\\Downloads\\ffmpeg-2023-01-22-git-9d5e66942c-full_build\\bin\\ffmpeg";
    private String ffprobePath = "C:\\Users\\Admin\\Downloads\\ffmpeg-2023-01-22-git-9d5e66942c-full_build\\bin\\ffprobe";

    public void reduceVideo480bitrate1500(String inputVideo, String folderDes) throws IOException {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);
//        reduceVideo480V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo720V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo1080V2(inputVideo, folderDes, fFmpeg, fFprobe);

        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("480_bitrate1500.").concat("mp4");
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 480)
                .setVideoBitRate(1500000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();

    }

    private void reduceVideo480pBitrate1750(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("480_bit1750.").concat(fileName[1]);
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 480)
                .setVideoBitRate(1750000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo720pBitrate3500(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("720_bit3500.").concat(fileName[1]);
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(1280, 720)
                .setVideoBitRate(3500000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo1080pBitrate7000(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("1080_bit7000.").concat(fileName[1]);
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(1920, 1080)
                .setVideoBitRate(7000000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }


    public void reduceVideo480bitrateDefault(String inputVideo, String folderDes) throws IOException {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);
//        reduceVideo480V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo720V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo1080V2(inputVideo, folderDes, fFmpeg, fFprobe);

        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("480_bitrateDefault.").concat("mp4");
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 480)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();

    }
    public void reduceVideo480aAv1bitrateDefault(String inputVideo, String folderDes) throws IOException {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("480av1.").concat("mkv");
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 480)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .setVideoCodec("libaom-av1")
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();

    }

    public void reduceVideo720aAv1bitrateDefault(String inputVideo, String folderDes) throws IOException {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("720av1.").concat("mp4");
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 720)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .setVideoCodec("libaom-av1")
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();

    }


    public void reduceVideoV6(String inputVideo, String folderDes) throws IOException {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);
//        reduceVideo480V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo720V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo1080V2(inputVideo, folderDes, fFmpeg, fFprobe);

        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("480.").concat("mp4");
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 480)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
//                .setVideoCodec("hevc")
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();

    }

    public void reduceVideoV5(String inputVideo, String folderDes) throws IOException {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);
//        reduceVideo480V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo720V2(inputVideo, folderDes, fFmpeg, fFprobe);
//        reduceVideo1080V2(inputVideo, folderDes, fFmpeg, fFprobe);

        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("480.").concat("hevc");
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 480)
                .setVideoBitRate(2000000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .setVideoCodec("hevc")
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();

    }

    private void reduceVideo360V2(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("360.").concat(fileName[1]);
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(640, 360)
                .setVideoBitRate(4000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo480V2(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("480.").concat(fileName[1]);
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(854, 480)
                .setVideoBitRate(2000000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo720V2(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("720.").concat(fileName[1]);
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(1280, 720)
                .setVideoBitRate(400000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo1080V2(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("1080.").concat(fileName[1]);
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        FFmpegStream stream = probeResult.getStreams().get(0);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(1920, 1080)
                .setVideoBitRate(800000)
                .setVideoFrameRate(stream.avg_frame_rate)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }


    public void reduceVideoV3(String inputVideo, String folderDes) throws IOException {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);

        printPropFile(inputVideo, fFmpeg, fFprobe);
        reduceVideo144(inputVideo, folderDes, fFmpeg, fFprobe);
        reduceVideo360(inputVideo, folderDes, fFmpeg, fFprobe);
        reduceVideo720(inputVideo, folderDes, fFmpeg, fFprobe);
        reduceVideo1080(inputVideo, folderDes, fFmpeg, fFprobe);
    }

    private void reduceVideo144(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("144.").concat(fileName[1]);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(176, 144)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo360(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("360.").concat(fileName[1]);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(640, 360)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo720(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("720.").concat(fileName[1]);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(1280, 720)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void reduceVideo1080(String inputVideo, String folderDes, FFmpeg fFmpeg, FFprobe fFprobe) {
        File file = new File(inputVideo);
        String[] fileName = file.getName().split("\\.");
        String finalFileName = fileName[0].concat("_").concat("1080.").concat(fileName[1]);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput(inputVideo)     // Filename, or a FFmpegProbeResult
                .overrideOutputFiles(true)
                .addOutput(folderDes + "\\" + finalFileName)
                .setVideoResolution(1920, 1080)
                .setStrict(FFmpegBuilder.Strict.EXPERIMENTAL)
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(fFmpeg, fFprobe);
        executor.createJob(builder).run();
    }

    private void printPropFile(String inputVideo, FFmpeg fFmpeg, FFprobe fFprobe) throws IOException {
        FFmpegProbeResult probeResult = fFprobe.probe(inputVideo);
        FFmpegFormat format = probeResult.getFormat();
        File file = new File(inputVideo);
        log.info("fileName :{}", file.getName());
        log.info("\nfileName :{},\n formatLongName :{},\n duration :{},\n" +
                        "format :{},\n" +
                        "size :{}",
                format.filename,
                format.format_long_name,
                format.duration,
                format.format_name,
                format.size);

        FFmpegStream stream = probeResult.getStreams().get(0);
        log.info("\ncodec :{}\n " +
                        "width:{} \n" +
                        "heigh:{}\n" +
                        "duration:{},\n" +
                        "fps:{}\n" +
                        "aspect_ration :{}\n" +
                        "bitrate:{}",
                stream.codec_name,
                stream.width,
                stream.height,
                stream.duration,
                stream.avg_frame_rate.doubleValue(),
                stream.display_aspect_ratio,
                stream.bit_rate);
    }

    public void reduceVideoYoutubeBitrate(String sorucePath, String folderDes) throws Exception {
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFprobe fFprobe = new FFprobe(ffprobePath);
        log.info("start");
        reduceVideo480pBitrate1750(sorucePath, folderDes, fFmpeg, fFprobe);
        log.info("done 1");
        reduceVideo720pBitrate3500(sorucePath, folderDes, fFmpeg, fFprobe);
        log.info("done 2");
        reduceVideo1080pBitrate7000(sorucePath, folderDes, fFmpeg, fFprobe);
        log.info("done 3");
    }
}
