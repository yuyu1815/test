/*     */ package org.jetbrains.jewel.foundation.util;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\020\000\n\002\b\007\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J&\020\013\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\023\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\024\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\025\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\026\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J\022\020\027\032\0020\0222\b\020\030\032\004\030\0010\016H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R\016\020\007\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\005X\004¢\006\002\n\000R\016\020\t\032\0020\005X\004¢\006\002\n\000R\016\020\n\032\0020\005X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$IdeaFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory;", "<init>", "()V", "myGetInstance", "Ljava/lang/reflect/Method;", "ideaTrace", "ideaDebug", "ideaInfo", "ideaWarn", "ideaError", "trace", "", "message", "", "t", "", "logger", "", "debug", "error", "warn", "info", "getLogger", "category", "foundation"})
/*     */ final class IdeaFactory
/*     */   extends JewelLogger.ReflectionBasedFactory
/*     */ {
/*     */   @NotNull
/*     */   private final Method myGetInstance;
/*     */   @NotNull
/*     */   private final Method ideaTrace;
/*     */   @NotNull
/*     */   private final Method ideaDebug;
/*     */   @NotNull
/*     */   private final Method ideaInfo;
/*     */   @NotNull
/*     */   private final Method ideaWarn;
/*     */   @NotNull
/*     */   private final Method ideaError;
/*     */   
/*     */   public IdeaFactory() {
/* 158 */     Class<?> loggerClass = Class.forName("com.intellij.openapi.diagnostic.Logger");
/* 159 */     Class[] arrayOfClass = new Class[1]; arrayOfClass[0] = String.class; this.myGetInstance = loggerClass.getMethod("getInstance", arrayOfClass);
/* 160 */     this.myGetInstance.setAccessible(true);
/* 161 */     arrayOfClass = new Class[1]; arrayOfClass[0] = Throwable.class; this.ideaTrace = loggerClass.getMethod("trace", arrayOfClass);
/* 162 */     this.ideaTrace.setAccessible(true);
/* 163 */     arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaDebug = loggerClass.getMethod("debug", arrayOfClass);
/* 164 */     this.ideaDebug.setAccessible(true);
/* 165 */     arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaInfo = loggerClass.getMethod("info", arrayOfClass);
/* 166 */     this.ideaInfo.setAccessible(true);
/* 167 */     arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaWarn = loggerClass.getMethod("warn", arrayOfClass);
/* 168 */     this.ideaWarn.setAccessible(true);
/* 169 */     arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaError = loggerClass.getMethod("error", arrayOfClass);
/* 170 */     this.ideaError.setAccessible(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void trace(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 175 */     Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = t; this.ideaTrace.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void debug(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 180 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaDebug.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void error(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 185 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaError.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void warn(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 190 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaWarn.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void info(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 195 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaInfo.invoke(logger, arrayOfObject);
/*     */   } @NotNull
/*     */   public Object getLogger(@Nullable String category) throws Exception {
/* 198 */     Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = category; Intrinsics.checkNotNullExpressionValue(this.myGetInstance.invoke(null, arrayOfObject), "invoke(...)"); return this.myGetInstance.invoke(null, arrayOfObject);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundatio\\util\JewelLogger$IdeaFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */