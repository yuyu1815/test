/*    */ package ai.grazie.client.common.auth;
/*    */ 
/*    */ import ai.grazie.model.auth.GrazieAgent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Editor;", "", "()V", "Desktop", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "Web", "client-common"})
/*    */ public final class Editor
/*    */ {
/*    */   @NotNull
/*    */   public static final Editor INSTANCE = new Editor();
/*    */   
/*    */   @NotNull
/*    */   public final GrazieAgent Web(@NotNull String version) {
/* 19 */     Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-web-editor", version); } @NotNull
/* 20 */   public final GrazieAgent Desktop(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-desktop-editor", version); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\auth\GrazieAgents$Editor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */