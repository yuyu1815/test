/*   */ package com.intellij.ml.llm.activation.platform;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\003\bf\030\000 \0072\0020\001:\001\007J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\005H&¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/activation/platform/JunieActivationStateListener;", "", "productActivationStateChanged", "", "sender", "", "message", "Companion", "platform"})
/*   */ public interface JunieActivationStateListener { @NotNull
/*   */   public static final Companion Companion = Companion.$$INSTANCE;
/*   */   void productActivationStateChanged(@NotNull String paramString1, @NotNull String paramString2);
/*   */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/activation/platform/JunieActivationStateListener$Companion;", "", "<init>", "()V", "TOPIC", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/activation/platform/JunieActivationStateListener;", "getTOPIC", "()Lcom/intellij/util/messages/Topic;", "platform"})
/*   */   public static final class Companion { @NotNull
/* 7 */     private static final Topic<JunieActivationStateListener> TOPIC = new Topic(JunieActivationStateListener.class); @NotNull public final Topic<JunieActivationStateListener> getTOPIC() { return TOPIC; }
/*   */      }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\platform\JunieActivationStateListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */