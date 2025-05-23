/*    */ package org.jetbrains.jewel.foundation.util;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.logging.ConsoleHandler;
/*    */ import java.util.logging.Handler;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.ArrayIteratorKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026¨\006\b²\006\022\020\t\032\n \013*\004\030\0010\n0\nX\002"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$JavaFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$Factory;", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "category", "", "foundation", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType"})
/*    */ final class JavaFactory
/*    */   implements JewelLogger.Factory
/*    */ {
/*    */   @NotNull
/*    */   public JewelLogger getInstance(@Nullable String category) {
/* 51 */     Lazy<? extends Logger> logger$delegate = LazyKt.lazy(category::getInstance$lambda$0);
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
/* 69 */     return new JewelLogger$JavaFactory$getInstance$1(logger$delegate);
/*    */   } private static final Logger getInstance$lambda$1(Lazy $logger$delegate) { Lazy lazy = $logger$delegate; return (Logger)lazy.getValue(); } private static final Logger getInstance$lambda$0(String $category) { Logger l = Logger.getLogger($category); for (Iterator<Handler> iterator = ArrayIteratorKt.iterator((Object[])l.getHandlers()); iterator.hasNext(); ) { Handler handler1 = iterator.next(); l.removeHandler(handler1); }  ConsoleHandler handler = new ConsoleHandler(); handler.setLevel(Level.FINE); l.addHandler(handler); l.setLevel(Level.FINE); l.setUseParentHandlers(false); return l; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\005*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\b\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\t\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\n\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\013\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026¨\006\f"}, d2 = {"org/jetbrains/jewel/foundation/util/JewelLogger$JavaFactory$getInstance$1", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "trace", "", "message", "", "t", "", "debug", "info", "warn", "error", "foundation"}) public static final class JewelLogger$JavaFactory$getInstance$1 extends JewelLogger {
/* 71 */     public void trace(String message, Throwable t) { JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.FINER, message, t); }
/*    */     
/*    */     JewelLogger$JavaFactory$getInstance$1(Lazy<Logger> $logger$delegate) {}
/*    */     public void debug(String message, Throwable t) {
/* 75 */       JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.FINE, message, t);
/*    */     }
/*    */     
/*    */     public void info(String message, Throwable t) {
/* 79 */       JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.INFO, message, t);
/*    */     }
/*    */     
/*    */     public void warn(String message, Throwable t) {
/* 83 */       JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.WARNING, message, t);
/*    */     }
/*    */     
/*    */     public void error(String message, Throwable t) {
/* 87 */       JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.SEVERE, message, t);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundatio\\util\JewelLogger$JavaFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */