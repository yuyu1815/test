/*    */ package ai.grazie.api.gateway.client.api.gec;
/*    */ 
/*    */ import ai.grazie.gec.model.CorrectionServiceType;
/*    */ import ai.grazie.gec.model.problem.SentenceWithProblems;
/*    */ import ai.grazie.gec.model.settings.UserSettings;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ<\020\021\032\b\022\004\022\0020\0230\0222\f\020\024\032\b\022\004\022\0020\0030\0222\006\020\025\032\0020\0262\020\b\002\020\027\032\n\022\004\022\0020\031\030\0010\030H@¢\006\002\020\032JH\020\033\032\b\022\004\022\0020\0230\0222\006\020\025\032\0020\0262\f\020\024\032\b\022\004\022\0020\0340\0222\020\b\002\020\027\032\n\022\004\022\0020\031\030\0010\0302\n\b\002\020\035\032\004\030\0010\036H@¢\006\002\020\037J<\020 \032\b\022\004\022\0020!0\0222\f\020\024\032\b\022\004\022\0020\0030\0222\006\020\025\032\0020\0262\020\b\002\020\027\032\n\022\004\022\0020\031\030\0010\030H@¢\006\002\020\032J\"\020\"\032\0020\0362\006\020#\032\0020\0032\n\b\002\020$\032\004\030\0010\003H@¢\006\002\020%J\026\020&\032\0020\0362\006\020'\032\0020\003H@¢\006\002\020(J<\020)\032\b\022\004\022\0020\0230\0222\f\020\024\032\b\022\004\022\0020\0030\0222\006\020\025\032\0020\0262\020\b\002\020\027\032\n\022\004\022\0020\031\030\0010\030H@¢\006\002\020\032J\026\020*\032\0020\0362\006\020'\032\0020\003H@¢\006\002\020(J\016\020+\032\0020,H@¢\006\002\020-J\"\020.\032\0020\0362\006\020/\032\002002\n\b\002\0201\032\004\030\0010\003H@¢\006\002\0202R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\0063"}, d2 = {"Lai/grazie/api/gateway/client/api/gec/GecAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "check", "", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "sentences", "language", "Lai/grazie/nlp/langs/Language;", "services", "", "Lai/grazie/gec/model/CorrectionServiceType;", "(Ljava/util/List;Lai/grazie/nlp/langs/Language;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkWithExclusions", "Lai/grazie/gec/model/request/SentenceWithExclusions;", "userSettings", "Lai/grazie/gec/model/settings/UserSettings;", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;Lai/grazie/gec/model/settings/UserSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correct", "Lai/grazie/gec/model/SentenceWithCorrections;", "createProfile", "newProfileId", "fromProfileId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProfile", "profileId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "problems", "setActiveProfile", "settings", "Lai/grazie/gec/model/settings/GecSettings;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "update", "Lai/grazie/gec/model/settings/StyleProfile;", "oldProfileId", "(Lai/grazie/gec/model/settings/StyleProfile;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nGecAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GecAPIClient.kt\nai/grazie/api/gateway/client/api/gec/GecAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,78:1\n62#2,6:79\n62#2,6:87\n62#2,6:95\n62#2,6:103\n69#2,6:111\n62#2,6:119\n62#2,6:127\n62#2,6:135\n62#2,6:143\n7#3,2:85\n7#3,2:93\n7#3,2:101\n7#3,2:109\n7#3,2:117\n7#3,2:125\n7#3,2:133\n7#3,2:141\n7#3,2:149\n*S KotlinDebug\n*F\n+ 1 GecAPIClient.kt\nai/grazie/api/gateway/client/api/gec/GecAPIClient\n*L\n23#1:79,6\n29#1:87,6\n34#1:95,6\n43#1:103,6\n47#1:111,6\n51#1:119,6\n58#1:127,6\n65#1:135,6\n72#1:143,6\n23#1:85,2\n29#1:93,2\n34#1:101,2\n43#1:109,2\n47#1:117,2\n54#1:125,2\n61#1:133,2\n68#1:141,2\n75#1:149,2\n*E\n"})
/*    */ public final class GecAPIClient extends SuspendableCloudClient {
/*    */   @NotNull
/* 19 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public GecAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 20 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object correct(@NotNull List sentences, @NotNull Language language, @Nullable Set services, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$correct$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$correct$1
/*    */     //   13: astore #12
/*    */     //   15: aload #12
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #12
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$correct$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #12
/*    */     //   53: aload #12
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #11
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #13
/*    */     //   65: aload #12
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 251, 0 -> 92, 1 -> 185
/*    */     //   92: aload #11
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V1.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/gec/GecAPI$Correct$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_2
/*    */     //   110: aload_1
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;)V
/*    */     //   115: astore #7
/*    */     //   117: new ai/grazie/client/common/model/RequestOptions
/*    */     //   120: dup
/*    */     //   121: aconst_null
/*    */     //   122: aconst_null
/*    */     //   123: iconst_3
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   128: astore #8
/*    */     //   130: aload_0
/*    */     //   131: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   134: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   137: astore #9
/*    */     //   139: iconst_0
/*    */     //   140: istore #10
/*    */     //   142: aload_0
/*    */     //   143: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   146: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$correct$$inlined$sendAndGet$default$1
/*    */     //   149: dup
/*    */     //   150: aload #6
/*    */     //   152: aload #9
/*    */     //   154: aload #7
/*    */     //   156: aload #8
/*    */     //   158: aconst_null
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   162: checkcast kotlin/jvm/functions/Function2
/*    */     //   165: aload #12
/*    */     //   167: aload #12
/*    */     //   169: iconst_1
/*    */     //   170: putfield label : I
/*    */     //   173: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   176: dup
/*    */     //   177: aload #13
/*    */     //   179: if_acmpne -> 195
/*    */     //   182: aload #13
/*    */     //   184: areturn
/*    */     //   185: iconst_0
/*    */     //   186: istore #10
/*    */     //   188: aload #11
/*    */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   193: aload #11
/*    */     //   195: nop
/*    */     //   196: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   199: astore #6
/*    */     //   201: nop
/*    */     //   202: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V1$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V1$Response$Companion;
/*    */     //   205: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   208: astore #7
/*    */     //   210: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   213: checkcast ai/grazie/utils/json/JSON
/*    */     //   216: astore #8
/*    */     //   218: iconst_0
/*    */     //   219: istore #9
/*    */     //   221: aload #8
/*    */     //   223: aload #7
/*    */     //   225: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   228: aload #6
/*    */     //   230: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   233: dup
/*    */     //   234: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   237: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   240: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Correct$V1$Response
/*    */     //   243: astore #5
/*    */     //   245: aload #5
/*    */     //   247: invokevirtual getCorrections : ()Ljava/util/List;
/*    */     //   250: areturn
/*    */     //   251: new java/lang/IllegalStateException
/*    */     //   254: dup
/*    */     //   255: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   257: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   260: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 63
/*    */     //   #23	-> 97
/*    */     //   #79	-> 117
/*    */     //   #82	-> 117
/*    */     //   #79	-> 130
/*    */     //   #83	-> 130
/*    */     //   #79	-> 139
/*    */     //   #84	-> 142
/*    */     //   #22	-> 182
/*    */     //   #84	-> 195
/*    */     //   #23	-> 201
/*    */     //   #85	-> 202
/*    */     //   #86	-> 221
/*    */     //   #23	-> 240
/*    */     //   #24	-> 245
/*    */     //   #22	-> 251
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	79	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   97	20	1	sentences	Ljava/util/List;
/*    */     //   97	20	2	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	20	3	services	Ljava/util/Set;
/*    */     //   245	6	5	corrections	Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V1$Response;
/*    */     //   117	59	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   201	39	6	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   117	59	7	content$iv	Ljava/lang/Object;
/*    */     //   210	30	7	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   130	46	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   218	22	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   139	37	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   142	43	10	$i$f$sendAndGet	I
/*    */     //   221	19	9	$i$f$get	I
/*    */     //   0	261	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	198	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	191	11	$result	Ljava/lang/Object;
/*    */     //   188	8	10	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Deprecated(message = "Use `check`, ensure you support all Category enum values and are ready for its growth; see https://youtrack.jetbrains.com/issue/JBAI-3629")
/*    */   @Nullable
/*    */   public final Object problems(@NotNull List sentences, @NotNull Language language, @Nullable Set services, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$problems$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$problems$1
/*    */     //   13: astore #12
/*    */     //   15: aload #12
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #12
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$problems$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #12
/*    */     //   53: aload #12
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #11
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #13
/*    */     //   65: aload #12
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 251, 0 -> 92, 1 -> 185
/*    */     //   92: aload #11
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V2.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V2;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/gec/GecAPI$Correct$V2$Request
/*    */     //   108: dup
/*    */     //   109: aload_2
/*    */     //   110: aload_1
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;)V
/*    */     //   115: astore #7
/*    */     //   117: new ai/grazie/client/common/model/RequestOptions
/*    */     //   120: dup
/*    */     //   121: aconst_null
/*    */     //   122: aconst_null
/*    */     //   123: iconst_3
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   128: astore #8
/*    */     //   130: aload_0
/*    */     //   131: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   134: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   137: astore #9
/*    */     //   139: iconst_0
/*    */     //   140: istore #10
/*    */     //   142: aload_0
/*    */     //   143: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   146: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$problems$$inlined$sendAndGet$default$1
/*    */     //   149: dup
/*    */     //   150: aload #6
/*    */     //   152: aload #9
/*    */     //   154: aload #7
/*    */     //   156: aload #8
/*    */     //   158: aconst_null
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   162: checkcast kotlin/jvm/functions/Function2
/*    */     //   165: aload #12
/*    */     //   167: aload #12
/*    */     //   169: iconst_1
/*    */     //   170: putfield label : I
/*    */     //   173: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   176: dup
/*    */     //   177: aload #13
/*    */     //   179: if_acmpne -> 195
/*    */     //   182: aload #13
/*    */     //   184: areturn
/*    */     //   185: iconst_0
/*    */     //   186: istore #10
/*    */     //   188: aload #11
/*    */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   193: aload #11
/*    */     //   195: nop
/*    */     //   196: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   199: astore #6
/*    */     //   201: nop
/*    */     //   202: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V2$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V2$Response$Companion;
/*    */     //   205: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   208: astore #7
/*    */     //   210: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   213: checkcast ai/grazie/utils/json/JSON
/*    */     //   216: astore #8
/*    */     //   218: iconst_0
/*    */     //   219: istore #9
/*    */     //   221: aload #8
/*    */     //   223: aload #7
/*    */     //   225: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   228: aload #6
/*    */     //   230: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   233: dup
/*    */     //   234: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   237: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   240: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Correct$V2$Response
/*    */     //   243: astore #5
/*    */     //   245: aload #5
/*    */     //   247: invokevirtual getCorrections : ()Ljava/util/List;
/*    */     //   250: areturn
/*    */     //   251: new java/lang/IllegalStateException
/*    */     //   254: dup
/*    */     //   255: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   257: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   260: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 63
/*    */     //   #29	-> 97
/*    */     //   #87	-> 117
/*    */     //   #90	-> 117
/*    */     //   #87	-> 130
/*    */     //   #91	-> 130
/*    */     //   #87	-> 139
/*    */     //   #92	-> 142
/*    */     //   #28	-> 182
/*    */     //   #92	-> 195
/*    */     //   #29	-> 201
/*    */     //   #93	-> 202
/*    */     //   #94	-> 221
/*    */     //   #29	-> 240
/*    */     //   #30	-> 245
/*    */     //   #28	-> 251
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	79	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   97	20	1	sentences	Ljava/util/List;
/*    */     //   97	20	2	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	20	3	services	Ljava/util/Set;
/*    */     //   245	6	5	corrections	Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V2$Response;
/*    */     //   117	59	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   201	39	6	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   117	59	7	content$iv	Ljava/lang/Object;
/*    */     //   210	30	7	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   130	46	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   218	22	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   139	37	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   142	43	10	$i$f$sendAndGet	I
/*    */     //   221	19	9	$i$f$get	I
/*    */     //   0	261	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	198	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	191	11	$result	Ljava/lang/Object;
/*    */     //   188	8	10	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object check(@NotNull List sentences, @NotNull Language language, @Nullable Set services, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$check$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$check$1
/*    */     //   13: astore #11
/*    */     //   15: aload #11
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #11
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$check$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #11
/*    */     //   53: aload #11
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #10
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #12
/*    */     //   65: aload #11
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 247, 0 -> 92, 1 -> 185
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V3.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V3;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #5
/*    */     //   105: new ai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Request
/*    */     //   108: dup
/*    */     //   109: aload_2
/*    */     //   110: aload_1
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;)V
/*    */     //   115: astore #6
/*    */     //   117: new ai/grazie/client/common/model/RequestOptions
/*    */     //   120: dup
/*    */     //   121: aconst_null
/*    */     //   122: aconst_null
/*    */     //   123: iconst_3
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   128: astore #7
/*    */     //   130: aload_0
/*    */     //   131: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   134: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   137: astore #8
/*    */     //   139: iconst_0
/*    */     //   140: istore #9
/*    */     //   142: aload_0
/*    */     //   143: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   146: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$check$$inlined$sendAndGet$default$1
/*    */     //   149: dup
/*    */     //   150: aload #5
/*    */     //   152: aload #8
/*    */     //   154: aload #6
/*    */     //   156: aload #7
/*    */     //   158: aconst_null
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   162: checkcast kotlin/jvm/functions/Function2
/*    */     //   165: aload #11
/*    */     //   167: aload #11
/*    */     //   169: iconst_1
/*    */     //   170: putfield label : I
/*    */     //   173: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   176: dup
/*    */     //   177: aload #12
/*    */     //   179: if_acmpne -> 195
/*    */     //   182: aload #12
/*    */     //   184: areturn
/*    */     //   185: iconst_0
/*    */     //   186: istore #9
/*    */     //   188: aload #10
/*    */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   193: aload #10
/*    */     //   195: nop
/*    */     //   196: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   199: astore #5
/*    */     //   201: nop
/*    */     //   202: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Response$Companion;
/*    */     //   205: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   208: astore #6
/*    */     //   210: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   213: checkcast ai/grazie/utils/json/JSON
/*    */     //   216: astore #7
/*    */     //   218: iconst_0
/*    */     //   219: istore #8
/*    */     //   221: aload #7
/*    */     //   223: aload #6
/*    */     //   225: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   228: aload #5
/*    */     //   230: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   233: dup
/*    */     //   234: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   237: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   240: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Response
/*    */     //   243: invokevirtual getCorrections : ()Ljava/util/List;
/*    */     //   246: areturn
/*    */     //   247: new java/lang/IllegalStateException
/*    */     //   250: dup
/*    */     //   251: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   253: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   256: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 63
/*    */     //   #34	-> 97
/*    */     //   #95	-> 117
/*    */     //   #98	-> 117
/*    */     //   #95	-> 130
/*    */     //   #99	-> 130
/*    */     //   #95	-> 139
/*    */     //   #100	-> 142
/*    */     //   #33	-> 182
/*    */     //   #100	-> 195
/*    */     //   #34	-> 201
/*    */     //   #101	-> 202
/*    */     //   #102	-> 221
/*    */     //   #34	-> 243
/*    */     //   #33	-> 247
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	79	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   97	20	1	sentences	Ljava/util/List;
/*    */     //   97	20	2	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	20	3	services	Ljava/util/Set;
/*    */     //   117	59	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   201	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   117	59	6	content$iv	Ljava/lang/Object;
/*    */     //   210	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   130	46	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   218	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   139	37	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   142	43	9	$i$f$sendAndGet	I
/*    */     //   221	19	8	$i$f$get	I
/*    */     //   0	257	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	194	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	187	10	$result	Ljava/lang/Object;
/*    */     //   188	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object checkWithExclusions(@NotNull Language language, @NotNull List sentences, @Nullable Set services, @Nullable UserSettings userSettings, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$checkWithExclusions$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$checkWithExclusions$1
/*    */     //   13: astore #12
/*    */     //   15: aload #12
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #12
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$checkWithExclusions$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #12
/*    */     //   53: aload #12
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #11
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #13
/*    */     //   65: aload #12
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 249, 0 -> 92, 1 -> 187
/*    */     //   92: aload #11
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V4.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;Lai/grazie/gec/model/settings/UserSettings;)V
/*    */     //   117: astore #7
/*    */     //   119: new ai/grazie/client/common/model/RequestOptions
/*    */     //   122: dup
/*    */     //   123: aconst_null
/*    */     //   124: aconst_null
/*    */     //   125: iconst_3
/*    */     //   126: aconst_null
/*    */     //   127: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   130: astore #8
/*    */     //   132: aload_0
/*    */     //   133: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   139: astore #9
/*    */     //   141: iconst_0
/*    */     //   142: istore #10
/*    */     //   144: aload_0
/*    */     //   145: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   148: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$checkWithExclusions$$inlined$sendAndGet$default$1
/*    */     //   151: dup
/*    */     //   152: aload #6
/*    */     //   154: aload #9
/*    */     //   156: aload #7
/*    */     //   158: aload #8
/*    */     //   160: aconst_null
/*    */     //   161: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   164: checkcast kotlin/jvm/functions/Function2
/*    */     //   167: aload #12
/*    */     //   169: aload #12
/*    */     //   171: iconst_1
/*    */     //   172: putfield label : I
/*    */     //   175: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   178: dup
/*    */     //   179: aload #13
/*    */     //   181: if_acmpne -> 197
/*    */     //   184: aload #13
/*    */     //   186: areturn
/*    */     //   187: iconst_0
/*    */     //   188: istore #10
/*    */     //   190: aload #11
/*    */     //   192: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   195: aload #11
/*    */     //   197: nop
/*    */     //   198: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   201: astore #6
/*    */     //   203: nop
/*    */     //   204: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response$Companion;
/*    */     //   207: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   210: astore #7
/*    */     //   212: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   215: checkcast ai/grazie/utils/json/JSON
/*    */     //   218: astore #8
/*    */     //   220: iconst_0
/*    */     //   221: istore #9
/*    */     //   223: aload #8
/*    */     //   225: aload #7
/*    */     //   227: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   230: aload #6
/*    */     //   232: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   235: dup
/*    */     //   236: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   239: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   242: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response
/*    */     //   245: invokevirtual getCorrections : ()Ljava/util/List;
/*    */     //   248: areturn
/*    */     //   249: new java/lang/IllegalStateException
/*    */     //   252: dup
/*    */     //   253: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   255: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   258: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 63
/*    */     //   #43	-> 97
/*    */     //   #103	-> 119
/*    */     //   #106	-> 119
/*    */     //   #103	-> 132
/*    */     //   #107	-> 132
/*    */     //   #103	-> 141
/*    */     //   #108	-> 144
/*    */     //   #37	-> 184
/*    */     //   #108	-> 197
/*    */     //   #43	-> 203
/*    */     //   #109	-> 204
/*    */     //   #110	-> 223
/*    */     //   #43	-> 245
/*    */     //   #37	-> 249
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	81	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   97	22	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	22	2	sentences	Ljava/util/List;
/*    */     //   97	22	3	services	Ljava/util/Set;
/*    */     //   97	22	4	userSettings	Lai/grazie/gec/model/settings/UserSettings;
/*    */     //   119	59	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   203	39	6	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   119	59	7	content$iv	Ljava/lang/Object;
/*    */     //   212	30	7	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   132	46	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   220	22	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   141	37	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   144	43	10	$i$f$sendAndGet	I
/*    */     //   223	19	9	$i$f$get	I
/*    */     //   0	259	5	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	196	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	189	11	$result	Ljava/lang/Object;
/*    */     //   190	8	10	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object settings(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$settings$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$settings$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$settings$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 210, 0 -> 88, 1 -> 152
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$Get$V1.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$Get$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore_2
/*    */     //   100: new ai/grazie/client/common/model/RequestOptions
/*    */     //   103: dup
/*    */     //   104: aconst_null
/*    */     //   105: aconst_null
/*    */     //   106: iconst_3
/*    */     //   107: aconst_null
/*    */     //   108: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   111: astore_3
/*    */     //   112: iconst_0
/*    */     //   113: istore #4
/*    */     //   115: aload_0
/*    */     //   116: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   119: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$settings$$inlined$sendAndGet$default$1
/*    */     //   122: dup
/*    */     //   123: aload_2
/*    */     //   124: aload_3
/*    */     //   125: aconst_null
/*    */     //   126: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   129: checkcast kotlin/jvm/functions/Function2
/*    */     //   132: aload #7
/*    */     //   134: aload #7
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #8
/*    */     //   146: if_acmpne -> 162
/*    */     //   149: aload #8
/*    */     //   151: areturn
/*    */     //   152: iconst_0
/*    */     //   153: istore #4
/*    */     //   155: aload #6
/*    */     //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   160: aload #6
/*    */     //   162: nop
/*    */     //   163: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   166: astore_2
/*    */     //   167: nop
/*    */     //   168: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$Get$V1$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$Get$V1$Response$Companion;
/*    */     //   171: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   174: astore_3
/*    */     //   175: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   178: checkcast ai/grazie/utils/json/JSON
/*    */     //   181: astore #4
/*    */     //   183: iconst_0
/*    */     //   184: istore #5
/*    */     //   186: aload #4
/*    */     //   188: aload_3
/*    */     //   189: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   192: aload_2
/*    */     //   193: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   196: dup
/*    */     //   197: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   200: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   203: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Settings$Get$V1$Response
/*    */     //   206: invokevirtual getGecSettings : ()Lai/grazie/gec/model/settings/GecSettings;
/*    */     //   209: areturn
/*    */     //   210: new java/lang/IllegalStateException
/*    */     //   213: dup
/*    */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   219: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #46	-> 60
/*    */     //   #47	-> 93
/*    */     //   #111	-> 100
/*    */     //   #113	-> 100
/*    */     //   #111	-> 112
/*    */     //   #114	-> 115
/*    */     //   #46	-> 149
/*    */     //   #116	-> 162
/*    */     //   #47	-> 167
/*    */     //   #117	-> 168
/*    */     //   #118	-> 186
/*    */     //   #47	-> 206
/*    */     //   #46	-> 210
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	50	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   100	43	2	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   167	36	2	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	31	3	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   175	28	3	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   183	20	4	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   115	37	4	$i$f$sendAndGet	I
/*    */     //   186	17	5	$i$f$get	I
/*    */     //   0	220	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	160	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	153	6	$result	Ljava/lang/Object;
/*    */     //   155	8	4	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object updateProfile(@NotNull StyleProfile update, @Nullable String oldProfileId, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$updateProfile$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$updateProfile$1
/*    */     //   11: astore #10
/*    */     //   13: aload #10
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #10
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$updateProfile$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #10
/*    */     //   50: aload #10
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #9
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #11
/*    */     //   62: aload #10
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 243, 0 -> 88, 1 -> 181
/*    */     //   88: aload #9
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$UpdateProfile$V1.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$UpdateProfile$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #4
/*    */     //   101: new ai/grazie/api/gateway/api/gec/GecAPI$Settings$UpdateProfile$V1$Request
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Lai/grazie/gec/model/settings/StyleProfile;Ljava/lang/String;)V
/*    */     //   110: astore #5
/*    */     //   112: nop
/*    */     //   113: new ai/grazie/client/common/model/RequestOptions
/*    */     //   116: dup
/*    */     //   117: aconst_null
/*    */     //   118: aconst_null
/*    */     //   119: iconst_3
/*    */     //   120: aconst_null
/*    */     //   121: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   124: astore #6
/*    */     //   126: aload_0
/*    */     //   127: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   130: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   133: astore #7
/*    */     //   135: iconst_0
/*    */     //   136: istore #8
/*    */     //   138: aload_0
/*    */     //   139: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   142: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$updateProfile$$inlined$sendAndGet$default$1
/*    */     //   145: dup
/*    */     //   146: aload #4
/*    */     //   148: aload #7
/*    */     //   150: aload #5
/*    */     //   152: aload #6
/*    */     //   154: aconst_null
/*    */     //   155: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   158: checkcast kotlin/jvm/functions/Function2
/*    */     //   161: aload #10
/*    */     //   163: aload #10
/*    */     //   165: iconst_1
/*    */     //   166: putfield label : I
/*    */     //   169: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   172: dup
/*    */     //   173: aload #11
/*    */     //   175: if_acmpne -> 191
/*    */     //   178: aload #11
/*    */     //   180: areturn
/*    */     //   181: iconst_0
/*    */     //   182: istore #8
/*    */     //   184: aload #9
/*    */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   189: aload #9
/*    */     //   191: nop
/*    */     //   192: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   195: astore #4
/*    */     //   197: nop
/*    */     //   198: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$UpdateProfile$V1$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$UpdateProfile$V1$Response$Companion;
/*    */     //   201: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   204: astore #5
/*    */     //   206: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   209: checkcast ai/grazie/utils/json/JSON
/*    */     //   212: astore #6
/*    */     //   214: iconst_0
/*    */     //   215: istore #7
/*    */     //   217: aload #6
/*    */     //   219: aload #5
/*    */     //   221: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   224: aload #4
/*    */     //   226: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   229: dup
/*    */     //   230: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   233: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   236: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Settings$UpdateProfile$V1$Response
/*    */     //   239: invokevirtual getUserSettings : ()Lai/grazie/gec/model/settings/UserSettings;
/*    */     //   242: areturn
/*    */     //   243: new java/lang/IllegalStateException
/*    */     //   246: dup
/*    */     //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   249: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   252: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 60
/*    */     //   #52	-> 93
/*    */     //   #53	-> 101
/*    */     //   #51	-> 112
/*    */     //   #119	-> 113
/*    */     //   #122	-> 113
/*    */     //   #119	-> 126
/*    */     //   #123	-> 126
/*    */     //   #119	-> 135
/*    */     //   #124	-> 138
/*    */     //   #50	-> 178
/*    */     //   #124	-> 191
/*    */     //   #54	-> 197
/*    */     //   #125	-> 198
/*    */     //   #126	-> 217
/*    */     //   #54	-> 239
/*    */     //   #51	-> 242
/*    */     //   #50	-> 243
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	79	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   93	19	1	update	Lai/grazie/gec/model/settings/StyleProfile;
/*    */     //   93	19	2	oldProfileId	Ljava/lang/String;
/*    */     //   101	71	4	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   197	39	4	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	60	5	content$iv	Ljava/lang/Object;
/*    */     //   206	30	5	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   126	46	6	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   214	22	6	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   135	37	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   138	43	8	$i$f$sendAndGet	I
/*    */     //   217	19	7	$i$f$get	I
/*    */     //   0	253	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	193	10	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	186	9	$result	Ljava/lang/Object;
/*    */     //   184	8	8	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object createProfile(@NotNull String newProfileId, @Nullable String fromProfileId, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$createProfile$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$createProfile$1
/*    */     //   11: astore #10
/*    */     //   13: aload #10
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #10
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$createProfile$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #10
/*    */     //   50: aload #10
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #9
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #11
/*    */     //   62: aload #10
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 243, 0 -> 88, 1 -> 181
/*    */     //   88: aload #9
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$CreateProfile$V1.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$CreateProfile$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #4
/*    */     //   101: new ai/grazie/api/gateway/api/gec/GecAPI$Settings$CreateProfile$V1$Request
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   110: astore #5
/*    */     //   112: nop
/*    */     //   113: new ai/grazie/client/common/model/RequestOptions
/*    */     //   116: dup
/*    */     //   117: aconst_null
/*    */     //   118: aconst_null
/*    */     //   119: iconst_3
/*    */     //   120: aconst_null
/*    */     //   121: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   124: astore #6
/*    */     //   126: aload_0
/*    */     //   127: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   130: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   133: astore #7
/*    */     //   135: iconst_0
/*    */     //   136: istore #8
/*    */     //   138: aload_0
/*    */     //   139: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   142: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$createProfile$$inlined$sendAndGet$default$1
/*    */     //   145: dup
/*    */     //   146: aload #4
/*    */     //   148: aload #7
/*    */     //   150: aload #5
/*    */     //   152: aload #6
/*    */     //   154: aconst_null
/*    */     //   155: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   158: checkcast kotlin/jvm/functions/Function2
/*    */     //   161: aload #10
/*    */     //   163: aload #10
/*    */     //   165: iconst_1
/*    */     //   166: putfield label : I
/*    */     //   169: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   172: dup
/*    */     //   173: aload #11
/*    */     //   175: if_acmpne -> 191
/*    */     //   178: aload #11
/*    */     //   180: areturn
/*    */     //   181: iconst_0
/*    */     //   182: istore #8
/*    */     //   184: aload #9
/*    */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   189: aload #9
/*    */     //   191: nop
/*    */     //   192: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   195: astore #4
/*    */     //   197: nop
/*    */     //   198: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$CreateProfile$V1$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$CreateProfile$V1$Response$Companion;
/*    */     //   201: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   204: astore #5
/*    */     //   206: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   209: checkcast ai/grazie/utils/json/JSON
/*    */     //   212: astore #6
/*    */     //   214: iconst_0
/*    */     //   215: istore #7
/*    */     //   217: aload #6
/*    */     //   219: aload #5
/*    */     //   221: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   224: aload #4
/*    */     //   226: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   229: dup
/*    */     //   230: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   233: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   236: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Settings$CreateProfile$V1$Response
/*    */     //   239: invokevirtual getUserSettings : ()Lai/grazie/gec/model/settings/UserSettings;
/*    */     //   242: areturn
/*    */     //   243: new java/lang/IllegalStateException
/*    */     //   246: dup
/*    */     //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   249: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   252: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #57	-> 60
/*    */     //   #59	-> 93
/*    */     //   #60	-> 101
/*    */     //   #58	-> 112
/*    */     //   #127	-> 113
/*    */     //   #130	-> 113
/*    */     //   #127	-> 126
/*    */     //   #131	-> 126
/*    */     //   #127	-> 135
/*    */     //   #132	-> 138
/*    */     //   #57	-> 178
/*    */     //   #132	-> 191
/*    */     //   #61	-> 197
/*    */     //   #133	-> 198
/*    */     //   #134	-> 217
/*    */     //   #61	-> 239
/*    */     //   #58	-> 242
/*    */     //   #57	-> 243
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	79	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   93	19	1	newProfileId	Ljava/lang/String;
/*    */     //   93	19	2	fromProfileId	Ljava/lang/String;
/*    */     //   101	71	4	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   197	39	4	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	60	5	content$iv	Ljava/lang/Object;
/*    */     //   206	30	5	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   126	46	6	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   214	22	6	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   135	37	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   138	43	8	$i$f$sendAndGet	I
/*    */     //   217	19	7	$i$f$get	I
/*    */     //   0	253	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	193	10	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	186	9	$result	Ljava/lang/Object;
/*    */     //   184	8	8	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object deleteProfile(@NotNull String profileId, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$deleteProfile$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$deleteProfile$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$deleteProfile$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 238, 0 -> 88, 1 -> 178
/*    */     //   88: aload #8
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$DeleteProfile$V1.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$DeleteProfile$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore_3
/*    */     //   100: new ai/grazie/api/gateway/api/gec/GecAPI$Settings$DeleteProfile$V1$Request
/*    */     //   103: dup
/*    */     //   104: aload_1
/*    */     //   105: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   108: astore #4
/*    */     //   110: nop
/*    */     //   111: new ai/grazie/client/common/model/RequestOptions
/*    */     //   114: dup
/*    */     //   115: aconst_null
/*    */     //   116: aconst_null
/*    */     //   117: iconst_3
/*    */     //   118: aconst_null
/*    */     //   119: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   122: astore #5
/*    */     //   124: aload_0
/*    */     //   125: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   128: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   131: astore #6
/*    */     //   133: iconst_0
/*    */     //   134: istore #7
/*    */     //   136: aload_0
/*    */     //   137: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   140: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$deleteProfile$$inlined$sendAndGet$default$1
/*    */     //   143: dup
/*    */     //   144: aload_3
/*    */     //   145: aload #6
/*    */     //   147: aload #4
/*    */     //   149: aload #5
/*    */     //   151: aconst_null
/*    */     //   152: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   155: checkcast kotlin/jvm/functions/Function2
/*    */     //   158: aload #9
/*    */     //   160: aload #9
/*    */     //   162: iconst_1
/*    */     //   163: putfield label : I
/*    */     //   166: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   169: dup
/*    */     //   170: aload #10
/*    */     //   172: if_acmpne -> 188
/*    */     //   175: aload #10
/*    */     //   177: areturn
/*    */     //   178: iconst_0
/*    */     //   179: istore #7
/*    */     //   181: aload #8
/*    */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   186: aload #8
/*    */     //   188: nop
/*    */     //   189: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   192: astore_3
/*    */     //   193: nop
/*    */     //   194: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$DeleteProfile$V1$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$DeleteProfile$V1$Response$Companion;
/*    */     //   197: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   200: astore #4
/*    */     //   202: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   205: checkcast ai/grazie/utils/json/JSON
/*    */     //   208: astore #5
/*    */     //   210: iconst_0
/*    */     //   211: istore #6
/*    */     //   213: aload #5
/*    */     //   215: aload #4
/*    */     //   217: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   220: aload_3
/*    */     //   221: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   224: dup
/*    */     //   225: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   228: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   231: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Settings$DeleteProfile$V1$Response
/*    */     //   234: invokevirtual getUserSettings : ()Lai/grazie/gec/model/settings/UserSettings;
/*    */     //   237: areturn
/*    */     //   238: new java/lang/IllegalStateException
/*    */     //   241: dup
/*    */     //   242: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   244: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   247: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #64	-> 60
/*    */     //   #66	-> 93
/*    */     //   #67	-> 100
/*    */     //   #65	-> 110
/*    */     //   #135	-> 111
/*    */     //   #138	-> 111
/*    */     //   #135	-> 124
/*    */     //   #139	-> 124
/*    */     //   #135	-> 133
/*    */     //   #140	-> 136
/*    */     //   #64	-> 175
/*    */     //   #140	-> 188
/*    */     //   #68	-> 193
/*    */     //   #141	-> 194
/*    */     //   #142	-> 213
/*    */     //   #68	-> 234
/*    */     //   #65	-> 237
/*    */     //   #64	-> 238
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	76	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   93	17	1	profileId	Ljava/lang/String;
/*    */     //   100	69	3	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   193	38	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   110	59	4	content$iv	Ljava/lang/Object;
/*    */     //   202	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   124	45	5	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   210	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   133	36	6	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   136	42	7	$i$f$sendAndGet	I
/*    */     //   213	18	6	$i$f$get	I
/*    */     //   0	248	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	188	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	181	8	$result	Ljava/lang/Object;
/*    */     //   181	8	7	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object setActiveProfile(@NotNull String profileId, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/gec/GecAPIClient$setActiveProfile$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/gec/GecAPIClient$setActiveProfile$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$setActiveProfile$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/gec/GecAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 238, 0 -> 88, 1 -> 178
/*    */     //   88: aload #8
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$SetActiveProfile$V1.INSTANCE : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$SetActiveProfile$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore_3
/*    */     //   100: new ai/grazie/api/gateway/api/gec/GecAPI$Settings$SetActiveProfile$V1$Request
/*    */     //   103: dup
/*    */     //   104: aload_1
/*    */     //   105: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   108: astore #4
/*    */     //   110: nop
/*    */     //   111: new ai/grazie/client/common/model/RequestOptions
/*    */     //   114: dup
/*    */     //   115: aconst_null
/*    */     //   116: aconst_null
/*    */     //   117: iconst_3
/*    */     //   118: aconst_null
/*    */     //   119: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   122: astore #5
/*    */     //   124: aload_0
/*    */     //   125: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   128: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   131: astore #6
/*    */     //   133: iconst_0
/*    */     //   134: istore #7
/*    */     //   136: aload_0
/*    */     //   137: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   140: new ai/grazie/api/gateway/client/api/gec/GecAPIClient$setActiveProfile$$inlined$sendAndGet$default$1
/*    */     //   143: dup
/*    */     //   144: aload_3
/*    */     //   145: aload #6
/*    */     //   147: aload #4
/*    */     //   149: aload #5
/*    */     //   151: aconst_null
/*    */     //   152: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   155: checkcast kotlin/jvm/functions/Function2
/*    */     //   158: aload #9
/*    */     //   160: aload #9
/*    */     //   162: iconst_1
/*    */     //   163: putfield label : I
/*    */     //   166: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   169: dup
/*    */     //   170: aload #10
/*    */     //   172: if_acmpne -> 188
/*    */     //   175: aload #10
/*    */     //   177: areturn
/*    */     //   178: iconst_0
/*    */     //   179: istore #7
/*    */     //   181: aload #8
/*    */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   186: aload #8
/*    */     //   188: nop
/*    */     //   189: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   192: astore_3
/*    */     //   193: nop
/*    */     //   194: getstatic ai/grazie/api/gateway/api/gec/GecAPI$Settings$SetActiveProfile$V1$Response.Companion : Lai/grazie/api/gateway/api/gec/GecAPI$Settings$SetActiveProfile$V1$Response$Companion;
/*    */     //   197: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   200: astore #4
/*    */     //   202: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   205: checkcast ai/grazie/utils/json/JSON
/*    */     //   208: astore #5
/*    */     //   210: iconst_0
/*    */     //   211: istore #6
/*    */     //   213: aload #5
/*    */     //   215: aload #4
/*    */     //   217: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   220: aload_3
/*    */     //   221: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   224: dup
/*    */     //   225: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   228: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   231: checkcast ai/grazie/api/gateway/api/gec/GecAPI$Settings$SetActiveProfile$V1$Response
/*    */     //   234: invokevirtual getUserSettings : ()Lai/grazie/gec/model/settings/UserSettings;
/*    */     //   237: areturn
/*    */     //   238: new java/lang/IllegalStateException
/*    */     //   241: dup
/*    */     //   242: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   244: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   247: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #71	-> 60
/*    */     //   #73	-> 93
/*    */     //   #74	-> 100
/*    */     //   #72	-> 110
/*    */     //   #143	-> 111
/*    */     //   #146	-> 111
/*    */     //   #143	-> 124
/*    */     //   #147	-> 124
/*    */     //   #143	-> 133
/*    */     //   #148	-> 136
/*    */     //   #71	-> 175
/*    */     //   #148	-> 188
/*    */     //   #75	-> 193
/*    */     //   #149	-> 194
/*    */     //   #150	-> 213
/*    */     //   #75	-> 234
/*    */     //   #72	-> 237
/*    */     //   #71	-> 238
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	76	0	this	Lai/grazie/api/gateway/client/api/gec/GecAPIClient;
/*    */     //   93	17	1	profileId	Ljava/lang/String;
/*    */     //   100	69	3	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   193	38	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   110	59	4	content$iv	Ljava/lang/Object;
/*    */     //   202	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   124	45	5	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   210	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   133	36	6	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   136	42	7	$i$f$sendAndGet	I
/*    */     //   213	18	6	$i$f$get	I
/*    */     //   0	248	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	188	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	181	8	$result	Ljava/lang/Object;
/*    */     //   181	8	7	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "check", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$check$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$check$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.check(null, null, null, (Continuation<? super List<SentenceWithProblems>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "checkWithExclusions", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$checkWithExclusions$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$checkWithExclusions$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.checkWithExclusions(null, null, null, null, (Continuation<? super List<SentenceWithProblems>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "correct", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$correct$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$correct$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.correct(null, null, null, (Continuation<? super List<SentenceWithCorrections>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "createProfile", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$createProfile$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$createProfile$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.createProfile(null, null, (Continuation<? super UserSettings>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "deleteProfile", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$deleteProfile$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$deleteProfile$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.deleteProfile(null, (Continuation<? super UserSettings>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "problems", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$problems$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$problems$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.problems(null, null, null, (Continuation<? super List<SentenceWithProblems>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "setActiveProfile", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$setActiveProfile$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$setActiveProfile$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.setActiveProfile(null, (Continuation<? super UserSettings>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {82}, i = {}, s = {}, n = {}, m = "settings", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$settings$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$settings$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.settings((Continuation<? super GecSettings>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GecAPIClient.kt", l = {84}, i = {}, s = {}, n = {}, m = "updateProfile", c = "ai.grazie.api.gateway.client.api.gec.GecAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GecAPIClient$updateProfile$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     GecAPIClient$updateProfile$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GecAPIClient.this.updateProfile(null, null, (Continuation<? super UserSettings>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\gec\GecAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */