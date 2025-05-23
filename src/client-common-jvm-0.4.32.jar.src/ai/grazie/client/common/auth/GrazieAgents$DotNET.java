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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$DotNET;", "", "()V", "ReSharper", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "client-common"})
/*    */ public final class DotNET
/*    */ {
/*    */   @NotNull
/*    */   public static final DotNET INSTANCE = new DotNET();
/*    */   
/*    */   @NotNull
/*    */   public final GrazieAgent ReSharper(@NotNull String version) {
/* 36 */     Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("resharper", version);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\auth\GrazieAgents$DotNET.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */