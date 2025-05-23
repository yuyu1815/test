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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\020\000\n\002\b\007\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J&\020\013\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\023\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\024\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\025\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\026\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J\022\020\027\032\0020\0222\b\020\030\032\004\030\0010\016H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R\016\020\007\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\005X\004¢\006\002\n\000R\016\020\t\032\0020\005X\004¢\006\002\n\000R\016\020\n\032\0020\005X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$Slf4JFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory;", "<init>", "()V", "myGetLogger", "Ljava/lang/reflect/Method;", "myTrace", "myDebug", "myInfo", "myWarn", "myError", "trace", "", "message", "", "t", "", "logger", "", "debug", "error", "warn", "info", "getLogger", "category", "foundation"})
/*     */ final class Slf4JFactory
/*     */   extends JewelLogger.ReflectionBasedFactory
/*     */ {
/*     */   @NotNull
/*     */   private final Method myGetLogger;
/*     */   @NotNull
/*     */   private final Method myTrace;
/*     */   @NotNull
/*     */   private final Method myDebug;
/*     */   @NotNull
/*     */   private final Method myInfo;
/*     */   @NotNull
/*     */   private final Method myWarn;
/*     */   @NotNull
/*     */   private final Method myError;
/*     */   
/*     */   public Slf4JFactory() {
/* 210 */     Class<?> loggerFactoryClass = Class.forName("org.slf4j.LoggerFactory");
/* 211 */     Class[] arrayOfClass1 = new Class[1]; arrayOfClass1[0] = String.class; this.myGetLogger = loggerFactoryClass.getMethod("getLogger", arrayOfClass1);
/* 212 */     this.myGetLogger.setAccessible(true);
/*     */     
/* 214 */     Class<?> loggerClass = Class.forName("org.slf4j.Logger");
/* 215 */     Class[] arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myTrace = loggerClass.getMethod("trace", arrayOfClass2);
/* 216 */     this.myTrace.setAccessible(true);
/* 217 */     arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myDebug = loggerClass.getMethod("debug", arrayOfClass2);
/* 218 */     this.myDebug.setAccessible(true);
/* 219 */     arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myInfo = loggerClass.getMethod("info", arrayOfClass2);
/* 220 */     this.myInfo.setAccessible(true);
/* 221 */     arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myWarn = loggerClass.getMethod("warn", arrayOfClass2);
/* 222 */     this.myWarn.setAccessible(true);
/* 223 */     arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myError = loggerClass.getMethod("error", arrayOfClass2);
/* 224 */     this.myError.setAccessible(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void trace(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 229 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myTrace.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void debug(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 234 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myDebug.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void error(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 239 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myError.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void warn(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 244 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myWarn.invoke(logger, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void info(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 249 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myInfo.invoke(logger, arrayOfObject);
/*     */   } @NotNull
/*     */   public Object getLogger(@Nullable String category) throws Exception {
/* 252 */     Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = category; Intrinsics.checkNotNullExpressionValue(this.myGetLogger.invoke(null, arrayOfObject), "invoke(...)"); return this.myGetLogger.invoke(null, arrayOfObject);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundatio\\util\JewelLogger$Slf4JFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */