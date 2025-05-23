/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ 
/*    */ import com.intellij.codeWithMe.ClientId;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus;", "ej-android"})
/*    */ @SourceDebugExtension({"SMAP\nAndroidTestResultListenerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTestResultListenerEvent.kt\ncom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,46:1\n40#2,3:47\n*S KotlinDebug\n*F\n+ 1 AndroidTestResultListenerEvent.kt\ncom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultListenerEventBus$Companion\n*L\n43#1:47,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final AndroidTestResultListenerEventBus getInstance() {
/* 43 */     int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */     
/* 47 */     Class<AndroidTestResultListenerEventBus> serviceClass$iv = AndroidTestResultListenerEventBus.class;
/* 48 */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 49 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*    */     
/*    */     return (AndroidTestResultListenerEventBus)ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\AndroidTestResultListenerEventBus$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */