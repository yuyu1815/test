/*    */ package ai.grazie.client.common.util;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\004¨\006\b"}, d2 = {"Lai/grazie/client/common/util/DebugHeaders;", "", "()V", "append", "Lai/grazie/client/common/model/RequestOptions;", "provideDebugInfo", "", "options", "client-common"})
/*    */ public final class DebugHeaders {
/*    */   @NotNull
/*    */   public final RequestOptions append(boolean provideDebugInfo, @NotNull RequestOptions options) {
/*  8 */     Intrinsics.checkNotNullParameter(options, "options"); if (provideDebugInfo) {
/*  9 */       String[] arrayOfString = new String[1]; arrayOfString[0] = "true"; options.getHeaders().set("Grazie-Provide-Debug-Info", arrayOfString);
/*    */     } 
/* 11 */     return options;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final DebugHeaders INSTANCE = new DebugHeaders();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\commo\\util\DebugHeaders.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */