/*    */ package ai.grazie.client.common.auth;
/*    */ 
/*    */ import ai.grazie.model.auth.GrazieAgent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006J\016\020\b\032\0020\0042\006\020\005\032\0020\006¨\006\t"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Extension;", "", "()V", "Chrome", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "Firefox", "Safari", "client-common"})
/*    */ public final class Extension {
/*    */   @NotNull
/*    */   public static final Extension INSTANCE = new Extension();
/*    */   
/*    */   @NotNull
/* 13 */   public final GrazieAgent Chrome(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-chrome-extension", version); } @NotNull
/* 14 */   public final GrazieAgent Firefox(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-firefox-extension", version); } @NotNull
/* 15 */   public final GrazieAgent Safari(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-safari-extension", version); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\auth\GrazieAgents$Extension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */