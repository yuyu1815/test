/*    */ package ai.grazie.client.common.logging;
/*    */ import ai.grazie.client.common.cloud.SuspendableCloudClient;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.model.cloud.annotations.DeprecatedAPI;
/*    */ import ai.grazie.model.cloud.annotations.DeprecatedParam;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\032\032\020\000\032\0020\0012\b\020\002\032\004\030\0010\0012\006\020\003\032\0020\004H\002\032\032\020\005\032\0020\0012\b\020\002\032\004\030\0010\0012\006\020\006\032\0020\007H\002\032\022\020\b\032\0020\t*\0020\n2\006\020\013\032\0020\f\032;\020\r\032\0020\f*\0020\n2'\020\016\032#\b\001\022\004\022\0020\n\022\n\022\b\022\004\022\0020\f0\020\022\006\022\004\030\0010\0210\017¢\006\002\b\022H@¢\006\002\020\023¨\006\024"}, d2 = {"buildAPIMessage", "", "clientName", "deprecatedAPI", "Lai/grazie/model/cloud/annotations/DeprecatedAPI;", "buildParamMessage", "deprecatedParam", "Lai/grazie/model/cloud/annotations/DeprecatedParam;", "logDeprecationInfo", "", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "response", "Lai/grazie/client/common/model/HTTPResponse;", "withAnnotationsLog", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nAnnotationLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationLogging.kt\nai/grazie/client/common/logging/AnnotationLoggingKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,36:1\n13402#2:37\n13403#2:39\n70#3:38\n*S KotlinDebug\n*F\n+ 1 AnnotationLogging.kt\nai/grazie/client/common/logging/AnnotationLoggingKt\n*L\n20#1:37\n20#1:39\n21#1:38\n*E\n"})
/*    */ public final class AnnotationLoggingKt {
/*    */   public static final void logDeprecationInfo(@NotNull SuspendableCloudClient $this$logDeprecationInfo, @NotNull HTTPResponse response) {
/*    */     String[] arrayOfString;
/*    */     byte b;
/*    */     int i;
/* 20 */     Intrinsics.checkNotNullParameter($this$logDeprecationInfo, "<this>"); Intrinsics.checkNotNullParameter(response, "response"); if (response.getHeaders().get("Grazie-Deprecated-Info") != null) { arrayOfString = response.getHeaders().get("Grazie-Deprecated-Info"); int $i$f$forEach = 0;
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
/* 37 */       b = 0; i = arrayOfString.length; } else { response.getHeaders().get("Grazie-Deprecated-Info"); return; }  if (b < i) { Object element$iv = arrayOfString[b], object1 = element$iv; int $i$a$-forEach-AnnotationLoggingKt$logDeprecationInfo$1 = 0;
/*    */       JSON this_$iv = $this$logDeprecationInfo.getJson();
/*    */       int $i$f$parse = 0; }
/*    */   
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final Object withAnnotationsLog(@NotNull SuspendableCloudClient $this$withAnnotationsLog, @NotNull Function2 block, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/client/common/logging/AnnotationLoggingKt$withAnnotationsLog$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/client/common/logging/AnnotationLoggingKt$withAnnotationsLog$1
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
/*    */     //   36: goto -> 49
/*    */     //   39: new ai/grazie/client/common/logging/AnnotationLoggingKt$withAnnotationsLog$1
/*    */     //   42: dup
/*    */     //   43: aload_2
/*    */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   47: astore #5
/*    */     //   49: aload #5
/*    */     //   51: getfield result : Ljava/lang/Object;
/*    */     //   54: astore #4
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #6
/*    */     //   61: aload #5
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 160, 0 -> 88, 1 -> 123
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: aload_0
/*    */     //   95: aload #5
/*    */     //   97: aload #5
/*    */     //   99: aload_0
/*    */     //   100: putfield L$0 : Ljava/lang/Object;
/*    */     //   103: aload #5
/*    */     //   105: iconst_1
/*    */     //   106: putfield label : I
/*    */     //   109: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   114: dup
/*    */     //   115: aload #6
/*    */     //   117: if_acmpne -> 139
/*    */     //   120: aload #6
/*    */     //   122: areturn
/*    */     //   123: aload #5
/*    */     //   125: getfield L$0 : Ljava/lang/Object;
/*    */     //   128: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   131: astore_0
/*    */     //   132: aload #4
/*    */     //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   137: aload #4
/*    */     //   139: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   142: astore_3
/*    */     //   143: aload_0
/*    */     //   144: invokevirtual getAnnotationLogger : ()Lai/grazie/client/common/logging/AnnotationLogger;
/*    */     //   147: invokevirtual getLogAnnotation : ()Z
/*    */     //   150: ifeq -> 158
/*    */     //   153: aload_0
/*    */     //   154: aload_3
/*    */     //   155: invokestatic logDeprecationInfo : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lai/grazie/client/common/model/HTTPResponse;)V
/*    */     //   158: aload_3
/*    */     //   159: areturn
/*    */     //   160: new java/lang/IllegalStateException
/*    */     //   163: dup
/*    */     //   164: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   166: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   169: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 59
/*    */     //   #12	-> 93
/*    */     //   #11	-> 120
/*    */     //   #13	-> 143
/*    */     //   #14	-> 153
/*    */     //   #16	-> 158
/*    */     //   #11	-> 160
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	30	0	$this$withAnnotationsLog	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*    */     //   132	26	0	$this$withAnnotationsLog	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*    */     //   93	21	1	block	Lkotlin/jvm/functions/Function2;
/*    */     //   143	17	3	response	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   0	170	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   49	111	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	104	4	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final String buildAPIMessage(String clientName, DeprecatedAPI deprecatedAPI) {
/*    */     return "The API " + deprecatedAPI.getApiQualifiedName() + " called from the client " + clientName + " is deprecated. " + deprecatedAPI.getDeprecationMessage();
/*    */   }
/*    */   
/*    */   private static final String buildParamMessage(String clientName, DeprecatedParam deprecatedParam) {
/*    */     return "The parameter " + deprecatedParam.getParamName() + " of type " + deprecatedParam.getParamQualifiedName() + " in the API " + deprecatedParam.getApiQualifiedName() + " called from the client " + clientName + " is deprecated. " + deprecatedParam.getDeprecationMessage();
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AnnotationLogging.kt", l = {12}, i = {0}, s = {"L$0"}, n = {"$this$withAnnotationsLog"}, m = "withAnnotationsLog", c = "ai.grazie.client.common.logging.AnnotationLoggingKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AnnotationLoggingKt$withAnnotationsLog$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     AnnotationLoggingKt$withAnnotationsLog$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AnnotationLoggingKt.withAnnotationsLog(null, null, (Continuation<? super HTTPResponse>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\logging\AnnotationLoggingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */