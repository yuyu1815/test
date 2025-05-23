/*     */ package org.jetbrains.jewel.foundation.util;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\020\003\n\000\n\002\020\000\n\002\b\006\b\"\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026J&\020\b\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\017\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\020\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\021\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\022\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J\022\020\023\032\0020\0162\b\020\006\032\004\030\0010\007H&¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$Factory;", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "category", "", "trace", "", "message", "t", "", "logger", "", "debug", "error", "warn", "info", "getLogger", "foundation"})
/*     */ abstract class ReflectionBasedFactory
/*     */   implements JewelLogger.Factory
/*     */ {
/*     */   @NotNull
/*     */   public JewelLogger getInstance(@Nullable String category) throws RuntimeException {
/*     */     try {
/*  98 */       Object logger = getLogger(category);
/*     */       
/* 100 */       return new JewelLogger$ReflectionBasedFactory$getInstance$1(logger);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 131 */     catch (Exception e) {
/* 132 */       throw new RuntimeException((Throwable)e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public abstract void trace(@Nullable String paramString, @Nullable Throwable paramThrowable, @Nullable Object paramObject) throws Exception;
/*     */   
/*     */   public abstract void debug(@Nullable String paramString, @Nullable Throwable paramThrowable, @Nullable Object paramObject) throws Exception;
/*     */   
/*     */   public abstract void error(@Nullable String paramString, @Nullable Throwable paramThrowable, @Nullable Object paramObject) throws Exception;
/*     */   
/*     */   public abstract void warn(@Nullable String paramString, @Nullable Throwable paramThrowable, @Nullable Object paramObject) throws Exception;
/*     */   
/*     */   public abstract void info(@Nullable String paramString, @Nullable Throwable paramThrowable, @Nullable Object paramObject) throws Exception;
/*     */   
/*     */   @NotNull
/*     */   public abstract Object getLogger(@Nullable String paramString) throws Exception;
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\005*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\b\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\t\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\n\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\013\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026¨\006\f"}, d2 = {"org/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory$getInstance$1", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "trace", "", "message", "", "t", "", "debug", "info", "warn", "error", "foundation"})
/*     */   public static final class JewelLogger$ReflectionBasedFactory$getInstance$1 extends JewelLogger {
/*     */     JewelLogger$ReflectionBasedFactory$getInstance$1(Object $logger) {}
/*     */     
/*     */     public void trace(String message, Throwable t) {
/*     */       try {
/*     */         JewelLogger.ReflectionBasedFactory.this.trace(message, t, this.$logger);
/*     */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*     */     public void debug(String message, Throwable t) {
/*     */       try {
/*     */         JewelLogger.ReflectionBasedFactory.this.debug(message, t, this.$logger);
/*     */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*     */     public void info(String message, Throwable t) {
/*     */       try {
/*     */         JewelLogger.ReflectionBasedFactory.this.info(message, t, this.$logger);
/*     */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*     */     public void warn(String message, Throwable t) {
/*     */       try {
/*     */         JewelLogger.ReflectionBasedFactory.this.warn(message, t, this.$logger);
/*     */       } catch (Exception exception) {}
/*     */     }
/*     */     
/*     */     public void error(String message, Throwable t) {
/*     */       try {
/*     */         JewelLogger.ReflectionBasedFactory.this.error(message, t, this.$logger);
/*     */       } catch (Exception exception) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundatio\\util\JewelLogger$ReflectionBasedFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */