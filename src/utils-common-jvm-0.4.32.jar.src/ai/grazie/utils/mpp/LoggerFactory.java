/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.slf4j.Logger;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/utils/mpp/LoggerFactory;", "", "()V", "create", "Lai/grazie/utils/mpp/MPPLogger;", "name", "", "utils-common"})
/*    */ public final class LoggerFactory
/*    */ {
/*    */   @NotNull
/*    */   public static final LoggerFactory INSTANCE = new LoggerFactory();
/*    */   
/*    */   @NotNull
/*    */   public final MPPLogger create(@NotNull String name) {
/* 43 */     Intrinsics.checkNotNullParameter(name, "name"); Logger logger = org.slf4j.LoggerFactory.getLogger(name);
/* 44 */     Intrinsics.checkNotNullExpressionValue(logger, "logger"); return new Slf4jLogger(logger);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\LoggerFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */