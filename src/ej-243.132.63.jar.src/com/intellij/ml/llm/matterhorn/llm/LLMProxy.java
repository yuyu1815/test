/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\003\bf\030\0002\0020\001J4\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\024\b\002\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\tH¦@¢\006\002\020\fJj\020\r\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\016\032\0020\0172.\020\020\032*\b\001\022\004\022\0020\005\022\004\022\0020\007\022\004\022\0020\017\022\n\022\b\022\004\022\0020\0030\022\022\006\022\004\030\0010\0010\0212\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\tH@¢\006\002\020\023J2\020\024\032\0020\0032\"\020\025\032\036\b\001\022\004\022\0020\027\022\n\022\b\022\004\022\0020\0030\022\022\006\022\004\030\0010\0010\026H¦@¢\006\002\020\030R\024\020\031\032\0020\0328VX\004¢\006\006\032\004\b\033\020\034¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "", "sendChat", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "eventHandler", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWithTracking", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "request", "Lkotlin/Function4;", "Lkotlin/coroutines/Continuation;", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWithRecovery", "send", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imagesSupported", "", "getImagesSupported", "()Z", "core"})
/*     */ public interface LLMProxy
/*     */ {
/*     */   @Nullable
/*     */   Object sendChat(@NotNull MatterhornChat paramMatterhornChat, @NotNull ModelParameters paramModelParameters, @NotNull Function1<? super CustomArtifactEvent, Unit> paramFunction1, @NotNull Continuation<? super AIAnswer> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object sendWithTracking(@NotNull MatterhornChat paramMatterhornChat, @NotNull ModelParameters paramModelParameters, @NotNull MatterhornPropertyProvider paramMatterhornPropertyProvider, @NotNull Function4<? super MatterhornChat, ? super ModelParameters, ? super MatterhornPropertyProvider, ? super Continuation<? super AIAnswer>, ? extends Object> paramFunction4, @NotNull Function1<? super CustomArtifactEvent, Unit> paramFunction1, @NotNull Continuation<? super AIAnswer> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object sendWithRecovery(@NotNull Function2<? super Integer, ? super Continuation<? super AIAnswer>, ? extends Object> paramFunction2, @NotNull Continuation<? super AIAnswer> paramContinuation);
/*     */   
/*     */   boolean getImagesSupported();
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     private static Unit sendChat$lambda$0(CustomArtifactEvent it) {
/*  74 */       Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public static Object sendWithTracking(@NotNull LLMProxy $this, @NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Function4<? super MatterhornChat, ? super ModelParameters, ? super MatterhornPropertyProvider, ? super Continuation<? super AIAnswer>, ? extends Object> request, @NotNull Function1<? super CustomArtifactEvent, Unit> eventHandler, @NotNull Continuation<? super AIAnswer> $completion) {
/*  85 */       return $this.sendWithRecovery(new LLMProxy$sendWithTracking$2(eventHandler, chat, modelParameters, request, propertyProvider, null), $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static boolean getImagesSupported(@NotNull LLMProxy $this) {
/* 104 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\LLMProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */