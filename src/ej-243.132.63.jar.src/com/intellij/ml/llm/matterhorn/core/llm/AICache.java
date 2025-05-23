/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*    */ import com.intellij.ml.llm.matterhorn.configuration.Env;
/*    */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\bf\030\000 \f2\0020\001:\001\fJ<\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\034\020\b\032\030\b\001\022\n\022\b\022\004\022\0020\0030\n\022\006\022\004\030\0010\0010\tH¦@¢\006\002\020\013¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "", "lookupOrBuild", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "builder", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "core-llm"})
/*    */ public interface AICache {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   @NotNull
/*    */   public static final String MATTERHORN_REDIS_ENV_VAR = "MATTERHORN_REDIS";
/*    */   @NotNull
/*    */   public static final String MATTERHORN_REDIS_WITHOUT_SSL_ENV_VAR = "MATTERHORN_REDIS_WITHOUT_SSL";
/*    */   
/*    */   @Nullable
/*    */   Object lookupOrBuild(@NotNull MatterhornChat paramMatterhornChat, @NotNull ModelParameters paramModelParameters, @NotNull Function1<? super Continuation<? super AIAnswer>, ? extends Object> paramFunction1, @NotNull Continuation<? super AIAnswer> paramContinuation);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fR\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/AICache$Companion;", "", "<init>", "()V", "MATTERHORN_REDIS_ENV_VAR", "", "MATTERHORN_REDIS_WITHOUT_SSL_ENV_VAR", "create", "Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "config", "Lcom/intellij/ml/llm/matterhorn/configuration/Env;", "caches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "core-llm"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public static final String MATTERHORN_REDIS_ENV_VAR = "MATTERHORN_REDIS";
/*    */     
/*    */     @NotNull
/*    */     public final AICache create(@NotNull Env config, @NotNull MatterhornCaches caches) {
/* 35 */       Intrinsics.checkNotNullParameter(config, "config"); Intrinsics.checkNotNullParameter(caches, "caches");
/*    */       
/* 37 */       String redis = System.getenv("MATTERHORN_REDIS");
/* 38 */       CharSequence charSequence = redis; return config.getHasRedisCache() ? (!((charSequence == null || StringsKt.isBlank(charSequence)) ? 1 : 0) ? 
/* 39 */         new RedisAICaches(redis) : (
/* 40 */         config.getHasLocalCache() ? 
/* 41 */         new LocalAICaches(caches) : 
/*    */         
/* 43 */         new EmptyAICache())) : (
/*    */ 
/*    */ 
/*    */         
/* 47 */         config.getHasLocalCache() ? new LocalAICaches(caches) : 
/* 48 */         new EmptyAICache());
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public static final String MATTERHORN_REDIS_WITHOUT_SSL_ENV_VAR = "MATTERHORN_REDIS_WITHOUT_SSL";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\AICache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */