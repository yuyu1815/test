/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skiko.OS;
/*    */ import org.jetbrains.skiko.OsArch_jvmKt;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\007¨\006\006"}, d2 = {"Lorg/jetbrains/jewel/bridge/ScrollbarHelper$Companion;", "", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/bridge/ScrollbarHelper;", "ide-laf-bridge"})
/*    */ public final class Companion
/*    */ {
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public final ScrollbarHelper getInstance() {
/* 24 */     return (OsArch_jvmKt.getHostOs() == OS.MacOS) ? ScrollbarHelperKt.access$getScrollbarService() : DummyScrollbarHelper.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\ScrollbarHelper$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */