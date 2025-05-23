/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import java.util.Arrays;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.PropertyKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J0\020\004\032\0070\005¢\006\002\b\0062\b\b\001\020\007\032\0020\0052\022\020\b\032\n\022\006\b\001\022\0020\n0\t\"\0020\nH\007¢\006\002\020\013J1\020\f\032\b\022\004\022\0020\0050\r2\b\b\001\020\007\032\0020\0052\022\020\b\032\n\022\006\b\001\022\0020\n0\t\"\0020\nH\007¢\006\002\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EJCoreBundle;", "Lcom/intellij/DynamicBundle;", "<init>", "()V", "message", "", "Lorg/jetbrains/annotations/Nls;", "key", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "messagePointer", "Ljava/util/function/Supplier;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/function/Supplier;", "ej-core"})
/*    */ public final class EJCoreBundle extends DynamicBundle {
/*    */   private EJCoreBundle() {
/* 10 */     super("messages.EJCoreBundle");
/*    */   } @NotNull
/*    */   public static final EJCoreBundle INSTANCE = new EJCoreBundle(); @JvmStatic
/*    */   @NotNull
/*    */   public static final String message(@PropertyKey(resourceBundle = "messages.EJCoreBundle") @NotNull String key, @NotNull Object... params) {
/* 15 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(params, "params"); return INSTANCE.getMessage(key, Arrays.copyOf(params, params.length));
/*    */   }
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final Supplier<String> messagePointer(@PropertyKey(resourceBundle = "messages.EJCoreBundle") @NotNull String key, @NotNull Object... params) {
/* 20 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(params, "params"); return INSTANCE.getLazyMessage(key, Arrays.copyOf(params, params.length));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EJCoreBundle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */