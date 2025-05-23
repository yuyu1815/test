/*    */ package ai.grazie.nlc;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\013\032\0020\0042\006\020\f\032\0020\rR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\016"}, d2 = {"Lai/grazie/nlc/CompletionServiceConfig$Companion;", "", "()V", "always", "Lai/grazie/nlc/CompletionServiceConfig;", "getAlways", "()Lai/grazie/nlc/CompletionServiceConfig;", "default", "getDefault", "moderate", "getModerate", "forProfile", "profile", "", "model-nlc"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final CompletionServiceConfig getAlways() {
/* 13 */     return CompletionServiceConfig.access$getAlways$cp();
/*    */   }
/*    */ 
/*    */   
/*    */   private Companion() {}
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CompletionServiceConfig getModerate() {
/* 22 */     return CompletionServiceConfig.access$getModerate$cp();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CompletionServiceConfig getDefault() {
/* 32 */     return CompletionServiceConfig.access$getDefault$cp();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final CompletionServiceConfig forProfile(@NotNull String profile) {
/* 43 */     Intrinsics.checkNotNullParameter(profile, "profile"); return Intrinsics.areEqual(profile, "Moderate") ? getModerate() : getAlways();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nlc-jvm-0.4.32.jar!\ai\grazie\nlc\CompletionServiceConfig$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */