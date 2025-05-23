/*    */ package ai.grazie.api.gateway.client.api.task;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J&\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\0242\b\020\025\032\004\030\0010\026H@¢\006\002\020\027J\016\020\030\032\0020\031H@¢\006\002\020\032R\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\033"}, d2 = {"Lai/grazie/api/gateway/client/api/task/TasksAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/model/task/SuspendableTasksService;", "url", "", "auth", "Lai/grazie/model/cloud/AuthType;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/task/data/v3/TaskStreamData;", "taskCall", "Lai/grazie/model/task/TaskCallData;", "taskTag", "Lai/grazie/model/task/id/TaskTag;", "(Lai/grazie/model/task/TaskCallData;Lai/grazie/model/task/id/TaskTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "roster", "Lai/grazie/model/task/roster/TasksRoster;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nTasksAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksAPIClient.kt\nai/grazie/api/gateway/client/api/task/TasksAPIClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 4 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 5 JSON.kt\nai/grazie/utils/json/JSON\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,52:1\n1#2:53\n77#3,8:54\n86#4:62\n87#4:64\n88#4,3:70\n28#5:63\n49#6:65\n51#6:69\n49#6:73\n51#6:77\n46#7:66\n51#7:68\n46#7:74\n51#7:76\n105#8:67\n105#8:75\n7#9,2:78\n*S KotlinDebug\n*F\n+ 1 TasksAPIClient.kt\nai/grazie/api/gateway/client/api/task/TasksAPIClient\n*L\n23#1:54,8\n23#1:62\n23#1:64\n23#1:70,3\n23#1:63\n23#1:65\n23#1:69\n28#1:73\n28#1:77\n23#1:66\n23#1:68\n28#1:74\n28#1:76\n23#1:67\n28#1:75\n32#1:78,2\n*E\n"})
/*    */ public final class TasksAPIClient extends SuspendableCloudClient implements SuspendableTasksService {
/*    */   @NotNull
/* 19 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public TasksAPIClient(@NotNull String url, @NotNull AuthType auth, @NotNull SuspendableHTTPClient client, @NotNull AnnotationLogger annotationLogger) {
/* 20 */     super(url, auth, client, (JSON)JSON.Default.INSTANCE, arrayOfAuthVersion);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull TaskCallData taskCall, @Nullable TaskTag taskTag, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/task/TasksAPIClient$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/task/TasksAPIClient$execute$1
/*    */     //   11: astore #22
/*    */     //   13: aload #22
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #22
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/task/TasksAPIClient$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/task/TasksAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #22
/*    */     //   50: aload #22
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #21
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #23
/*    */     //   62: aload #22
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 449, 0 -> 88, 1 -> 280
/*    */     //   88: aload #21
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new ai/grazie/api/gateway/api/task/TaskAPI$Stream$V4
/*    */     //   96: dup
/*    */     //   97: aload_1
/*    */     //   98: invokevirtual getTaskName : ()Lai/grazie/model/task/id/TaskName;
/*    */     //   101: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   104: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   107: checkcast ai/grazie/model/cloud/API
/*    */     //   110: astore #4
/*    */     //   112: new ai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request
/*    */     //   115: dup
/*    */     //   116: aload_1
/*    */     //   117: invokevirtual getParameters : ()Lai/grazie/utils/data/DataHolder;
/*    */     //   120: invokespecial <init> : (Lai/grazie/utils/data/DataHolder;)V
/*    */     //   123: astore #5
/*    */     //   125: getstatic ai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskDataSerializer.INSTANCE : Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskDataSerializer;
/*    */     //   128: checkcast kotlinx/serialization/KSerializer
/*    */     //   131: astore #6
/*    */     //   133: new ai/grazie/client/common/model/RequestOptions
/*    */     //   136: dup
/*    */     //   137: aconst_null
/*    */     //   138: aconst_null
/*    */     //   139: iconst_3
/*    */     //   140: aconst_null
/*    */     //   141: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   144: astore #8
/*    */     //   146: aload #8
/*    */     //   148: astore #9
/*    */     //   150: iconst_0
/*    */     //   151: istore #10
/*    */     //   153: aload #9
/*    */     //   155: invokevirtual getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*    */     //   158: aload_2
/*    */     //   159: invokestatic addTaskTag : (Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/model/task/id/TaskTag;)V
/*    */     //   162: aload #8
/*    */     //   164: astore #8
/*    */     //   166: nop
/*    */     //   167: iconst_0
/*    */     //   168: istore #7
/*    */     //   170: aload_0
/*    */     //   171: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   174: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   177: astore #9
/*    */     //   179: iconst_0
/*    */     //   180: istore #10
/*    */     //   182: aload_0
/*    */     //   183: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   186: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   189: astore #11
/*    */     //   191: aload_0
/*    */     //   192: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   195: aload #4
/*    */     //   197: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   200: astore #12
/*    */     //   202: aload #8
/*    */     //   204: aload #4
/*    */     //   206: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*    */     //   209: astore #13
/*    */     //   211: iconst_0
/*    */     //   212: istore #14
/*    */     //   214: aload #11
/*    */     //   216: aload #12
/*    */     //   218: aload #9
/*    */     //   220: astore #15
/*    */     //   222: iconst_0
/*    */     //   223: istore #16
/*    */     //   225: aload #15
/*    */     //   227: getstatic ai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request.Companion : Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$Request$Companion;
/*    */     //   230: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   233: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   236: aload #5
/*    */     //   238: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   241: aload #13
/*    */     //   243: iconst_0
/*    */     //   244: aload #22
/*    */     //   246: aload #22
/*    */     //   248: aload #6
/*    */     //   250: putfield L$0 : Ljava/lang/Object;
/*    */     //   253: aload #22
/*    */     //   255: aload #9
/*    */     //   257: putfield L$1 : Ljava/lang/Object;
/*    */     //   260: aload #22
/*    */     //   262: iconst_1
/*    */     //   263: putfield label : I
/*    */     //   266: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   271: dup
/*    */     //   272: aload #23
/*    */     //   274: if_acmpne -> 313
/*    */     //   277: aload #23
/*    */     //   279: areturn
/*    */     //   280: iconst_0
/*    */     //   281: istore #10
/*    */     //   283: iconst_0
/*    */     //   284: istore #14
/*    */     //   286: aload #22
/*    */     //   288: getfield L$1 : Ljava/lang/Object;
/*    */     //   291: checkcast ai/grazie/utils/json/JSON
/*    */     //   294: astore #9
/*    */     //   296: aload #22
/*    */     //   298: getfield L$0 : Ljava/lang/Object;
/*    */     //   301: checkcast kotlinx/serialization/KSerializer
/*    */     //   304: astore #6
/*    */     //   306: aload #21
/*    */     //   308: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   311: aload #21
/*    */     //   313: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   316: astore #15
/*    */     //   318: iconst_0
/*    */     //   319: istore #16
/*    */     //   321: aload #15
/*    */     //   323: astore #17
/*    */     //   325: iconst_0
/*    */     //   326: istore #18
/*    */     //   328: iconst_0
/*    */     //   329: istore #19
/*    */     //   331: new ai/grazie/api/gateway/client/api/task/TasksAPIClient$execute$$inlined$receiveContinuousSSE$default$1
/*    */     //   334: dup
/*    */     //   335: aload #17
/*    */     //   337: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   340: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   343: nop
/*    */     //   344: nop
/*    */     //   345: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*    */     //   348: astore #15
/*    */     //   350: iconst_0
/*    */     //   351: istore #16
/*    */     //   353: aload #15
/*    */     //   355: astore #17
/*    */     //   357: iconst_0
/*    */     //   358: istore #18
/*    */     //   360: iconst_0
/*    */     //   361: istore #19
/*    */     //   363: new ai/grazie/api/gateway/client/api/task/TasksAPIClient$execute$$inlined$receiveContinuousSSE$default$2
/*    */     //   366: dup
/*    */     //   367: aload #17
/*    */     //   369: aload #6
/*    */     //   371: aload #9
/*    */     //   373: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*    */     //   376: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   379: nop
/*    */     //   380: nop
/*    */     //   381: astore #15
/*    */     //   383: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*    */     //   386: astore #16
/*    */     //   388: iconst_0
/*    */     //   389: istore #17
/*    */     //   391: aload #15
/*    */     //   393: astore #18
/*    */     //   395: iconst_0
/*    */     //   396: istore #19
/*    */     //   398: iconst_0
/*    */     //   399: istore #20
/*    */     //   401: new ai/grazie/api/gateway/client/api/task/TasksAPIClient$execute$$inlined$receiveContinuousSSE$default$3
/*    */     //   404: dup
/*    */     //   405: aload #18
/*    */     //   407: aload #16
/*    */     //   409: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*    */     //   412: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   415: nop
/*    */     //   416: nop
/*    */     //   417: nop
/*    */     //   418: nop
/*    */     //   419: astore #4
/*    */     //   421: iconst_0
/*    */     //   422: istore #5
/*    */     //   424: aload #4
/*    */     //   426: astore #6
/*    */     //   428: iconst_0
/*    */     //   429: istore #7
/*    */     //   431: iconst_0
/*    */     //   432: istore #8
/*    */     //   434: new ai/grazie/api/gateway/client/api/task/TasksAPIClient$execute$$inlined$map$1
/*    */     //   437: dup
/*    */     //   438: aload #6
/*    */     //   440: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   443: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   446: nop
/*    */     //   447: nop
/*    */     //   448: areturn
/*    */     //   449: new java/lang/IllegalStateException
/*    */     //   452: dup
/*    */     //   453: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   455: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   458: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 60
/*    */     //   #24	-> 93
/*    */     //   #25	-> 112
/*    */     //   #26	-> 125
/*    */     //   #27	-> 133
/*    */     //   #53	-> 150
/*    */     //   #27	-> 153
/*    */     //   #27	-> 162
/*    */     //   #23	-> 166
/*    */     //   #54	-> 167
/*    */     //   #54	-> 167
/*    */     //   #58	-> 167
/*    */     //   #54	-> 170
/*    */     //   #54	-> 170
/*    */     //   #60	-> 170
/*    */     //   #54	-> 179
/*    */     //   #61	-> 182
/*    */     //   #62	-> 214
/*    */     //   #63	-> 225
/*    */     //   #62	-> 241
/*    */     //   #22	-> 277
/*    */     //   #64	-> 318
/*    */     //   #65	-> 321
/*    */     //   #66	-> 328
/*    */     //   #67	-> 331
/*    */     //   #68	-> 343
/*    */     //   #69	-> 344
/*    */     //   #70	-> 345
/*    */     //   #71	-> 350
/*    */     //   #65	-> 353
/*    */     //   #66	-> 360
/*    */     //   #67	-> 363
/*    */     //   #68	-> 379
/*    */     //   #69	-> 380
/*    */     //   #72	-> 383
/*    */     //   #65	-> 391
/*    */     //   #66	-> 398
/*    */     //   #67	-> 401
/*    */     //   #68	-> 415
/*    */     //   #69	-> 416
/*    */     //   #62	-> 417
/*    */     //   #61	-> 418
/*    */     //   #28	-> 421
/*    */     //   #73	-> 424
/*    */     //   #74	-> 431
/*    */     //   #75	-> 434
/*    */     //   #76	-> 446
/*    */     //   #77	-> 447
/*    */     //   #23	-> 448
/*    */     //   #22	-> 449
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	69	0	this	Lai/grazie/api/gateway/client/api/task/TasksAPIClient;
/*    */     //   162	2	0	this	Lai/grazie/api/gateway/client/api/task/TasksAPIClient;
/*    */     //   164	47	0	this	Lai/grazie/api/gateway/client/api/task/TasksAPIClient;
/*    */     //   93	32	1	taskCall	Lai/grazie/model/task/TaskCallData;
/*    */     //   93	69	2	taskTag	Lai/grazie/model/task/id/TaskTag;
/*    */     //   164	47	4	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   421	27	4	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   164	77	5	content$iv	Ljava/lang/Object;
/*    */     //   164	116	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   306	113	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   428	19	6	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   170	73	7	reconnect$iv	Z
/*    */     //   166	45	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   150	12	9	$this$execute_u24lambda_u240	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   179	101	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   296	123	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   211	11	11	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   211	11	12	url$iv$iv	Ljava/lang/String;
/*    */     //   211	32	13	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   222	19	15	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   318	27	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   350	31	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   383	34	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   325	19	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   357	23	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   395	21	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   153	9	10	$i$a$-apply-TasksAPIClient$execute$2	I
/*    */     //   225	16	16	$i$f$string	I
/*    */     //   331	12	19	$i$f$unsafeFlow	I
/*    */     //   328	16	18	$i$f$unsafeTransform	I
/*    */     //   321	24	16	$i$f$map	I
/*    */     //   363	16	19	$i$f$unsafeFlow	I
/*    */     //   360	20	18	$i$f$unsafeTransform	I
/*    */     //   353	28	16	$i$f$map	I
/*    */     //   401	14	20	$i$f$unsafeFlow	I
/*    */     //   398	18	19	$i$f$unsafeTransform	I
/*    */     //   391	26	17	$i$f$map	I
/*    */     //   214	66	14	$i$f$receiveContinuousSSE	I
/*    */     //   182	98	10	$i$f$receiveContinuousSSE	I
/*    */     //   434	12	8	$i$f$unsafeFlow	I
/*    */     //   431	16	7	$i$f$unsafeTransform	I
/*    */     //   424	24	5	$i$f$map	I
/*    */     //   0	459	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	399	22	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	392	21	$result	Ljava/lang/Object;
/*    */     //   286	132	14	$i$f$receiveContinuousSSE	I
/*    */     //   283	136	10	$i$f$receiveContinuousSSE	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object roster(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/task/TasksAPIClient$roster$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/task/TasksAPIClient$roster$1
/*    */     //   11: astore #8
/*    */     //   13: aload #8
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #8
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/task/TasksAPIClient$roster$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/task/TasksAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #9
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 195, 0 -> 88, 1 -> 126
/*    */     //   88: aload #7
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   97: getstatic ai/grazie/api/gateway/api/task/TaskAPI$Roster.INSTANCE : Lai/grazie/api/gateway/api/task/TaskAPI$Roster;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: aconst_null
/*    */     //   104: aload #8
/*    */     //   106: iconst_2
/*    */     //   107: aconst_null
/*    */     //   108: aload #8
/*    */     //   110: iconst_1
/*    */     //   111: putfield label : I
/*    */     //   114: invokestatic get$default : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   117: dup
/*    */     //   118: aload #9
/*    */     //   120: if_acmpne -> 133
/*    */     //   123: aload #9
/*    */     //   125: areturn
/*    */     //   126: aload #7
/*    */     //   128: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   131: aload #7
/*    */     //   133: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   136: astore_3
/*    */     //   137: getstatic ai/grazie/api/gateway/api/task/TaskAPI$Roster$Response.Companion : Lai/grazie/api/gateway/api/task/TaskAPI$Roster$Response$Companion;
/*    */     //   140: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   143: astore #4
/*    */     //   145: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   148: checkcast ai/grazie/utils/json/JSON
/*    */     //   151: astore #5
/*    */     //   153: iconst_0
/*    */     //   154: istore #6
/*    */     //   156: aload #5
/*    */     //   158: aload #4
/*    */     //   160: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   163: aload_3
/*    */     //   164: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   167: dup
/*    */     //   168: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   171: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   174: checkcast ai/grazie/api/gateway/api/task/TaskAPI$Roster$Response
/*    */     //   177: astore_2
/*    */     //   178: getstatic ai/grazie/model/task/roster/TasksRoster.Companion : Lai/grazie/model/task/roster/TasksRoster$Companion;
/*    */     //   181: aload_2
/*    */     //   182: invokevirtual getIds : ()Ljava/util/List;
/*    */     //   185: checkcast java/lang/Iterable
/*    */     //   188: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*    */     //   191: invokevirtual of : (Ljava/util/Set;)Lai/grazie/model/task/roster/TasksRoster;
/*    */     //   194: areturn
/*    */     //   195: new java/lang/IllegalStateException
/*    */     //   198: dup
/*    */     //   199: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   201: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   204: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 60
/*    */     //   #32	-> 93
/*    */     //   #31	-> 123
/*    */     //   #78	-> 137
/*    */     //   #79	-> 156
/*    */     //   #32	-> 174
/*    */     //   #33	-> 178
/*    */     //   #31	-> 195
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	24	0	this	Lai/grazie/api/gateway/client/api/task/TasksAPIClient;
/*    */     //   178	17	2	response	Lai/grazie/api/gateway/api/task/TaskAPI$Roster$Response;
/*    */     //   137	37	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   145	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   153	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   156	18	6	$i$f$get	I
/*    */     //   0	205	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	145	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	138	7	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "TasksAPIClient.kt", l = {62}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "execute", c = "ai.grazie.api.gateway.client.api.task.TasksAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class TasksAPIClient$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     TasksAPIClient$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TasksAPIClient.this.execute(null, null, (Continuation<? super Flow<? extends TaskStreamData>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "TasksAPIClient.kt", l = {32}, i = {}, s = {}, n = {}, m = "roster", c = "ai.grazie.api.gateway.client.api.task.TasksAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class TasksAPIClient$roster$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     TasksAPIClient$roster$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TasksAPIClient.this.roster((Continuation<? super TasksRoster>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\task\TasksAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */