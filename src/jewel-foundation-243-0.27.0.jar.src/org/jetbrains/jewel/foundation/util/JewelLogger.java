/*     */ package org.jetbrains.jewel.foundation.util;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Iterator;
/*     */ import java.util.logging.ConsoleHandler;
/*     */ import java.util.logging.Handler;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\013\b'\030\000 \0232\0020\001:\006\016\017\020\021\022\023B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\b\020\006\032\004\030\0010\007J\016\020\004\032\0020\0052\006\020\b\032\0020\tJ\020\020\n\032\0020\0052\b\020\006\032\004\030\0010\007J\016\020\n\032\0020\0052\006\020\b\032\0020\tJ\020\020\013\032\0020\0052\b\020\006\032\004\030\0010\007J\016\020\013\032\0020\0052\006\020\b\032\0020\tJ\020\020\f\032\0020\0052\b\020\006\032\004\030\0010\007J\016\020\f\032\0020\0052\006\020\b\032\0020\tJ\020\020\r\032\0020\0052\b\020\006\032\004\030\0010\007J\016\020\r\032\0020\0052\006\020\b\032\0020\tJ\034\020\004\032\0020\0052\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH&J\034\020\n\032\0020\0052\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH&J\034\020\013\032\0020\0052\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH&J\034\020\f\032\0020\0052\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH&J\034\020\r\032\0020\0052\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH&¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "", "<init>", "()V", "trace", "", "message", "", "t", "", "debug", "info", "warn", "error", "Factory", "JavaFactory", "ReflectionBasedFactory", "IdeaFactory", "Slf4JFactory", "Companion", "foundation"})
/*     */ @NonExtendable
/*     */ @StabilityInferred(parameters = 1)
/*     */ public abstract class JewelLogger {
/*     */   public final void trace(@Nullable String message) {
/*  19 */     trace(message, null);
/*     */   } public final void trace(@NotNull Throwable t) {
/*  21 */     Intrinsics.checkNotNullParameter(t, "t"); trace(t.getMessage(), t);
/*     */   } public final void debug(@Nullable String message) {
/*  23 */     debug(message, null);
/*     */   } public final void debug(@NotNull Throwable t) {
/*  25 */     Intrinsics.checkNotNullParameter(t, "t"); debug(t.getMessage(), t);
/*     */   } public final void info(@Nullable String message) {
/*  27 */     info(message, null);
/*     */   } public final void info(@NotNull Throwable t) {
/*  29 */     Intrinsics.checkNotNullParameter(t, "t"); info(t.getMessage(), t);
/*     */   } public final void warn(@Nullable String message) {
/*  31 */     warn(message, null);
/*     */   } public final void warn(@NotNull Throwable t) {
/*  33 */     Intrinsics.checkNotNullParameter(t, "t"); warn(t.getMessage(), t);
/*     */   } public final void error(@Nullable String message) {
/*  35 */     error(message, null);
/*     */   } public final void error(@NotNull Throwable t) {
/*  37 */     Intrinsics.checkNotNullParameter(t, "t"); error(t.getMessage(), t);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026¨\006\b²\006\022\020\t\032\n \013*\004\030\0010\n0\nX\002"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$JavaFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$Factory;", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "category", "", "foundation", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType"})
/*     */   private static final class JavaFactory
/*     */     implements Factory
/*     */   {
/*     */     @NotNull
/*     */     public JewelLogger getInstance(@Nullable String category) {
/*  51 */       Lazy<? extends Logger> logger$delegate = LazyKt.lazy(category::getInstance$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  69 */       return new JewelLogger$JavaFactory$getInstance$1(logger$delegate);
/*     */     } private static final Logger getInstance$lambda$1(Lazy $logger$delegate) { Lazy lazy = $logger$delegate; return (Logger)lazy.getValue(); } private static final Logger getInstance$lambda$0(String $category) { Logger l = Logger.getLogger($category); for (Iterator<Handler> iterator = ArrayIteratorKt.iterator((Object[])l.getHandlers()); iterator.hasNext(); ) { Handler handler1 = iterator.next(); l.removeHandler(handler1); }  ConsoleHandler handler = new ConsoleHandler(); handler.setLevel(Level.FINE); l.addHandler(handler); l.setLevel(Level.FINE); l.setUseParentHandlers(false); return l; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\005*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\b\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\t\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\n\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\013\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026¨\006\f"}, d2 = {"org/jetbrains/jewel/foundation/util/JewelLogger$JavaFactory$getInstance$1", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "trace", "", "message", "", "t", "", "debug", "info", "warn", "error", "foundation"}) public static final class JewelLogger$JavaFactory$getInstance$1 extends JewelLogger { JewelLogger$JavaFactory$getInstance$1(Lazy<Logger> $logger$delegate) {}
/*  71 */       public void trace(String message, Throwable t) { JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.FINER, message, t); }
/*     */ 
/*     */       
/*     */       public void debug(String message, Throwable t) {
/*  75 */         JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.FINE, message, t);
/*     */       }
/*     */       
/*     */       public void info(String message, Throwable t) {
/*  79 */         JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.INFO, message, t);
/*     */       }
/*     */       
/*     */       public void warn(String message, Throwable t) {
/*  83 */         JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.WARNING, message, t);
/*     */       }
/*     */       
/*     */       public void error(String message, Throwable t) {
/*  87 */         JewelLogger.JavaFactory.getInstance$lambda$1(this.$logger$delegate).log(Level.SEVERE, message, t);
/*     */       } }
/*     */   
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\020\003\n\000\n\002\020\000\n\002\b\006\b\"\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026J&\020\b\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\017\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\020\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\021\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J&\020\022\032\0020\t2\b\020\n\032\004\030\0010\0072\b\020\013\032\004\030\0010\f2\b\020\r\032\004\030\0010\016H&J\022\020\023\032\0020\0162\b\020\006\032\004\030\0010\007H&¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$Factory;", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "category", "", "trace", "", "message", "t", "", "logger", "", "debug", "error", "warn", "info", "getLogger", "foundation"})
/*     */   private static abstract class ReflectionBasedFactory
/*     */     implements Factory
/*     */   {
/*     */     @NotNull
/*     */     public JewelLogger getInstance(@Nullable String category) throws RuntimeException { try {
/*  98 */         Object logger = getLogger(category);
/*     */         
/* 100 */         return new JewelLogger$ReflectionBasedFactory$getInstance$1(logger);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 131 */       catch (Exception e) {
/* 132 */         throw new RuntimeException((Throwable)e);
/*     */       }  } public abstract void trace(@Nullable String param1String, @Nullable Throwable param1Throwable, @Nullable Object param1Object) throws Exception; public abstract void debug(@Nullable String param1String, @Nullable Throwable param1Throwable, @Nullable Object param1Object) throws Exception; public abstract void error(@Nullable String param1String, @Nullable Throwable param1Throwable, @Nullable Object param1Object) throws Exception; public abstract void warn(@Nullable String param1String, @Nullable Throwable param1Throwable, @Nullable Object param1Object) throws Exception; public abstract void info(@Nullable String param1String, @Nullable Throwable param1Throwable, @Nullable Object param1Object) throws Exception; @NotNull
/*     */     public abstract Object getLogger(@Nullable String param1String) throws Exception; @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\005*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\b\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\t\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\n\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026J\034\020\013\032\0020\0032\b\020\004\032\004\030\0010\0052\b\020\006\032\004\030\0010\007H\026¨\006\f"}, d2 = {"org/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory$getInstance$1", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "trace", "", "message", "", "t", "", "debug", "info", "warn", "error", "foundation"})
/*     */     public static final class JewelLogger$ReflectionBasedFactory$getInstance$1 extends JewelLogger {
/*     */       JewelLogger$ReflectionBasedFactory$getInstance$1(Object $logger) {} public void trace(String message, Throwable t) { try {
/*     */           JewelLogger.ReflectionBasedFactory.this.trace(message, t, this.$logger);
/*     */         } catch (Exception exception) {} } public void debug(String message, Throwable t) { try {
/*     */           JewelLogger.ReflectionBasedFactory.this.debug(message, t, this.$logger);
/*     */         } catch (Exception exception) {} } public void info(String message, Throwable t) { try {
/*     */           JewelLogger.ReflectionBasedFactory.this.info(message, t, this.$logger);
/*     */         } catch (Exception exception) {} } public void warn(String message, Throwable t) {
/*     */         try {
/*     */           JewelLogger.ReflectionBasedFactory.this.warn(message, t, this.$logger);
/*     */         } catch (Exception exception) {}
/*     */       } public void error(String message, Throwable t) {
/*     */         try {
/*     */           JewelLogger.ReflectionBasedFactory.this.error(message, t, this.$logger);
/*     */         } catch (Exception exception) {}
/*     */       }
/*     */     }
/*     */   } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\020\000\n\002\b\007\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J&\020\013\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\023\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\024\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\025\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\026\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J\022\020\027\032\0020\0222\b\020\030\032\004\030\0010\016H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R\016\020\007\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\005X\004¢\006\002\n\000R\016\020\t\032\0020\005X\004¢\006\002\n\000R\016\020\n\032\0020\005X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$IdeaFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory;", "<init>", "()V", "myGetInstance", "Ljava/lang/reflect/Method;", "ideaTrace", "ideaDebug", "ideaInfo", "ideaWarn", "ideaError", "trace", "", "message", "", "t", "", "logger", "", "debug", "error", "warn", "info", "getLogger", "category", "foundation"})
/*     */   private static final class IdeaFactory extends ReflectionBasedFactory {
/*     */     @NotNull
/*     */     private final Method myGetInstance; @NotNull
/*     */     private final Method ideaTrace; @NotNull
/*     */     private final Method ideaDebug; public IdeaFactory() {
/* 158 */       Class<?> loggerClass = Class.forName("com.intellij.openapi.diagnostic.Logger");
/* 159 */       Class[] arrayOfClass = new Class[1]; arrayOfClass[0] = String.class; this.myGetInstance = loggerClass.getMethod("getInstance", arrayOfClass);
/* 160 */       this.myGetInstance.setAccessible(true);
/* 161 */       arrayOfClass = new Class[1]; arrayOfClass[0] = Throwable.class; this.ideaTrace = loggerClass.getMethod("trace", arrayOfClass);
/* 162 */       this.ideaTrace.setAccessible(true);
/* 163 */       arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaDebug = loggerClass.getMethod("debug", arrayOfClass);
/* 164 */       this.ideaDebug.setAccessible(true);
/* 165 */       arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaInfo = loggerClass.getMethod("info", arrayOfClass);
/* 166 */       this.ideaInfo.setAccessible(true);
/* 167 */       arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaWarn = loggerClass.getMethod("warn", arrayOfClass);
/* 168 */       this.ideaWarn.setAccessible(true);
/* 169 */       arrayOfClass = new Class[2]; arrayOfClass[0] = String.class; arrayOfClass[1] = Throwable.class; this.ideaError = loggerClass.getMethod("error", arrayOfClass);
/* 170 */       this.ideaError.setAccessible(true);
/*     */     } @NotNull
/*     */     private final Method ideaInfo; @NotNull
/*     */     private final Method ideaWarn; @NotNull
/*     */     private final Method ideaError; public void trace(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 175 */       Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = t; this.ideaTrace.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void debug(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 180 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaDebug.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void error(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 185 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaError.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void warn(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 190 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaWarn.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void info(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 195 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.ideaInfo.invoke(logger, arrayOfObject);
/*     */     } @NotNull
/*     */     public Object getLogger(@Nullable String category) throws Exception {
/* 198 */       Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = category; Intrinsics.checkNotNullExpressionValue(this.myGetInstance.invoke(null, arrayOfObject), "invoke(...)"); return this.myGetInstance.invoke(null, arrayOfObject);
/*     */     } }
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\020\000\n\002\b\007\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J&\020\013\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\023\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\024\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\025\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J&\020\026\032\0020\f2\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\022H\026J\022\020\027\032\0020\0222\b\020\030\032\004\030\0010\016H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R\016\020\007\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\005X\004¢\006\002\n\000R\016\020\t\032\0020\005X\004¢\006\002\n\000R\016\020\n\032\0020\005X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$Slf4JFactory;", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$ReflectionBasedFactory;", "<init>", "()V", "myGetLogger", "Ljava/lang/reflect/Method;", "myTrace", "myDebug", "myInfo", "myWarn", "myError", "trace", "", "message", "", "t", "", "logger", "", "debug", "error", "warn", "info", "getLogger", "category", "foundation"})
/*     */   private static final class Slf4JFactory extends ReflectionBasedFactory { @NotNull
/*     */     private final Method myGetLogger; @NotNull
/*     */     private final Method myTrace; @NotNull
/*     */     private final Method myDebug; @NotNull
/*     */     private final Method myInfo; @NotNull
/*     */     private final Method myWarn; @NotNull
/*     */     private final Method myError;
/*     */     
/*     */     public Slf4JFactory() {
/* 210 */       Class<?> loggerFactoryClass = Class.forName("org.slf4j.LoggerFactory");
/* 211 */       Class[] arrayOfClass1 = new Class[1]; arrayOfClass1[0] = String.class; this.myGetLogger = loggerFactoryClass.getMethod("getLogger", arrayOfClass1);
/* 212 */       this.myGetLogger.setAccessible(true);
/*     */       
/* 214 */       Class<?> loggerClass = Class.forName("org.slf4j.Logger");
/* 215 */       Class[] arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myTrace = loggerClass.getMethod("trace", arrayOfClass2);
/* 216 */       this.myTrace.setAccessible(true);
/* 217 */       arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myDebug = loggerClass.getMethod("debug", arrayOfClass2);
/* 218 */       this.myDebug.setAccessible(true);
/* 219 */       arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myInfo = loggerClass.getMethod("info", arrayOfClass2);
/* 220 */       this.myInfo.setAccessible(true);
/* 221 */       arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myWarn = loggerClass.getMethod("warn", arrayOfClass2);
/* 222 */       this.myWarn.setAccessible(true);
/* 223 */       arrayOfClass2 = new Class[2]; arrayOfClass2[0] = String.class; arrayOfClass2[1] = Throwable.class; this.myError = loggerClass.getMethod("error", arrayOfClass2);
/* 224 */       this.myError.setAccessible(true);
/*     */     }
/*     */ 
/*     */     
/*     */     public void trace(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 229 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myTrace.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void debug(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 234 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myDebug.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void error(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 239 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myError.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void warn(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 244 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myWarn.invoke(logger, arrayOfObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public void info(@Nullable String message, @Nullable Throwable t, @Nullable Object logger) throws Exception {
/* 249 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = message; arrayOfObject[1] = t; this.myInfo.invoke(logger, arrayOfObject);
/*     */     } @NotNull
/*     */     public Object getLogger(@Nullable String category) throws Exception {
/* 252 */       Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = category; Intrinsics.checkNotNullExpressionValue(this.myGetLogger.invoke(null, arrayOfObject), "invoke(...)"); return this.myGetLogger.invoke(null, arrayOfObject);
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\006\032\0020\005H\002J\016\020\007\032\0020\b2\006\020\t\032\0020\nJ\022\020\007\032\0020\b2\n\020\013\032\006\022\002\b\0030\fR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$Companion;", "", "<init>", "()V", "factory", "Lorg/jetbrains/jewel/foundation/util/JewelLogger$Factory;", "createFactory", "getInstance", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "category", "", "clazz", "Ljava/lang/Class;", "foundation"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     private final JewelLogger.Factory createFactory() {
/*     */       JewelLogger.JavaFactory javaFactory;
/*     */       
/* 261 */       try { JewelLogger.IdeaFactory ideaFactory = new JewelLogger.IdeaFactory(); }
/* 262 */       catch (Throwable <unused var>)
/*     */       { JewelLogger.JavaFactory javaFactory1; 
/* 264 */         try { JewelLogger.Slf4JFactory slf4JFactory = new JewelLogger.Slf4JFactory(); }
/* 265 */         catch (Throwable throwable)
/* 266 */         { javaFactory1 = new JewelLogger.JavaFactory(); }  javaFactory = javaFactory1; }  return javaFactory;
/*     */     }
/*     */     
/*     */     @NotNull
/* 270 */     public final JewelLogger getInstance(@NotNull String category) { Intrinsics.checkNotNullParameter(category, "category"); return JewelLogger.factory.getInstance("#" + category); } @NotNull
/*     */     public final JewelLogger getInstance(@NotNull Class clazz) {
/* 272 */       Intrinsics.checkNotNullParameter(clazz, "clazz"); return getInstance("#" + clazz.getName());
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   public static final int $stable;
/*     */   @NotNull
/*     */   private static final Factory factory = Companion.createFactory();
/*     */   
/*     */   public abstract void trace(@Nullable String paramString, @Nullable Throwable paramThrowable);
/*     */   
/*     */   public abstract void debug(@Nullable String paramString, @Nullable Throwable paramThrowable);
/*     */   
/*     */   public abstract void info(@Nullable String paramString, @Nullable Throwable paramThrowable);
/*     */   
/*     */   public abstract void warn(@Nullable String paramString, @Nullable Throwable paramThrowable);
/*     */   
/*     */   public abstract void error(@Nullable String paramString, @Nullable Throwable paramThrowable);
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\bb\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H&¨\006\006"}, d2 = {"Lorg/jetbrains/jewel/foundation/util/JewelLogger$Factory;", "", "getInstance", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "category", "", "foundation"})
/*     */   private static interface Factory {
/*     */     @NotNull
/*     */     JewelLogger getInstance(@Nullable String param1String);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundatio\\util\JewelLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */