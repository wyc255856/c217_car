package com.faw.seniar9;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.faw.seniar9.util.ManuaConfig;
import com.gh.ghdownload.DownloadManager;


/**
 * Created by wyc on 18/3/23.
 */

public class ManuaApi {
    public static int CAR_MODE = 1;
    static ManuaApi mInstance;
    static final Object mInstanceSync = new Object();// 同步

    // 对外api
    static public ManuaApi getInstance() {

        synchronized (mInstanceSync) {
            if (mInstance != null) {
                return mInstance;
            }

            mInstance = new ManuaApi();

        }
        return mInstance;
    }

    public void initManuaApi(int car_mode) {
        ManuaApi.CAR_MODE = car_mode;
//        OkHttpFinalConfiguration.Builder builder = new OkHttpFinalConfiguration.Builder();
//        OkHttpFinal.getInstance().init(builder.build());
    }

    public void manuaUpLoadZip(final Context context) {

        String url = ManuaConfig.getManuaDownLoadUrl(context);

//        Log.e("tag", "saveFile = " + saveFile);
        Log.e("tag", "url = " + url);
        ManuaSetActivity.downLoad_view.setVisibility(View.VISIBLE);

        DownloadManager.getInstance(context).add(ManuaSetActivity.entry);
//        String url = ManuaConfig.getManuaDownLoadUrl(context);
//        final File saveFile = new File(LibIOUtil.getDefaultUploadZipPath(context));
//        Log.e("tag", "saveFile = " + saveFile);
//        Log.e("tag", "url = " + url);
//        HttpRequest.download(url, saveFile, new FileDownloadCallback() {
//            //开始下载
//            @Override
//            public void onStart() {
//                super.onStart();
//                ManuaSetActivity.downLoad_view.setVisibility(View.VISIBLE);
//            }
//
//            //下载进度
//            @Override
//            public void onProgress(int progress, long networkSpeed) {
//                super.onProgress(progress, networkSpeed);
//                if (progress == 100) {
//                    ManuaSetActivity.downLoad_progress.setProgress(99);
//                    ManuaSetActivity.progress_text.setText("99%");
//                } else {
//                    ManuaSetActivity.downLoad_progress.setProgress(progress);
//                    ManuaSetActivity.progress_text.setText(progress + "%");
//                }
//                //String speed = FileUtils.generateFileSize(networkSpeed);
//            }
//
//            //下载失败
//            @Override
//            public void onFailure() {
//                super.onFailure();
//                ManuaSetActivity.downLoad_progress.setProgress(0);
//                ManuaSetActivity.progress_text.setText("0%");
//                ManuaSetActivity.downLoad_view.setVisibility(View.GONE);
//                Toast.makeText(context, "下载失败", Toast.LENGTH_SHORT).show();
//            }
//
//            //下载完成（下载成功）
//            @Override
//            public void onDone() {
//                super.onDone();
//                ManuaSetActivity.downLoad_progress.setProgress(99);
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        if (SharedpreferencesUtil.getIsFirst(ManualWebActivity.context)) {
//                            FireUtil.isExist(ManualWebActivity.context);
//                        }
//
////                        try {
////                            ManualWebActivity.unZipFiles(LibIOUtil.getDefaultUploadZipPath(context),LibIOUtil.getDefaultPath(context));
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
//
//                        ZipUtil.unpack(saveFile, new File(LibIOUtil.getDefaultPath(context)), Charset.forName("GBK"));
////                        ZipUtil.unpack(saveFile, new File(LibIOUtil.getDefaultPath(context)));
//                        ((Activity) context).runOnUiThread(new Runnable() {
//
//                            @Override
//                            public void run() {
//
//                                ManualWebActivity.downLoad_progress.setProgress(100);
//                                ManualWebActivity.progress_text.setText("100%");
//                                ManualWebActivity.downLoad_view.setVisibility(View.GONE);
//                                SharedpreferencesUtil.setHaveLocal(ManualWebActivity.context, "1");
//                                SharedpreferencesUtil.setModelLocal(context, SharedpreferencesUtil.getCarModel(context));
//                                SharedpreferencesUtil.setCarMode(context, "0");
//                                SharedpreferencesUtil.setVersion(context, ManuaConfig.VERSION);
//                                saveFile.delete();
//                                Intent intent = new Intent(ManuaSetActivity.context, ManualWebActivity.class);
//                                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                                ManuaSetActivity.context.startActivity(intent);
//                                ManuaSetActivity.context.finish();
//                                Toast.makeText(context, "下载成功", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                    }
//                }).start();
//
//
//            }
//        });
    }

    public void manuaDownLoadZip(final Context context) {

        String url = ManuaConfig.getManuaDownLoadUrl(context);

//        Log.e("tag", "saveFile = " + saveFile);
        Log.e("tag", "url = " + url);
        ManuaSetActivity.downLoad_view.setVisibility(View.VISIBLE);

        DownloadManager.getInstance(context).add(ManuaSetActivity.entry);
//        HttpRequest.download(url, saveFile, new FileDownloadCallback() {
//            //开始下载
//            @Override
//            public void onStart() {
//                super.onStart();
//                ManuaSetActivity.downLoad_view.setVisibility(View.VISIBLE);
//            }
//
//            //下载进度
//            @Override
//            public void onProgress(int progress, long networkSpeed) {
//                super.onProgress(progress, networkSpeed);
//                if (progress == 100) {
//                    ManuaSetActivity.downLoad_progress.setProgress(99);
//                    ManuaSetActivity.progress_text.setText("99%");
//                } else {
//                    ManuaSetActivity.downLoad_progress.setProgress(progress);
//                    ManuaSetActivity.progress_text.setText(progress + "%");
//                }
//                //String speed = FileUtils.generateFileSize(networkSpeed);
//            }
//
//            //下载失败
//            @Override
//            public void onFailure() {
//                super.onFailure();
//                ManuaSetActivity.downLoad_progress.setProgress(0);
//                ManuaSetActivity.progress_text.setText("0%");
//                ManuaSetActivity.downLoad_view.setVisibility(View.GONE);
//                Toast.makeText(context, "下载失败", Toast.LENGTH_SHORT).show();
//            }
//
//            //下载完成（下载成功）
//            @Override
//            public void onDone() {
//                super.onDone();
//                ManuaSetActivity.downLoad_progress.setProgress(99);
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
////                        try {
////                            ManualWebActivity.unZipFiles(LibIOUtil.getDefaultUploadZipPath(context),LibIOUtil.getDefaultPath(context));
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
//                        ZipUtil.unpack(saveFile, new File(LibIOUtil.getDefaultPath(context)), Charset.forName("GBK"));
//                        ((Activity) context).runOnUiThread(new Runnable() {
//
//                            @Override
//                            public void run() {
//                                // TODO Auto-generated method stub
//                                ManualWebActivity.downLoad_progress.setProgress(100);
//                                ManualWebActivity.progress_text.setText("100%");
//                                ManualWebActivity.downLoad_view.setVisibility(View.GONE);
//                                SharedpreferencesUtil.setHaveLocal(ManualWebActivity.context, "1");
//                                SharedpreferencesUtil.setModelLocal(context, SharedpreferencesUtil.getCarModel(context));
//                                SharedpreferencesUtil.setCarMode(context, "0");
//                                SharedpreferencesUtil.setVersion(context, ManuaConfig.VERSION);
//                                saveFile.delete();
//                                Intent intent = new Intent(ManuaSetActivity.context, ManualWebActivity.class);
//                                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                                ManuaSetActivity.context.startActivity(intent);
//                                ManuaSetActivity.context.finish();
//                                Toast.makeText(context, "下载成功", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                    }
//                }).start();
//
//
//            }
//        });
    }

    public void openManua(Context context, String carModel) {
        Intent intent = new Intent(context, ManuaWelecomActivity.class);
        intent.putExtra("carModel",carModel);
        context.startActivity(intent);
    }
}
