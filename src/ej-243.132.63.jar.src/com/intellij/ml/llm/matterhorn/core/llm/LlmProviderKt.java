/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmProvider;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornProperty;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlin.reflect.KType;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\032\016\020\000\032\004\030\0010\001*\0020\002H\002\032\016\020\003\032\004\030\0010\004*\0020\002H\002\032\016\020\005\032\004\030\0010\004*\0020\002H\002\032\034\020\006\032\004\030\0010\001*\0020\0022\006\020\007\032\0020\bH@¢\006\002\020\t\032\034\020\n\032\004\030\0010\001*\0020\0022\006\020\007\032\0020\bH@¢\006\002\020\t\032\032\020\013\032\0020\001*\0020\0022\006\020\007\032\0020\bH@¢\006\002\020\t\032\032\020\f\032\0020\001*\0020\0022\006\020\007\032\0020\bH@¢\006\002\020\t\032R\020\r\032\0020\016\"\006\b\000\020\017\030\001*\0020\0022\006\020\020\032\002H\0172\n\b\002\020\021\032\004\030\0010\0222\032\b\002\020\023\032\024\022\020\022\016\022\004\022\0020\001\022\004\022\0020\0010\0250\0242\006\020\007\032\0020\bHH¢\006\002\020\026¨\006\027"}, d2 = {"getDefaultUrl", "", "Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "getUrlPropertyName", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "getKeyProperty", "getUrlSafe", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeySafe", "getUrl", "getKey", "createRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "T", "body", "accessToken", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "additionalHeaders", "", "Lkotlin/Pair;", "(Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nLlmProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,124:1\n1#2:125\n14#3:126\n40#4,3:127\n*S KotlinDebug\n*F\n+ 1 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt\n*L\n78#1:126\n103#1:127,3\n*E\n"})
/*     */ public final class LlmProviderKt {
/*     */   private static final String getDefaultUrl(LlmProvider $this$getDefaultUrl) {
/*  19 */     switch (WhenMappings.$EnumSwitchMapping$0[$this$getDefaultUrl.ordinal()]) { case 1: case 2: case 3: case 4: case 5: case 6:  }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final MatterhornProperty getUrlPropertyName(LlmProvider $this$getUrlPropertyName) {
/*  30 */     switch (WhenMappings.$EnumSwitchMapping$0[$this$getUrlPropertyName.ordinal()]) { case 1: case 2: case 3: case 4: case 5: case 6:  }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final MatterhornProperty getKeyProperty(LlmProvider $this$getKeyProperty) {
/*  42 */     switch (WhenMappings.$EnumSwitchMapping$0[$this$getKeyProperty.ordinal()]) { case 1: case 2: case 3: case 4: case 5: case 6:  }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object getUrlSafe(@NotNull LlmProvider $this$getUrlSafe, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getUrlSafe$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getUrlSafe$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getUrlSafe$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #5
/*     */     //   49: aload #5
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #4
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #6
/*     */     //   61: aload #5
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 161, 0 -> 88, 1 -> 132
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokestatic getUrlPropertyName : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   97: dup
/*     */     //   98: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   101: astore_3
/*     */     //   102: aload_1
/*     */     //   103: aload_3
/*     */     //   104: aload #5
/*     */     //   106: aload #5
/*     */     //   108: aload_0
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #5
/*     */     //   114: iconst_1
/*     */     //   115: putfield label : I
/*     */     //   118: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   123: dup
/*     */     //   124: aload #6
/*     */     //   126: if_acmpne -> 148
/*     */     //   129: aload #6
/*     */     //   131: areturn
/*     */     //   132: aload #5
/*     */     //   134: getfield L$0 : Ljava/lang/Object;
/*     */     //   137: checkcast com/intellij/ml/llm/matterhorn/llm/LlmProvider
/*     */     //   140: astore_0
/*     */     //   141: aload #4
/*     */     //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   146: aload #4
/*     */     //   148: checkcast java/lang/String
/*     */     //   151: dup
/*     */     //   152: ifnonnull -> 160
/*     */     //   155: pop
/*     */     //   156: aload_0
/*     */     //   157: invokestatic getDefaultUrl : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)Ljava/lang/String;
/*     */     //   160: areturn
/*     */     //   161: new java/lang/IllegalStateException
/*     */     //   164: dup
/*     */     //   165: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   167: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   170: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 59
/*     */     //   #53	-> 93
/*     */     //   #54	-> 102
/*     */     //   #52	-> 129
/*     */     //   #54	-> 148
/*     */     //   #52	-> 161
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	39	0	$this$getUrlSafe	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   141	14	0	$this$getUrlSafe	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   155	5	0	$this$getUrlSafe	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   93	30	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   102	21	3	urlProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   0	171	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	112	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	105	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object getUrl(@NotNull LlmProvider $this$getUrl, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getUrl$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getUrl$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getUrl$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #5
/*     */     //   49: aload #5
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #4
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #6
/*     */     //   61: aload #5
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 193, 0 -> 88, 1 -> 138
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokestatic getUrlPropertyName : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   97: dup
/*     */     //   98: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   101: astore_3
/*     */     //   102: aload_1
/*     */     //   103: aload_3
/*     */     //   104: aload #5
/*     */     //   106: aload #5
/*     */     //   108: aload_0
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #5
/*     */     //   114: aload_3
/*     */     //   115: putfield L$1 : Ljava/lang/Object;
/*     */     //   118: aload #5
/*     */     //   120: iconst_1
/*     */     //   121: putfield label : I
/*     */     //   124: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   129: dup
/*     */     //   130: aload #6
/*     */     //   132: if_acmpne -> 163
/*     */     //   135: aload #6
/*     */     //   137: areturn
/*     */     //   138: aload #5
/*     */     //   140: getfield L$1 : Ljava/lang/Object;
/*     */     //   143: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornProperty
/*     */     //   146: astore_3
/*     */     //   147: aload #5
/*     */     //   149: getfield L$0 : Ljava/lang/Object;
/*     */     //   152: checkcast com/intellij/ml/llm/matterhorn/llm/LlmProvider
/*     */     //   155: astore_0
/*     */     //   156: aload #4
/*     */     //   158: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   161: aload #4
/*     */     //   163: checkcast java/lang/String
/*     */     //   166: dup
/*     */     //   167: ifnonnull -> 192
/*     */     //   170: pop
/*     */     //   171: aload_0
/*     */     //   172: invokestatic getDefaultUrl : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)Ljava/lang/String;
/*     */     //   175: dup
/*     */     //   176: ifnonnull -> 192
/*     */     //   179: pop
/*     */     //   180: new com/intellij/ml/llm/matterhorn/core/llm/UrlNotFoundException
/*     */     //   183: dup
/*     */     //   184: aload_3
/*     */     //   185: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   188: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   191: athrow
/*     */     //   192: areturn
/*     */     //   193: new java/lang/IllegalStateException
/*     */     //   196: dup
/*     */     //   197: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   199: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   202: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 59
/*     */     //   #63	-> 93
/*     */     //   #64	-> 102
/*     */     //   #62	-> 135
/*     */     //   #64	-> 163
/*     */     //   #62	-> 193
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	45	0	$this$getUrl	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   156	14	0	$this$getUrl	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   170	5	0	$this$getUrl	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   93	36	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   102	36	3	urlProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   147	23	3	urlProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   170	9	3	urlProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   179	13	3	urlProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   0	203	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	144	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	137	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object getKeySafe(@NotNull LlmProvider $this$getKeySafe, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion)
/*     */   {
/*  58 */     MatterhornProperty keyProperty = getKeyProperty($this$getKeySafe);
/*  59 */     MatterhornProperty it = keyProperty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     int $i$a$-let-LlmProviderKt$getKeySafe$2 = 0; if (propertyProvider.getProperty(keyProperty, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return propertyProvider.getProperty(keyProperty, $completion);  return (keyProperty != null) ? propertyProvider.getProperty(keyProperty, $completion) : null; } @Nullable public static final Object getKey(@NotNull LlmProvider $this$getKey, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getKey$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getKey$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$getKey$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #5
/*     */     //   49: aload #5
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #4
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #6
/*     */     //   61: aload #5
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 169, 0 -> 88, 1 -> 132
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokestatic getKeyProperty : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   97: dup
/*     */     //   98: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   101: astore_3
/*     */     //   102: aload_1
/*     */     //   103: aload_3
/*     */     //   104: aload #5
/*     */     //   106: aload #5
/*     */     //   108: aload_3
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #5
/*     */     //   114: iconst_1
/*     */     //   115: putfield label : I
/*     */     //   118: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   123: dup
/*     */     //   124: aload #6
/*     */     //   126: if_acmpne -> 148
/*     */     //   129: aload #6
/*     */     //   131: areturn
/*     */     //   132: aload #5
/*     */     //   134: getfield L$0 : Ljava/lang/Object;
/*     */     //   137: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornProperty
/*     */     //   140: astore_3
/*     */     //   141: aload #4
/*     */     //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   146: aload #4
/*     */     //   148: checkcast java/lang/String
/*     */     //   151: dup
/*     */     //   152: ifnonnull -> 168
/*     */     //   155: pop
/*     */     //   156: new com/intellij/ml/llm/matterhorn/core/llm/KeyNotFoundException
/*     */     //   159: dup
/*     */     //   160: aload_3
/*     */     //   161: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   164: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   167: athrow
/*     */     //   168: areturn
/*     */     //   169: new java/lang/IllegalStateException
/*     */     //   172: dup
/*     */     //   173: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   175: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   178: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 59
/*     */     //   #68	-> 93
/*     */     //   #69	-> 102
/*     */     //   #67	-> 129
/*     */     //   #69	-> 148
/*     */     //   #67	-> 169
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	9	0	$this$getKey	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   93	30	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   102	30	3	keyProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   141	28	3	keyProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   0	179	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	120	5	$continuation	Lkotlin/coroutines/Continuation;
/* 125 */     //   56	113	4	$result	Ljava/lang/Object; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nLlmProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$createRequest$builder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,124:1\n1863#2,2:125\n16#3,4:127\n21#3,10:149\n65#4,18:131\n*S KotlinDebug\n*F\n+ 1 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$createRequest$builder$1\n*L\n83#1:125,2\n86#1:127,4\n86#1:149,10\n86#1:131,18\n*E\n"}) public static final class LlmProviderKt$createRequest$builder$1 implements Function1<HttpRequestBuilder, Unit> { public final void invoke(HttpRequestBuilder $this$request) { Intrinsics.checkNotNullParameter($this$request, "$this$request"); HttpMessagePropertiesKt.contentType((HttpMessageBuilder)$this$request, ContentType.Application.INSTANCE.getJson()); UtilsKt.accept((HttpMessageBuilder)$this$request, ContentType.Text.INSTANCE.getEventStream()); Iterable<Pair<String, String>> $this$forEach$iv = this.$additionalHeaders; int $i$f$forEach = 0; Iterator<Pair<String, String>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<String, String> element$iv = (Object<String, String>)iterator.next(); Pair pair = (Pair)element$iv; int $i$a$-forEach-LlmProviderKt$createRequest$builder$1$1 = 0; String name = (String)pair.component1(), value = (String)pair.component2(); $this$request.getHeaders().append(name, value); }
/*     */        $this$request.setMethod(HttpMethod.Companion.getPost()); HttpRequestBuilder httpRequestBuilder = $this$request; Object body$iv = this.$body; int $i$f$setBody = 0;
/* 127 */       Object object1 = body$iv;
/* 128 */       if (object1 == null) {
/* 129 */         KType kType1; httpRequestBuilder.setBody(NullBody.INSTANCE);
/* 130 */         HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0;
/* 131 */         Intrinsics.reifiedOperationMarker(4, "T"); KClass kClass1 = Reflection.getOrCreateKotlinClass(Object.class); int $i$f$typeOfOrNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 145 */           Intrinsics.reifiedOperationMarker(6, "T"); kType1 = null;
/* 146 */         } catch (Throwable <unused var>$iv$iv$iv) {
/* 147 */           kType1 = (KType)null;
/* 148 */         }  KType kType2 = kType1; KClass kClass2 = kClass1; httpRequestBuilder1.setBodyType(new TypeInfo(kClass2, kType2));
/* 149 */       } else if (object1 instanceof io.ktor.http.content.OutgoingContent) {
/* 150 */         httpRequestBuilder.setBody(body$iv);
/* 151 */         httpRequestBuilder.setBodyType(null);
/*     */       } else {
/*     */         
/* 154 */         httpRequestBuilder.setBody(body$iv);
/* 155 */         HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0;
/*     */         Intrinsics.reifiedOperationMarker(4, "T");
/*     */         KClass kClass = Reflection.getOrCreateKotlinClass(Object.class);
/*     */         int $i$f$typeOfOrNull = 0;
/*     */       }  }
/*     */ 
/*     */     
/*     */     public LlmProviderKt$createRequest$builder$1(List<Pair<String, String>> $additionalHeaders, Object $body) {} }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "LlmProvider.kt", l = {69}, i = {0}, s = {"L$0"}, n = {"keyProperty"}, m = "getKey", c = "com.intellij.ml.llm.matterhorn.core.llm.LlmProviderKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LlmProviderKt$getKey$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     LlmProviderKt$getKey$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmProviderKt.getKey(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmProvider.kt", l = {64}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$getUrl", "urlProperty"}, m = "getUrl", c = "com.intellij.ml.llm.matterhorn.core.llm.LlmProviderKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LlmProviderKt$getUrl$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LlmProviderKt$getUrl$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmProviderKt.getUrl(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmProvider.kt", l = {54}, i = {0}, s = {"L$0"}, n = {"$this$getUrlSafe"}, m = "getUrlSafe", c = "com.intellij.ml.llm.matterhorn.core.llm.LlmProviderKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LlmProviderKt$getUrlSafe$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     LlmProviderKt$getUrlSafe$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmProviderKt.getUrlSafe(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\LlmProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */