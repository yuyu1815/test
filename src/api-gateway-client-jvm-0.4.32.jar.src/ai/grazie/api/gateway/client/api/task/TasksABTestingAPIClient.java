/*    */ package ai.grazie.api.gateway.client.api.task;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J\020\020\020\032\004\030\0010\021H@¢\006\002\020\022R\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\023"}, d2 = {"Lai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/model/ab/SuspendableABTestingStatusService;", "url", "", "auth", "Lai/grazie/model/cloud/AuthType;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "status", "Lai/grazie/model/ab/ABTestingStatus;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nTasksABTestingAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksABTestingAPIClient.kt\nai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient\n+ 2 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,23:1\n7#2,2:24\n*S KotlinDebug\n*F\n+ 1 TasksABTestingAPIClient.kt\nai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient\n*L\n18#1:24,2\n*E\n"})
/*    */ public final class TasksABTestingAPIClient extends SuspendableCloudClient implements SuspendableABTestingStatusService {
/*    */   @NotNull
/* 14 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public TasksABTestingAPIClient(@NotNull String url, @NotNull AuthType auth, @NotNull SuspendableHTTPClient client, @NotNull AnnotationLogger annotationLogger) {
/* 15 */     super(url, auth, client, (JSON)JSON.Default.INSTANCE, arrayOfAuthVersion);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object status(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient$status$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient$status$1
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
/*    */     //   39: new ai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient$status$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #9
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 183, 0 -> 88, 1 -> 126
/*    */     //   88: aload #7
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   97: getstatic ai/grazie/api/gateway/api/task/TaskAPI$ABTesting$Status.INSTANCE : Lai/grazie/api/gateway/api/task/TaskAPI$ABTesting$Status;
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
/*    */     //   137: getstatic ai/grazie/api/gateway/api/task/TaskAPI$ABTesting$Status$Response.Companion : Lai/grazie/api/gateway/api/task/TaskAPI$ABTesting$Status$Response$Companion;
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
/*    */     //   174: checkcast ai/grazie/api/gateway/api/task/TaskAPI$ABTesting$Status$Response
/*    */     //   177: astore_2
/*    */     //   178: aload_2
/*    */     //   179: invokevirtual getCurrent : ()Lai/grazie/model/ab/ABTestingStatus;
/*    */     //   182: areturn
/*    */     //   183: new java/lang/IllegalStateException
/*    */     //   186: dup
/*    */     //   187: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   189: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   192: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #18	-> 93
/*    */     //   #17	-> 123
/*    */     //   #24	-> 137
/*    */     //   #25	-> 156
/*    */     //   #18	-> 174
/*    */     //   #19	-> 178
/*    */     //   #17	-> 183
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	24	0	this	Lai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient;
/*    */     //   178	5	2	response	Lai/grazie/api/gateway/api/task/TaskAPI$ABTesting$Status$Response;
/*    */     //   137	37	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   145	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   153	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   156	18	6	$i$f$get	I
/*    */     //   0	193	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	133	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	126	7	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "TasksABTestingAPIClient.kt", l = {18}, i = {}, s = {}, n = {}, m = "status", c = "ai.grazie.api.gateway.client.api.task.TasksABTestingAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class TasksABTestingAPIClient$status$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     TasksABTestingAPIClient$status$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TasksABTestingAPIClient.this.status((Continuation<? super ABTestingStatus>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\task\TasksABTestingAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */