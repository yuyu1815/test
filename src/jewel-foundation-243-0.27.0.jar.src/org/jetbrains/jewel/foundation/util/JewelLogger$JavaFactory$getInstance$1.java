/*    */ package org.jetbrains.jewel.foundation.util;
/*    */ 
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\005*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\b\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\t\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\n\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\013\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026¨\006\f"}, d2 = {"org/jetbrains/jewel/foundation/util/JewelLogger$JavaFactory$getInstance$1", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "trace", "", "message", "", "t", "", "debug", "info", "warn", "error", "foundation"})
/*    */ public final class JewelLogger$JavaFactory$getInstance$1
/*    */   extends JewelLogger
/*    */ {
/*    */   JewelLogger$JavaFactory$getInstance$1(Lazy<Logger> $logger$delegate) {}
/*    */   
/*    */   public void trace(String message, Throwable t) {
/* 71 */     JewelLogger.JavaFactory.access$getInstance$lambda$1(this.$logger$delegate).log(Level.FINER, message, t);
/*    */   }
/*    */   
/*    */   public void debug(String message, Throwable t) {
/* 75 */     JewelLogger.JavaFactory.access$getInstance$lambda$1(this.$logger$delegate).log(Level.FINE, message, t);
/*    */   }
/*    */   
/*    */   public void info(String message, Throwable t) {
/* 79 */     JewelLogger.JavaFactory.access$getInstance$lambda$1(this.$logger$delegate).log(Level.INFO, message, t);
/*    */   }
/*    */   
/*    */   public void warn(String message, Throwable t) {
/* 83 */     JewelLogger.JavaFactory.access$getInstance$lambda$1(this.$logger$delegate).log(Level.WARNING, message, t);
/*    */   }
/*    */   
/*    */   public void error(String message, Throwable t) {
/* 87 */     JewelLogger.JavaFactory.access$getInstance$lambda$1(this.$logger$delegate).log(Level.SEVERE, message, t);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundatio\\util\JewelLogger$JavaFactory$getInstance$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */