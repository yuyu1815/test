/*    */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*    */ 
/*    */ import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
/*    */ import ai.grazie.api.gateway.client.UrlResolver;
/*    */ import com.intellij.ml.llm.activation.data.model.LlmModelId;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieApiUrl;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthJwt;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthOrigin;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieGrazieRepository;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.datetime.Instant;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\036\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH@¢\006\004\b\t\020\nJ&\020\013\032\b\022\004\022\0020\f0\0052\006\020\r\032\0020\0062\006\020\016\032\0020\017H@¢\006\004\b\020\020\021J&\020\022\032\b\022\004\022\0020\f0\0052\006\020\r\032\0020\0062\006\020\016\032\0020\017H@¢\006\004\b\023\020\021J.\020\024\032\b\022\004\022\0020\0250\0052\006\020\r\032\0020\0062\006\020\016\032\0020\0172\006\020\026\032\0020\027H@¢\006\004\b\030\020\031J&\020\032\032\b\022\004\022\0020\0330\0052\006\020\r\032\0020\0062\006\020\034\032\0020\035H@¢\006\004\b\036\020\037J&\020 \032\b\022\004\022\0020\0250\0052\006\020\r\032\0020\0062\006\020\034\032\0020\035H@¢\006\004\b!\020\037J\027\020\"\032\0020\0352\006\020#\032\0020\025H\026¢\006\004\b$\020%J,\020&\032\016\022\n\022\b\022\004\022\0020(0'0\0052\006\020\r\032\0020\0062\006\020\034\032\0020\035H@¢\006\004\b)\020\037J\030\020*\032\0020+2\006\020\007\032\0020\bH@¢\006\004\b,\020\nJ \020-\032\0020.2\006\020\r\032\0020\0062\006\020\034\032\0020\035H@¢\006\004\b/\020\037J\030\0200\032\0020.2\006\020\r\032\0020\006H@¢\006\004\b1\020\n¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;", "<init>", "()V", "resolveApiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "configJsonUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieConfigJsonUrl;", "resolveApiUrl-7oKCuCM", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jbaUserInfo", "", "url", "jbaIdToken", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken;", "jbaUserInfo-mvY-0G4", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jbaRegister", "jbaRegister-mvY-0G4", "jbaProvideAccess", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt;", "aipLicenseId", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseId;", "jbaProvideAccess-SRYjgCQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyToken", "Lkotlinx/datetime/Instant;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "verifyToken-1CSWKTE", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "refreshToken-1CSWKTE", "authJwtToAuthData", "authJwt", "authJwtToAuthData-cj1q3Zw", "(Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "listAvailableModels", "", "Lcom/intellij/ml/llm/activation/data/model/LlmModelId;", "listAvailableModels-1CSWKTE", "urlResolver", "Lai/grazie/api/gateway/client/UrlResolver;", "urlResolver-7oKCuCM", "authorizedClient", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "authorizedClient-1CSWKTE", "unauthorizedClient", "unauthorizedClient-62T2iwg", "data.impl.grazie"})
/*    */ @SourceDebugExtension({"SMAP\nJunieGrazieRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieGrazieRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl\n+ 2 JunieGrazieRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImplKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n103#2,3:111\n103#2,3:114\n103#2,3:117\n103#2,3:120\n103#2,3:123\n103#2,3:126\n103#2,2:129\n105#2:135\n1557#3:131\n1628#3,3:132\n*S KotlinDebug\n*F\n+ 1 JunieGrazieRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl\n*L\n19#1:111,3\n32#1:114,3\n39#1:117,3\n51#1:120,3\n60#1:123,3\n69#1:126,3\n84#1:129,2\n84#1:135\n86#1:131\n86#1:132,3\n*E\n"})
/*    */ final class JunieGrazieRepositoryImpl
/*    */   implements JunieGrazieRepository
/*    */ {
/*    */   @Nullable
/*    */   public Object resolveApiUrl-7oKCuCM(@NotNull String configJsonUrl, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$resolveApiUrl$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$resolveApiUrl$1
/*    */     //   11: astore #15
/*    */     //   13: aload #15
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #15
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$resolveApiUrl$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #15
/*    */     //   50: aload #15
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #14
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #16
/*    */     //   62: aload #15
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 324, 0 -> 92, 1 -> 119, 2 -> 184
/*    */     //   92: aload #14
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload #15
/*    */     //   101: aload #15
/*    */     //   103: iconst_1
/*    */     //   104: putfield label : I
/*    */     //   107: invokespecial urlResolver-7oKCuCM : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   110: dup
/*    */     //   111: aload #16
/*    */     //   113: if_acmpne -> 126
/*    */     //   116: aload #16
/*    */     //   118: areturn
/*    */     //   119: aload #14
/*    */     //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   124: aload #14
/*    */     //   126: checkcast ai/grazie/api/gateway/client/UrlResolver
/*    */     //   129: astore_3
/*    */     //   130: aload_3
/*    */     //   131: astore #4
/*    */     //   133: iconst_0
/*    */     //   134: istore #5
/*    */     //   136: aload #4
/*    */     //   138: astore #6
/*    */     //   140: nop
/*    */     //   141: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   144: pop
/*    */     //   145: aload #6
/*    */     //   147: astore #7
/*    */     //   149: iconst_0
/*    */     //   150: istore #8
/*    */     //   152: aload #7
/*    */     //   154: astore #9
/*    */     //   156: iconst_0
/*    */     //   157: istore #10
/*    */     //   159: aload #9
/*    */     //   161: aconst_null
/*    */     //   162: aload #15
/*    */     //   164: iconst_1
/*    */     //   165: aconst_null
/*    */     //   166: aload #15
/*    */     //   168: iconst_2
/*    */     //   169: putfield label : I
/*    */     //   172: invokestatic resolve$default : (Lai/grazie/api/gateway/client/UrlResolver;Lai/grazie/api/gateway/client/CloudProvider;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   175: dup
/*    */     //   176: aload #16
/*    */     //   178: if_acmpne -> 201
/*    */     //   181: aload #16
/*    */     //   183: areturn
/*    */     //   184: iconst_0
/*    */     //   185: istore #5
/*    */     //   187: iconst_0
/*    */     //   188: istore #8
/*    */     //   190: iconst_0
/*    */     //   191: istore #10
/*    */     //   193: nop
/*    */     //   194: aload #14
/*    */     //   196: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   199: aload #14
/*    */     //   201: checkcast ai/grazie/api/gateway/client/ResolutionResult
/*    */     //   204: astore #11
/*    */     //   206: aload #11
/*    */     //   208: astore #12
/*    */     //   210: aload #12
/*    */     //   212: instanceof ai/grazie/api/gateway/client/ResolutionResult$Failure
/*    */     //   215: ifeq -> 233
/*    */     //   218: aload #11
/*    */     //   220: checkcast ai/grazie/api/gateway/client/ResolutionResult$Failure
/*    */     //   223: invokevirtual getProblems : ()Ljava/util/List;
/*    */     //   226: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   229: checkcast java/lang/Throwable
/*    */     //   232: athrow
/*    */     //   233: aload #12
/*    */     //   235: instanceof ai/grazie/api/gateway/client/ResolutionResult$FallbackUrl
/*    */     //   238: ifeq -> 252
/*    */     //   241: aload #11
/*    */     //   243: checkcast ai/grazie/api/gateway/client/ResolutionResult$FallbackUrl
/*    */     //   246: invokevirtual getUrl : ()Ljava/lang/String;
/*    */     //   249: goto -> 279
/*    */     //   252: aload #12
/*    */     //   254: instanceof ai/grazie/api/gateway/client/ResolutionResult$Success
/*    */     //   257: ifeq -> 271
/*    */     //   260: aload #11
/*    */     //   262: checkcast ai/grazie/api/gateway/client/ResolutionResult$Success
/*    */     //   265: invokevirtual getUrl : ()Ljava/lang/String;
/*    */     //   268: goto -> 279
/*    */     //   271: new kotlin/NoWhenBranchMatchedException
/*    */     //   274: dup
/*    */     //   275: invokespecial <init> : ()V
/*    */     //   278: athrow
/*    */     //   279: astore #13
/*    */     //   281: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl$Companion;
/*    */     //   284: aload #13
/*    */     //   286: invokevirtual fromResolvedUrl-kmrddwU : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   289: invokestatic box-impl : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;
/*    */     //   292: nop
/*    */     //   293: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   296: astore #7
/*    */     //   298: goto -> 317
/*    */     //   301: astore #8
/*    */     //   303: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   306: pop
/*    */     //   307: aload #8
/*    */     //   309: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   312: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   315: astore #7
/*    */     //   317: aload #7
/*    */     //   319: invokestatic toGrazieResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */     //   322: nop
/*    */     //   323: areturn
/*    */     //   324: new java/lang/IllegalStateException
/*    */     //   327: dup
/*    */     //   328: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   330: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   333: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 60
/*    */     //   #17	-> 97
/*    */     //   #16	-> 116
/*    */     //   #19	-> 130
/*    */     //   #111	-> 136
/*    */     //   #112	-> 152
/*    */     //   #20	-> 159
/*    */     //   #16	-> 181
/*    */     //   #21	-> 206
/*    */     //   #22	-> 210
/*    */     //   #23	-> 233
/*    */     //   #24	-> 252
/*    */     //   #21	-> 271
/*    */     //   #26	-> 281
/*    */     //   #112	-> 292
/*    */     //   #111	-> 293
/*    */     //   #113	-> 319
/*    */     //   #111	-> 322
/*    */     //   #19	-> 323
/*    */     //   #16	-> 324
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	13	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;
/*    */     //   97	13	1	configJsonUrl	Ljava/lang/String;
/*    */     //   130	3	3	urlResolver	Lai/grazie/api/gateway/client/UrlResolver;
/*    */     //   133	7	4	$this$runCatchingGrazie$iv	Ljava/lang/Object;
/*    */     //   149	7	7	$this$runCatchingGrazie_u24lambda_u240$iv	Ljava/lang/Object;
/*    */     //   156	19	9	$this$resolveApiUrl_7oKCuCM_u24lambda_u240	Lai/grazie/api/gateway/client/UrlResolver;
/*    */     //   206	27	11	resolutionResult	Lai/grazie/api/gateway/client/ResolutionResult;
/*    */     //   233	19	11	resolutionResult	Lai/grazie/api/gateway/client/ResolutionResult;
/*    */     //   252	19	11	resolutionResult	Lai/grazie/api/gateway/client/ResolutionResult;
/*    */     //   281	8	13	resolvedUrl	Ljava/lang/String;
/*    */     //   159	25	10	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$resolveApiUrl$2	I
/*    */     //   152	32	8	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   136	48	5	$i$f$runCatchingGrazie	I
/*    */     //   0	334	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	274	15	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	267	14	$result	Ljava/lang/Object;
/*    */     //   193	96	10	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$resolveApiUrl$2	I
/*    */     //   190	103	8	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   187	136	5	$i$f$runCatchingGrazie	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   140	175	301	java/lang/Throwable
/*    */     //   193	298	301	java/lang/Throwable
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object jbaUserInfo-mvY-0G4(@NotNull String url, @NotNull String jbaIdToken, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaUserInfo$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaUserInfo$1
/*    */     //   11: astore #13
/*    */     //   13: aload #13
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #13
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaUserInfo$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 261, 0 -> 92, 1 -> 125, 2 -> 208
/*    */     //   92: aload #12
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload #13
/*    */     //   101: aload #13
/*    */     //   103: aload_2
/*    */     //   104: putfield L$0 : Ljava/lang/Object;
/*    */     //   107: aload #13
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokespecial unauthorizedClient-62T2iwg : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   116: dup
/*    */     //   117: aload #14
/*    */     //   119: if_acmpne -> 141
/*    */     //   122: aload #14
/*    */     //   124: areturn
/*    */     //   125: aload #13
/*    */     //   127: getfield L$0 : Ljava/lang/Object;
/*    */     //   130: checkcast java/lang/String
/*    */     //   133: astore_2
/*    */     //   134: aload #12
/*    */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   139: aload #12
/*    */     //   141: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*    */     //   144: invokevirtual auth : ()Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   147: astore #4
/*    */     //   149: aload #4
/*    */     //   151: astore #5
/*    */     //   153: iconst_0
/*    */     //   154: istore #6
/*    */     //   156: aload #5
/*    */     //   158: astore #7
/*    */     //   160: nop
/*    */     //   161: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   164: pop
/*    */     //   165: aload #7
/*    */     //   167: astore #8
/*    */     //   169: iconst_0
/*    */     //   170: istore #9
/*    */     //   172: aload #8
/*    */     //   174: astore #10
/*    */     //   176: iconst_0
/*    */     //   177: istore #11
/*    */     //   179: aload #10
/*    */     //   181: aload_2
/*    */     //   182: aload #13
/*    */     //   184: aload #13
/*    */     //   186: aconst_null
/*    */     //   187: putfield L$0 : Ljava/lang/Object;
/*    */     //   190: aload #13
/*    */     //   192: iconst_2
/*    */     //   193: putfield label : I
/*    */     //   196: invokevirtual userInfo : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   199: dup
/*    */     //   200: aload #14
/*    */     //   202: if_acmpne -> 225
/*    */     //   205: aload #14
/*    */     //   207: areturn
/*    */     //   208: iconst_0
/*    */     //   209: istore #6
/*    */     //   211: iconst_0
/*    */     //   212: istore #9
/*    */     //   214: iconst_0
/*    */     //   215: istore #11
/*    */     //   217: nop
/*    */     //   218: aload #12
/*    */     //   220: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   223: aload #12
/*    */     //   225: pop
/*    */     //   226: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   229: nop
/*    */     //   230: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   233: astore #8
/*    */     //   235: goto -> 254
/*    */     //   238: astore #9
/*    */     //   240: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   243: pop
/*    */     //   244: aload #9
/*    */     //   246: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   249: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   252: astore #8
/*    */     //   254: aload #8
/*    */     //   256: invokestatic toGrazieResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */     //   259: nop
/*    */     //   260: areturn
/*    */     //   261: new java/lang/IllegalStateException
/*    */     //   264: dup
/*    */     //   265: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   267: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   270: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 60
/*    */     //   #31	-> 97
/*    */     //   #30	-> 122
/*    */     //   #31	-> 141
/*    */     //   #32	-> 149
/*    */     //   #114	-> 156
/*    */     //   #115	-> 172
/*    */     //   #33	-> 179
/*    */     //   #30	-> 205
/*    */     //   #34	-> 225
/*    */     //   #115	-> 229
/*    */     //   #114	-> 230
/*    */     //   #116	-> 256
/*    */     //   #114	-> 259
/*    */     //   #32	-> 260
/*    */     //   #30	-> 261
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	19	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;
/*    */     //   97	19	1	url	Ljava/lang/String;
/*    */     //   97	28	2	jbaIdToken	Ljava/lang/String;
/*    */     //   134	65	2	jbaIdToken	Ljava/lang/String;
/*    */     //   149	4	4	apiClient	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   153	7	5	$this$runCatchingGrazie$iv	Ljava/lang/Object;
/*    */     //   169	7	8	$this$runCatchingGrazie_u24lambda_u240$iv	Ljava/lang/Object;
/*    */     //   176	23	10	$this$jbaUserInfo_mvY_0G4_u24lambda_u241	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   179	29	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$jbaUserInfo$2	I
/*    */     //   172	36	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   156	52	6	$i$f$runCatchingGrazie	I
/*    */     //   0	271	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	211	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	204	12	$result	Ljava/lang/Object;
/*    */     //   217	9	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$jbaUserInfo$2	I
/*    */     //   214	16	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   211	49	6	$i$f$runCatchingGrazie	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   160	199	238	java/lang/Throwable
/*    */     //   217	235	238	java/lang/Throwable
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object jbaRegister-mvY-0G4(@NotNull String url, @NotNull String jbaIdToken, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaRegister$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaRegister$1
/*    */     //   11: astore #13
/*    */     //   13: aload #13
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #13
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaRegister$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 261, 0 -> 92, 1 -> 125, 2 -> 208
/*    */     //   92: aload #12
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload #13
/*    */     //   101: aload #13
/*    */     //   103: aload_2
/*    */     //   104: putfield L$0 : Ljava/lang/Object;
/*    */     //   107: aload #13
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokespecial unauthorizedClient-62T2iwg : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   116: dup
/*    */     //   117: aload #14
/*    */     //   119: if_acmpne -> 141
/*    */     //   122: aload #14
/*    */     //   124: areturn
/*    */     //   125: aload #13
/*    */     //   127: getfield L$0 : Ljava/lang/Object;
/*    */     //   130: checkcast java/lang/String
/*    */     //   133: astore_2
/*    */     //   134: aload #12
/*    */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   139: aload #12
/*    */     //   141: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*    */     //   144: invokevirtual auth : ()Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   147: astore #4
/*    */     //   149: aload #4
/*    */     //   151: astore #5
/*    */     //   153: iconst_0
/*    */     //   154: istore #6
/*    */     //   156: aload #5
/*    */     //   158: astore #7
/*    */     //   160: nop
/*    */     //   161: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   164: pop
/*    */     //   165: aload #7
/*    */     //   167: astore #8
/*    */     //   169: iconst_0
/*    */     //   170: istore #9
/*    */     //   172: aload #8
/*    */     //   174: astore #10
/*    */     //   176: iconst_0
/*    */     //   177: istore #11
/*    */     //   179: aload #10
/*    */     //   181: aload_2
/*    */     //   182: aload #13
/*    */     //   184: aload #13
/*    */     //   186: aconst_null
/*    */     //   187: putfield L$0 : Ljava/lang/Object;
/*    */     //   190: aload #13
/*    */     //   192: iconst_2
/*    */     //   193: putfield label : I
/*    */     //   196: invokevirtual register : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   199: dup
/*    */     //   200: aload #14
/*    */     //   202: if_acmpne -> 225
/*    */     //   205: aload #14
/*    */     //   207: areturn
/*    */     //   208: iconst_0
/*    */     //   209: istore #6
/*    */     //   211: iconst_0
/*    */     //   212: istore #9
/*    */     //   214: iconst_0
/*    */     //   215: istore #11
/*    */     //   217: nop
/*    */     //   218: aload #12
/*    */     //   220: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   223: aload #12
/*    */     //   225: pop
/*    */     //   226: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   229: nop
/*    */     //   230: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   233: astore #8
/*    */     //   235: goto -> 254
/*    */     //   238: astore #9
/*    */     //   240: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   243: pop
/*    */     //   244: aload #9
/*    */     //   246: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   249: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   252: astore #8
/*    */     //   254: aload #8
/*    */     //   256: invokestatic toGrazieResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */     //   259: nop
/*    */     //   260: areturn
/*    */     //   261: new java/lang/IllegalStateException
/*    */     //   264: dup
/*    */     //   265: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   267: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   270: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 60
/*    */     //   #38	-> 97
/*    */     //   #37	-> 122
/*    */     //   #38	-> 141
/*    */     //   #39	-> 149
/*    */     //   #117	-> 156
/*    */     //   #118	-> 172
/*    */     //   #40	-> 179
/*    */     //   #37	-> 205
/*    */     //   #41	-> 225
/*    */     //   #118	-> 229
/*    */     //   #117	-> 230
/*    */     //   #119	-> 256
/*    */     //   #117	-> 259
/*    */     //   #39	-> 260
/*    */     //   #37	-> 261
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	19	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;
/*    */     //   97	19	1	url	Ljava/lang/String;
/*    */     //   97	28	2	jbaIdToken	Ljava/lang/String;
/*    */     //   134	65	2	jbaIdToken	Ljava/lang/String;
/*    */     //   149	4	4	apiClient	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   153	7	5	$this$runCatchingGrazie$iv	Ljava/lang/Object;
/*    */     //   169	7	8	$this$runCatchingGrazie_u24lambda_u240$iv	Ljava/lang/Object;
/*    */     //   176	23	10	$this$jbaRegister_mvY_0G4_u24lambda_u242	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   179	29	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$jbaRegister$2	I
/*    */     //   172	36	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   156	52	6	$i$f$runCatchingGrazie	I
/*    */     //   0	271	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	211	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	204	12	$result	Ljava/lang/Object;
/*    */     //   217	9	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$jbaRegister$2	I
/*    */     //   214	16	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   211	49	6	$i$f$runCatchingGrazie	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   160	199	238	java/lang/Throwable
/*    */     //   217	235	238	java/lang/Throwable
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object jbaProvideAccess-SRYjgCQ(@NotNull String url, @NotNull String jbaIdToken, @NotNull String aipLicenseId, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaProvideAccess$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaProvideAccess$1
/*    */     //   13: astore #15
/*    */     //   15: aload #15
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #15
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$jbaProvideAccess$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #15
/*    */     //   53: aload #15
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #14
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #16
/*    */     //   65: aload #15
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 299, 0 -> 96, 1 -> 135, 2 -> 234
/*    */     //   96: aload #14
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_0
/*    */     //   102: aload_1
/*    */     //   103: aload #15
/*    */     //   105: aload #15
/*    */     //   107: aload_2
/*    */     //   108: putfield L$0 : Ljava/lang/Object;
/*    */     //   111: aload #15
/*    */     //   113: aload_3
/*    */     //   114: putfield L$1 : Ljava/lang/Object;
/*    */     //   117: aload #15
/*    */     //   119: iconst_1
/*    */     //   120: putfield label : I
/*    */     //   123: invokespecial unauthorizedClient-62T2iwg : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   126: dup
/*    */     //   127: aload #16
/*    */     //   129: if_acmpne -> 160
/*    */     //   132: aload #16
/*    */     //   134: areturn
/*    */     //   135: aload #15
/*    */     //   137: getfield L$1 : Ljava/lang/Object;
/*    */     //   140: checkcast java/lang/String
/*    */     //   143: astore_3
/*    */     //   144: aload #15
/*    */     //   146: getfield L$0 : Ljava/lang/Object;
/*    */     //   149: checkcast java/lang/String
/*    */     //   152: astore_2
/*    */     //   153: aload #14
/*    */     //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   158: aload #14
/*    */     //   160: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*    */     //   163: invokevirtual auth : ()Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   166: astore #5
/*    */     //   168: aload #5
/*    */     //   170: astore #6
/*    */     //   172: iconst_0
/*    */     //   173: istore #7
/*    */     //   175: aload #6
/*    */     //   177: astore #8
/*    */     //   179: nop
/*    */     //   180: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   183: pop
/*    */     //   184: aload #8
/*    */     //   186: astore #9
/*    */     //   188: iconst_0
/*    */     //   189: istore #10
/*    */     //   191: aload #9
/*    */     //   193: astore #11
/*    */     //   195: iconst_0
/*    */     //   196: istore #12
/*    */     //   198: aload #11
/*    */     //   200: aload_2
/*    */     //   201: aload_3
/*    */     //   202: aload #15
/*    */     //   204: aload #15
/*    */     //   206: aconst_null
/*    */     //   207: putfield L$0 : Ljava/lang/Object;
/*    */     //   210: aload #15
/*    */     //   212: aconst_null
/*    */     //   213: putfield L$1 : Ljava/lang/Object;
/*    */     //   216: aload #15
/*    */     //   218: iconst_2
/*    */     //   219: putfield label : I
/*    */     //   222: invokevirtual getAccessV2 : (Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   225: dup
/*    */     //   226: aload #16
/*    */     //   228: if_acmpne -> 251
/*    */     //   231: aload #16
/*    */     //   233: areturn
/*    */     //   234: iconst_0
/*    */     //   235: istore #7
/*    */     //   237: iconst_0
/*    */     //   238: istore #10
/*    */     //   240: iconst_0
/*    */     //   241: istore #12
/*    */     //   243: nop
/*    */     //   244: aload #14
/*    */     //   246: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   249: aload #14
/*    */     //   251: checkcast ai/grazie/api/gateway/client/api/AuthJBAInfo
/*    */     //   254: astore #13
/*    */     //   256: aload #13
/*    */     //   258: invokevirtual getToken : ()Ljava/lang/String;
/*    */     //   261: invokestatic constructor-impl : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   264: invokestatic box-impl : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt;
/*    */     //   267: nop
/*    */     //   268: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   271: astore #9
/*    */     //   273: goto -> 292
/*    */     //   276: astore #10
/*    */     //   278: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   281: pop
/*    */     //   282: aload #10
/*    */     //   284: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   287: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   290: astore #9
/*    */     //   292: aload #9
/*    */     //   294: invokestatic toGrazieResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */     //   297: nop
/*    */     //   298: areturn
/*    */     //   299: new java/lang/IllegalStateException
/*    */     //   302: dup
/*    */     //   303: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   305: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   308: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 63
/*    */     //   #49	-> 101
/*    */     //   #44	-> 132
/*    */     //   #49	-> 160
/*    */     //   #51	-> 168
/*    */     //   #120	-> 175
/*    */     //   #121	-> 191
/*    */     //   #52	-> 198
/*    */     //   #44	-> 231
/*    */     //   #53	-> 256
/*    */     //   #121	-> 267
/*    */     //   #120	-> 268
/*    */     //   #122	-> 294
/*    */     //   #120	-> 297
/*    */     //   #51	-> 298
/*    */     //   #44	-> 299
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	25	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;
/*    */     //   101	25	1	url	Ljava/lang/String;
/*    */     //   101	34	2	jbaIdToken	Ljava/lang/String;
/*    */     //   153	72	2	jbaIdToken	Ljava/lang/String;
/*    */     //   101	34	3	aipLicenseId	Ljava/lang/String;
/*    */     //   144	81	3	aipLicenseId	Ljava/lang/String;
/*    */     //   168	4	5	apiClient	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   172	7	6	$this$runCatchingGrazie$iv	Ljava/lang/Object;
/*    */     //   188	7	9	$this$runCatchingGrazie_u24lambda_u240$iv	Ljava/lang/Object;
/*    */     //   195	30	11	$this$jbaProvideAccess_SRYjgCQ_u24lambda_u243	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   256	8	13	authInfo	Lai/grazie/api/gateway/client/api/AuthJBAInfo;
/*    */     //   198	36	12	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$jbaProvideAccess$2	I
/*    */     //   191	43	10	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   175	59	7	$i$f$runCatchingGrazie	I
/*    */     //   0	309	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	246	15	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	239	14	$result	Ljava/lang/Object;
/*    */     //   243	21	12	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$jbaProvideAccess$2	I
/*    */     //   240	28	10	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   237	61	7	$i$f$runCatchingGrazie	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   179	225	276	java/lang/Throwable
/*    */     //   243	273	276	java/lang/Throwable
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object verifyToken-1CSWKTE(@NotNull String url, @NotNull GrazieAuthData authData, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$verifyToken$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$verifyToken$1
/*    */     //   11: astore #14
/*    */     //   13: aload #14
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #14
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$verifyToken$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #14
/*    */     //   50: aload #14
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #13
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #15
/*    */     //   62: aload #14
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 250, 0 -> 92, 1 -> 120, 2 -> 187
/*    */     //   92: aload #13
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload_2
/*    */     //   100: aload #14
/*    */     //   102: aload #14
/*    */     //   104: iconst_1
/*    */     //   105: putfield label : I
/*    */     //   108: invokespecial authorizedClient-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   111: dup
/*    */     //   112: aload #15
/*    */     //   114: if_acmpne -> 127
/*    */     //   117: aload #15
/*    */     //   119: areturn
/*    */     //   120: aload #13
/*    */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   125: aload #13
/*    */     //   127: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*    */     //   130: invokevirtual auth : ()Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   133: astore #4
/*    */     //   135: aload #4
/*    */     //   137: astore #5
/*    */     //   139: iconst_0
/*    */     //   140: istore #6
/*    */     //   142: aload #5
/*    */     //   144: astore #7
/*    */     //   146: nop
/*    */     //   147: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   150: pop
/*    */     //   151: aload #7
/*    */     //   153: astore #8
/*    */     //   155: iconst_0
/*    */     //   156: istore #9
/*    */     //   158: aload #8
/*    */     //   160: astore #10
/*    */     //   162: iconst_0
/*    */     //   163: istore #11
/*    */     //   165: aload #10
/*    */     //   167: aload #14
/*    */     //   169: aload #14
/*    */     //   171: iconst_2
/*    */     //   172: putfield label : I
/*    */     //   175: invokevirtual verifyV3 : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   178: dup
/*    */     //   179: aload #15
/*    */     //   181: if_acmpne -> 204
/*    */     //   184: aload #15
/*    */     //   186: areturn
/*    */     //   187: iconst_0
/*    */     //   188: istore #6
/*    */     //   190: iconst_0
/*    */     //   191: istore #9
/*    */     //   193: iconst_0
/*    */     //   194: istore #11
/*    */     //   196: nop
/*    */     //   197: aload #13
/*    */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   202: aload #13
/*    */     //   204: dup
/*    */     //   205: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   208: checkcast ai/grazie/utils/mpp/time/Timestamp
/*    */     //   211: astore #12
/*    */     //   213: aload #12
/*    */     //   215: invokestatic access$toInstant : (Lai/grazie/utils/mpp/time/Timestamp;)Lkotlinx/datetime/Instant;
/*    */     //   218: nop
/*    */     //   219: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   222: astore #8
/*    */     //   224: goto -> 243
/*    */     //   227: astore #9
/*    */     //   229: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   232: pop
/*    */     //   233: aload #9
/*    */     //   235: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   238: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   241: astore #8
/*    */     //   243: aload #8
/*    */     //   245: invokestatic toGrazieResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */     //   248: nop
/*    */     //   249: areturn
/*    */     //   250: new java/lang/IllegalStateException
/*    */     //   253: dup
/*    */     //   254: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   256: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   259: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #57	-> 60
/*    */     //   #58	-> 97
/*    */     //   #57	-> 117
/*    */     //   #58	-> 127
/*    */     //   #60	-> 135
/*    */     //   #123	-> 142
/*    */     //   #124	-> 158
/*    */     //   #61	-> 165
/*    */     //   #57	-> 184
/*    */     //   #61	-> 204
/*    */     //   #62	-> 213
/*    */     //   #124	-> 218
/*    */     //   #123	-> 219
/*    */     //   #125	-> 245
/*    */     //   #123	-> 248
/*    */     //   #60	-> 249
/*    */     //   #57	-> 250
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	14	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;
/*    */     //   97	14	1	url	Ljava/lang/String;
/*    */     //   97	14	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*    */     //   135	4	4	apiClient	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   139	7	5	$this$runCatchingGrazie$iv	Ljava/lang/Object;
/*    */     //   155	7	8	$this$runCatchingGrazie_u24lambda_u240$iv	Ljava/lang/Object;
/*    */     //   162	16	10	$this$verifyToken_1CSWKTE_u24lambda_u244	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   213	5	12	timestamp	Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   165	22	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$verifyToken$2	I
/*    */     //   158	29	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   142	45	6	$i$f$runCatchingGrazie	I
/*    */     //   0	260	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	200	14	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	193	13	$result	Ljava/lang/Object;
/*    */     //   196	22	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$verifyToken$2	I
/*    */     //   193	26	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   190	59	6	$i$f$runCatchingGrazie	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   146	178	227	java/lang/Throwable
/*    */     //   196	224	227	java/lang/Throwable
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object refreshToken-1CSWKTE(@NotNull String url, @NotNull GrazieAuthData authData, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$refreshToken$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$refreshToken$1
/*    */     //   11: astore #14
/*    */     //   13: aload #14
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #14
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$refreshToken$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #14
/*    */     //   50: aload #14
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #13
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #15
/*    */     //   62: aload #14
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 253, 0 -> 92, 1 -> 120, 2 -> 187
/*    */     //   92: aload #13
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload_2
/*    */     //   100: aload #14
/*    */     //   102: aload #14
/*    */     //   104: iconst_1
/*    */     //   105: putfield label : I
/*    */     //   108: invokespecial authorizedClient-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   111: dup
/*    */     //   112: aload #15
/*    */     //   114: if_acmpne -> 127
/*    */     //   117: aload #15
/*    */     //   119: areturn
/*    */     //   120: aload #13
/*    */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   125: aload #13
/*    */     //   127: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*    */     //   130: invokevirtual auth : ()Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   133: astore #4
/*    */     //   135: aload #4
/*    */     //   137: astore #5
/*    */     //   139: iconst_0
/*    */     //   140: istore #6
/*    */     //   142: aload #5
/*    */     //   144: astore #7
/*    */     //   146: nop
/*    */     //   147: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   150: pop
/*    */     //   151: aload #7
/*    */     //   153: astore #8
/*    */     //   155: iconst_0
/*    */     //   156: istore #9
/*    */     //   158: aload #8
/*    */     //   160: astore #10
/*    */     //   162: iconst_0
/*    */     //   163: istore #11
/*    */     //   165: aload #10
/*    */     //   167: aload #14
/*    */     //   169: aload #14
/*    */     //   171: iconst_2
/*    */     //   172: putfield label : I
/*    */     //   175: invokevirtual refreshV3 : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   178: dup
/*    */     //   179: aload #15
/*    */     //   181: if_acmpne -> 204
/*    */     //   184: aload #15
/*    */     //   186: areturn
/*    */     //   187: iconst_0
/*    */     //   188: istore #6
/*    */     //   190: iconst_0
/*    */     //   191: istore #9
/*    */     //   193: iconst_0
/*    */     //   194: istore #11
/*    */     //   196: nop
/*    */     //   197: aload #13
/*    */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   202: aload #13
/*    */     //   204: dup
/*    */     //   205: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   208: checkcast java/lang/String
/*    */     //   211: astore #12
/*    */     //   213: aload #12
/*    */     //   215: invokestatic constructor-impl : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   218: invokestatic box-impl : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt;
/*    */     //   221: nop
/*    */     //   222: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   225: astore #8
/*    */     //   227: goto -> 246
/*    */     //   230: astore #9
/*    */     //   232: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   235: pop
/*    */     //   236: aload #9
/*    */     //   238: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   241: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   244: astore #8
/*    */     //   246: aload #8
/*    */     //   248: invokestatic toGrazieResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */     //   251: nop
/*    */     //   252: areturn
/*    */     //   253: new java/lang/IllegalStateException
/*    */     //   256: dup
/*    */     //   257: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   259: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   262: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #66	-> 60
/*    */     //   #67	-> 97
/*    */     //   #66	-> 117
/*    */     //   #67	-> 127
/*    */     //   #69	-> 135
/*    */     //   #126	-> 142
/*    */     //   #127	-> 158
/*    */     //   #70	-> 165
/*    */     //   #66	-> 184
/*    */     //   #70	-> 204
/*    */     //   #71	-> 213
/*    */     //   #127	-> 221
/*    */     //   #126	-> 222
/*    */     //   #128	-> 248
/*    */     //   #126	-> 251
/*    */     //   #69	-> 252
/*    */     //   #66	-> 253
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	14	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;
/*    */     //   97	14	1	url	Ljava/lang/String;
/*    */     //   97	14	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*    */     //   135	4	4	apiClient	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   139	7	5	$this$runCatchingGrazie$iv	Ljava/lang/Object;
/*    */     //   155	7	8	$this$runCatchingGrazie_u24lambda_u240$iv	Ljava/lang/Object;
/*    */     //   162	16	10	$this$refreshToken_1CSWKTE_u24lambda_u245	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   213	5	12	tokenValue	Ljava/lang/String;
/*    */     //   165	22	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$refreshToken$2	I
/*    */     //   158	29	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   142	45	6	$i$f$runCatchingGrazie	I
/*    */     //   0	263	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	203	14	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	196	13	$result	Ljava/lang/Object;
/*    */     //   196	22	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$refreshToken$2	I
/*    */     //   193	29	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   190	62	6	$i$f$runCatchingGrazie	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   146	178	230	java/lang/Throwable
/*    */     //   196	227	230	java/lang/Throwable
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public GrazieAuthData authJwtToAuthData-cj1q3Zw(@NotNull String authJwt) {
/* 76 */     Intrinsics.checkNotNullParameter(authJwt, "authJwt"); return GrazieAuthData.Companion.forGrazieJwtAuth-B-TJSaM(GrazieAuthOrigin.AuthAipJba, authJwt);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object listAvailableModels-1CSWKTE(@NotNull String url, @NotNull GrazieAuthData authData, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$listAvailableModels$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$listAvailableModels$1
/*    */     //   11: astore #24
/*    */     //   13: aload #24
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #24
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$listAvailableModels$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #24
/*    */     //   50: aload #24
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #23
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #25
/*    */     //   62: aload #24
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 352, 0 -> 92, 1 -> 120, 2 -> 187
/*    */     //   92: aload #23
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload_2
/*    */     //   100: aload #24
/*    */     //   102: aload #24
/*    */     //   104: iconst_1
/*    */     //   105: putfield label : I
/*    */     //   108: invokespecial authorizedClient-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   111: dup
/*    */     //   112: aload #25
/*    */     //   114: if_acmpne -> 127
/*    */     //   117: aload #25
/*    */     //   119: areturn
/*    */     //   120: aload #23
/*    */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   125: aload #23
/*    */     //   127: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*    */     //   130: invokevirtual llm : ()Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*    */     //   133: astore #4
/*    */     //   135: aload #4
/*    */     //   137: astore #5
/*    */     //   139: iconst_0
/*    */     //   140: istore #6
/*    */     //   142: aload #5
/*    */     //   144: astore #7
/*    */     //   146: nop
/*    */     //   147: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   150: pop
/*    */     //   151: aload #7
/*    */     //   153: astore #8
/*    */     //   155: iconst_0
/*    */     //   156: istore #9
/*    */     //   158: aload #8
/*    */     //   160: astore #10
/*    */     //   162: iconst_0
/*    */     //   163: istore #11
/*    */     //   165: aload #10
/*    */     //   167: aload #24
/*    */     //   169: aload #24
/*    */     //   171: iconst_2
/*    */     //   172: putfield label : I
/*    */     //   175: invokevirtual profilesV3 : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   178: dup
/*    */     //   179: aload #25
/*    */     //   181: if_acmpne -> 204
/*    */     //   184: aload #25
/*    */     //   186: areturn
/*    */     //   187: iconst_0
/*    */     //   188: istore #6
/*    */     //   190: iconst_0
/*    */     //   191: istore #9
/*    */     //   193: iconst_0
/*    */     //   194: istore #11
/*    */     //   196: nop
/*    */     //   197: aload #23
/*    */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   202: aload #23
/*    */     //   204: checkcast java/util/List
/*    */     //   207: astore #12
/*    */     //   209: aload #12
/*    */     //   211: checkcast java/lang/Iterable
/*    */     //   214: astore #13
/*    */     //   216: iconst_0
/*    */     //   217: istore #14
/*    */     //   219: aload #13
/*    */     //   221: astore #15
/*    */     //   223: new java/util/ArrayList
/*    */     //   226: dup
/*    */     //   227: aload #13
/*    */     //   229: bipush #10
/*    */     //   231: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   234: invokespecial <init> : (I)V
/*    */     //   237: checkcast java/util/Collection
/*    */     //   240: astore #16
/*    */     //   242: iconst_0
/*    */     //   243: istore #17
/*    */     //   245: aload #15
/*    */     //   247: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   252: astore #18
/*    */     //   254: aload #18
/*    */     //   256: invokeinterface hasNext : ()Z
/*    */     //   261: ifeq -> 313
/*    */     //   264: aload #18
/*    */     //   266: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   271: astore #19
/*    */     //   273: aload #16
/*    */     //   275: aload #19
/*    */     //   277: checkcast ai/grazie/model/llm/profile/dto/v3/LLMProfileDTO
/*    */     //   280: astore #20
/*    */     //   282: astore #21
/*    */     //   284: iconst_0
/*    */     //   285: istore #22
/*    */     //   287: aload #20
/*    */     //   289: invokevirtual getId : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   292: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   295: invokestatic constructor-impl : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   298: invokestatic box-impl : (Ljava/lang/String;)Lcom/intellij/ml/llm/activation/data/model/LlmModelId;
/*    */     //   301: aload #21
/*    */     //   303: swap
/*    */     //   304: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   309: pop
/*    */     //   310: goto -> 254
/*    */     //   313: aload #16
/*    */     //   315: checkcast java/util/List
/*    */     //   318: nop
/*    */     //   319: nop
/*    */     //   320: nop
/*    */     //   321: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   324: astore #8
/*    */     //   326: goto -> 345
/*    */     //   329: astore #9
/*    */     //   331: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   334: pop
/*    */     //   335: aload #9
/*    */     //   337: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   340: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   343: astore #8
/*    */     //   345: aload #8
/*    */     //   347: invokestatic toGrazieResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*    */     //   350: nop
/*    */     //   351: areturn
/*    */     //   352: new java/lang/IllegalStateException
/*    */     //   355: dup
/*    */     //   356: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   358: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   361: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #79	-> 60
/*    */     //   #83	-> 97
/*    */     //   #79	-> 117
/*    */     //   #83	-> 127
/*    */     //   #84	-> 135
/*    */     //   #129	-> 142
/*    */     //   #130	-> 158
/*    */     //   #85	-> 165
/*    */     //   #79	-> 184
/*    */     //   #86	-> 209
/*    */     //   #131	-> 219
/*    */     //   #132	-> 245
/*    */     //   #133	-> 273
/*    */     //   #87	-> 287
/*    */     //   #133	-> 304
/*    */     //   #134	-> 313
/*    */     //   #131	-> 318
/*    */     //   #88	-> 319
/*    */     //   #130	-> 320
/*    */     //   #129	-> 321
/*    */     //   #135	-> 347
/*    */     //   #129	-> 350
/*    */     //   #84	-> 351
/*    */     //   #79	-> 352
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	14	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;
/*    */     //   97	14	1	url	Ljava/lang/String;
/*    */     //   97	14	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*    */     //   135	4	4	llmClient	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*    */     //   139	7	5	$this$runCatchingGrazie$iv	Ljava/lang/Object;
/*    */     //   155	7	8	$this$runCatchingGrazie_u24lambda_u240$iv	Ljava/lang/Object;
/*    */     //   162	16	10	$this$listAvailableModels_1CSWKTE_u24lambda_u247	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*    */     //   209	7	12	profiles	Ljava/util/List;
/*    */     //   216	26	13	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   242	12	15	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   242	73	16	destination$iv$iv	Ljava/util/Collection;
/*    */     //   273	37	19	item$iv$iv	Ljava/lang/Object;
/*    */     //   284	14	20	next	Lai/grazie/model/llm/profile/dto/v3/LLMProfileDTO;
/*    */     //   287	11	22	$i$a$-map-JunieGrazieRepositoryImpl$listAvailableModels$2$1	I
/*    */     //   245	70	17	$i$f$mapTo	I
/*    */     //   219	100	14	$i$f$map	I
/*    */     //   165	22	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$listAvailableModels$2	I
/*    */     //   158	29	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   142	45	6	$i$f$runCatchingGrazie	I
/*    */     //   0	362	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	302	24	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	295	23	$result	Ljava/lang/Object;
/*    */     //   196	124	11	$i$a$-runCatchingGrazie-JunieGrazieRepositoryImpl$listAvailableModels$2	I
/*    */     //   193	128	9	$i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1$iv	I
/*    */     //   190	161	6	$i$f$runCatchingGrazie	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   146	178	329	java/lang/Throwable
/*    */     //   196	326	329	java/lang/Throwable
/*    */   }
/*    */   
/*    */   private final Object urlResolver-7oKCuCM(String configJsonUrl, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$urlResolver$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$urlResolver$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$urlResolver$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 145, 0 -> 88, 1 -> 121
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: getstatic com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider$Companion;
/*    */     //   95: aload #4
/*    */     //   97: aload #4
/*    */     //   99: aload_1
/*    */     //   100: putfield L$0 : Ljava/lang/Object;
/*    */     //   103: aload #4
/*    */     //   105: iconst_1
/*    */     //   106: putfield label : I
/*    */     //   109: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   112: dup
/*    */     //   113: aload #5
/*    */     //   115: if_acmpne -> 135
/*    */     //   118: aload #5
/*    */     //   120: areturn
/*    */     //   121: aload #4
/*    */     //   123: getfield L$0 : Ljava/lang/Object;
/*    */     //   126: checkcast java/lang/String
/*    */     //   129: astore_1
/*    */     //   130: aload_3
/*    */     //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   134: aload_3
/*    */     //   135: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider
/*    */     //   138: aload_1
/*    */     //   139: invokeinterface urlResolver-Z6l-X28 : (Ljava/lang/String;)Lai/grazie/api/gateway/client/UrlResolver;
/*    */     //   144: areturn
/*    */     //   145: new java/lang/IllegalStateException
/*    */     //   148: dup
/*    */     //   149: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   151: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   154: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #92	-> 59
/*    */     //   #93	-> 92
/*    */     //   #92	-> 118
/*    */     //   #93	-> 135
/*    */     //   #92	-> 145
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	29	1	configJsonUrl	Ljava/lang/String;
/*    */     //   130	15	1	configJsonUrl	Ljava/lang/String;
/*    */     //   0	155	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	95	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	89	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private final Object authorizedClient-1CSWKTE(String url, GrazieAuthData authData, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$authorizedClient$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$authorizedClient$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$authorizedClient$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #6
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 164, 0 -> 88, 1 -> 128
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider$Companion;
/*    */     //   96: aload #5
/*    */     //   98: aload #5
/*    */     //   100: aload_1
/*    */     //   101: putfield L$0 : Ljava/lang/Object;
/*    */     //   104: aload #5
/*    */     //   106: aload_2
/*    */     //   107: putfield L$1 : Ljava/lang/Object;
/*    */     //   110: aload #5
/*    */     //   112: iconst_1
/*    */     //   113: putfield label : I
/*    */     //   116: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   119: dup
/*    */     //   120: aload #6
/*    */     //   122: if_acmpne -> 153
/*    */     //   125: aload #6
/*    */     //   127: areturn
/*    */     //   128: aload #5
/*    */     //   130: getfield L$1 : Ljava/lang/Object;
/*    */     //   133: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData
/*    */     //   136: astore_2
/*    */     //   137: aload #5
/*    */     //   139: getfield L$0 : Ljava/lang/Object;
/*    */     //   142: checkcast java/lang/String
/*    */     //   145: astore_1
/*    */     //   146: aload #4
/*    */     //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   151: aload #4
/*    */     //   153: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider
/*    */     //   156: aload_1
/*    */     //   157: aload_2
/*    */     //   158: invokeinterface authorizedApiClient-62T2iwg : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*    */     //   163: areturn
/*    */     //   164: new java/lang/IllegalStateException
/*    */     //   167: dup
/*    */     //   168: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   173: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #95	-> 60
/*    */     //   #96	-> 93
/*    */     //   #95	-> 125
/*    */     //   #96	-> 153
/*    */     //   #95	-> 164
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	35	1	url	Ljava/lang/String;
/*    */     //   146	18	1	url	Ljava/lang/String;
/*    */     //   93	35	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*    */     //   137	27	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*    */     //   0	174	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	114	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	107	4	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private final Object unauthorizedClient-62T2iwg(String url, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$unauthorizedClient$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$unauthorizedClient$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl$unauthorizedClient$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 145, 0 -> 88, 1 -> 121
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: getstatic com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider$Companion;
/*    */     //   95: aload #4
/*    */     //   97: aload #4
/*    */     //   99: aload_1
/*    */     //   100: putfield L$0 : Ljava/lang/Object;
/*    */     //   103: aload #4
/*    */     //   105: iconst_1
/*    */     //   106: putfield label : I
/*    */     //   109: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   112: dup
/*    */     //   113: aload #5
/*    */     //   115: if_acmpne -> 135
/*    */     //   118: aload #5
/*    */     //   120: areturn
/*    */     //   121: aload #4
/*    */     //   123: getfield L$0 : Ljava/lang/Object;
/*    */     //   126: checkcast java/lang/String
/*    */     //   129: astore_1
/*    */     //   130: aload_3
/*    */     //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   134: aload_3
/*    */     //   135: checkcast com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider
/*    */     //   138: aload_1
/*    */     //   139: invokeinterface unauthorizedApiClient-Nmbes7A : (Ljava/lang/String;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*    */     //   144: areturn
/*    */     //   145: new java/lang/IllegalStateException
/*    */     //   148: dup
/*    */     //   149: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   151: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   154: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #98	-> 59
/*    */     //   #99	-> 92
/*    */     //   #98	-> 118
/*    */     //   #99	-> 135
/*    */     //   #98	-> 145
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	29	1	url	Ljava/lang/String;
/*    */     //   130	15	1	url	Ljava/lang/String;
/*    */     //   0	155	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	95	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	89	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {96}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"url", "authData"}, m = "authorizedClient-1CSWKTE", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$authorizedClient$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$authorizedClient$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.authorizedClient-1CSWKTE(null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {49, 52}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"jbaIdToken", "aipLicenseId"}, m = "jbaProvideAccess-SRYjgCQ", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$jbaProvideAccess$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$jbaProvideAccess$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.jbaProvideAccess-SRYjgCQ(null, null, null, (Continuation<? super GrazieResult<GrazieAuthJwt>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {38, 40}, i = {0}, s = {"L$0"}, n = {"jbaIdToken"}, m = "jbaRegister-mvY-0G4", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$jbaRegister$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$jbaRegister$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.jbaRegister-mvY-0G4(null, null, (Continuation<? super GrazieResult<Unit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {31, 33}, i = {0}, s = {"L$0"}, n = {"jbaIdToken"}, m = "jbaUserInfo-mvY-0G4", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$jbaUserInfo$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$jbaUserInfo$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.jbaUserInfo-mvY-0G4(null, null, (Continuation<? super GrazieResult<Unit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {83, 85}, i = {}, s = {}, n = {}, m = "listAvailableModels-1CSWKTE", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$listAvailableModels$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$listAvailableModels$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.listAvailableModels-1CSWKTE(null, null, (Continuation<? super GrazieResult<? extends List<LlmModelId>>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {67, 70}, i = {}, s = {}, n = {}, m = "refreshToken-1CSWKTE", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$refreshToken$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$refreshToken$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.refreshToken-1CSWKTE(null, null, (Continuation<? super GrazieResult<GrazieAuthJwt>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {17, 20}, i = {}, s = {}, n = {}, m = "resolveApiUrl-7oKCuCM", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$resolveApiUrl$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$resolveApiUrl$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.resolveApiUrl-7oKCuCM(null, (Continuation<? super GrazieResult<GrazieApiUrl>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {99}, i = {0}, s = {"L$0"}, n = {"url"}, m = "unauthorizedClient-62T2iwg", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$unauthorizedClient$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$unauthorizedClient$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.unauthorizedClient-62T2iwg(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {93}, i = {0}, s = {"L$0"}, n = {"configJsonUrl"}, m = "urlResolver-7oKCuCM", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$urlResolver$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$urlResolver$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.urlResolver-7oKCuCM(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {58, 61}, i = {}, s = {}, n = {}, m = "verifyToken-1CSWKTE", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class JunieGrazieRepositoryImpl$verifyToken$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     JunieGrazieRepositoryImpl$verifyToken$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JunieGrazieRepositoryImpl.this.verifyToken-1CSWKTE(null, null, (Continuation<? super GrazieResult<Instant>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\JunieGrazieRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */