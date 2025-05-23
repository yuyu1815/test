/*     */ package feedback;
/*     */ 
/*     */ import com.intellij.openapi.application.ApplicationNamesInfo;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.util.PlatformUtils;
/*     */ import com.intellij.util.io.HttpRequests;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000F\n\000\n\002\020\016\n\002\b\023\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\000\0324\020\033\032\0020\0342\006\020\035\032\0020\0362\f\020\037\032\b\022\004\022\0020\0340 2\f\020!\032\b\022\004\022\0020\0340 2\b\b\002\020\"\032\0020#\0324\020$\032\0020\0342\006\020%\032\0020\0012\006\020\035\032\0020\0362\f\020\037\032\b\022\004\022\0020\0340 2\f\020!\032\b\022\004\022\0020\0340 H\002\032\016\020&\032\0020'2\006\020(\032\0020'\032\b\020)\032\0020\001H\000\032\b\020*\032\0020+H\002\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\001XT¢\006\002\n\000\"\016\020\t\032\0020\001XT¢\006\002\n\000\"\016\020\n\032\0020\001XT¢\006\002\n\000\"\016\020\013\032\0020\001XT¢\006\002\n\000\"\016\020\f\032\0020\001XT¢\006\002\n\000\"\016\020\r\032\0020\001XT¢\006\002\n\000\"\016\020\016\032\0020\001XT¢\006\002\n\000\"\016\020\017\032\0020\001XT¢\006\002\n\000\"\016\020\020\032\0020\001XT¢\006\002\n\000\"\016\020\021\032\0020\001XT¢\006\002\n\000\"\016\020\022\032\0020\001XT¢\006\002\n\000\"\016\020\023\032\0020\001XT¢\006\002\n\000\"\024\020\024\032\0020\025X\004¢\006\b\n\000\032\004\b\026\020\027\"\023\020\030\032\0070\031¢\006\002\b\032X\004¢\006\002\n\000¨\006,"}, d2 = {"TEST_FEEDBACK_URL", "", "PRODUCTION_FEEDBACK_URL", "FEEDBACK_FORM_ID_ONLY_DATA", "FEEDBACK_FORM_ID_WITH_DETAILED_ANSWER", "FEEDBACK_REPORT_ID_KEY", "FEEDBACK_FROM_ID_KEY", "FEEDBACK_AUTO_SOLVE_TICKET_KEY", "FEEDBACK_INTELLIJ_PRODUCT_KEY", "FEEDBACK_TYPE_KEY", "FEEDBACK_PRIVACY_CONSENT_KEY", "FEEDBACK_PRIVACY_CONSENT_TYPE_KEY", "FEEDBACK_COLLECTED_DATA_KEY", "FEEDBACK_EMAIL_KEY", "FEEDBACK_SUBJECT_KEY", "FEEDBACK_COMMENT_KEY", "FEEDBACK_TAGS_KEY", "DEFAULT_FEEDBACK_CONSENT_ID", "REQUEST_ID_KEY", "EMAIL_PLACEHOLDER", "SPACE_SYMBOL_REGEX", "Lkotlin/text/Regex;", "getSPACE_SYMBOL_REGEX", "()Lkotlin/text/Regex;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "submitFeedback", "", "feedbackData", "Lfeedback/FeedbackRequestDataHolder;", "onDone", "Lkotlin/Function0;", "onError", "feedbackRequestType", "Lfeedback/FeedbackRequestType;", "sendFeedback", "feedbackUrl", "cleanFeedbackFromEmails", "Lkotlinx/serialization/json/JsonElement;", "jsonElement", "getProductTag", "isCLionNova", "", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nGeneralFeedbackSubmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeneralFeedbackSubmit.kt\nfeedback/GeneralFeedbackSubmitKt\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n29#2,2:235\n31#2:239\n52#2,2:240\n54#2:244\n216#3,2:237\n1863#4,2:242\n*S KotlinDebug\n*F\n+ 1 GeneralFeedbackSubmit.kt\nfeedback/GeneralFeedbackSubmitKt\n*L\n183#1:235,2\n183#1:239\n190#1:240,2\n190#1:244\n184#1:237,2\n191#1:242,2\n*E\n"})
/*     */ public final class GeneralFeedbackSubmitKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String TEST_FEEDBACK_URL = "https://forms-stgn.w3jbcom-nonprod.aws.intellij.net/feedback";
/*     */   @NotNull
/*     */   private static final String PRODUCTION_FEEDBACK_URL = "https://forms-service.jetbrains.com/feedback";
/*     */   @NotNull
/*     */   private static final String FEEDBACK_FORM_ID_ONLY_DATA = "feedback/ide";
/*     */   @NotNull
/*     */   private static final String FEEDBACK_FORM_ID_WITH_DETAILED_ANSWER = "v2/feedback/ide_with_detailed_answer";
/*     */   @NotNull
/*     */   public static final String FEEDBACK_REPORT_ID_KEY = "feedback_id";
/*     */   @NotNull
/*     */   private static final String FEEDBACK_FROM_ID_KEY = "formid";
/*     */   @NotNull
/*     */   private static final String FEEDBACK_AUTO_SOLVE_TICKET_KEY = "autosolve";
/*     */   @NotNull
/*     */   private static final String FEEDBACK_INTELLIJ_PRODUCT_KEY = "intellij_product";
/*     */   @NotNull
/*     */   private static final String FEEDBACK_TYPE_KEY = "feedback_type";
/*     */   @NotNull
/*  42 */   private static final Regex SPACE_SYMBOL_REGEX = new Regex("\\s"); @NotNull private static final String FEEDBACK_PRIVACY_CONSENT_KEY = "privacy_consent"; @NotNull private static final String FEEDBACK_PRIVACY_CONSENT_TYPE_KEY = "privacy_consent_type"; @NotNull private static final String FEEDBACK_COLLECTED_DATA_KEY = "collected_data"; @NotNull private static final String FEEDBACK_EMAIL_KEY = "email"; @NotNull private static final String FEEDBACK_SUBJECT_KEY = "subject"; @NotNull private static final String FEEDBACK_COMMENT_KEY = "comment"; @NotNull private static final String FEEDBACK_TAGS_KEY = "tags"; @NotNull public static final String DEFAULT_FEEDBACK_CONSENT_ID = "rsch.statistics.feedback.common"; @NotNull private static final String REQUEST_ID_KEY = "Request-Id"; @NotNull private static final String EMAIL_PLACEHOLDER = "<EMAIL>"; @NotNull public static final Regex getSPACE_SYMBOL_REGEX() { return SPACE_SYMBOL_REGEX; }
/*     */    @NotNull
/*  44 */   private static final Logger LOG = Logger.getInstance(FeedbackRequestDataHolder.class); static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance(FeedbackRequestDataHolder.class), "getInstance(...)"); }
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
/*     */   public static final void submitFeedback(@NotNull FeedbackRequestDataHolder feedbackData, @NotNull Function0 onDone, @NotNull Function0 onError, @NotNull FeedbackRequestType feedbackRequestType) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'feedbackData'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onDone'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'onError'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 'feedbackRequestType'
/*     */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   27: aload_3
/*     */     //   28: aload_0
/*     */     //   29: aload_1
/*     */     //   30: aload_2
/*     */     //   31: <illegal opcode> run : (Lfeedback/FeedbackRequestType;Lfeedback/FeedbackRequestDataHolder;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;
/*     */     //   36: invokeinterface executeOnPooledThread : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
/*     */     //   41: pop
/*     */     //   42: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 24
/*     */     //   #118	-> 42
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	43	0	feedbackData	Lfeedback/FeedbackRequestDataHolder;
/*     */     //   0	43	1	onDone	Lkotlin/jvm/functions/Function0;
/*     */     //   0	43	2	onError	Lkotlin/jvm/functions/Function0;
/*     */     //   0	43	3	feedbackRequestType	Lfeedback/FeedbackRequestType;
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
/*     */   private static final void submitFeedback$lambda$0(FeedbackRequestType $feedbackRequestType, FeedbackRequestDataHolder $feedbackData, Function0 $onDone, Function0 $onError) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getstatic feedback/GeneralFeedbackSubmitKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   4: swap
/*     */     //   5: invokevirtual ordinal : ()I
/*     */     //   8: iaload
/*     */     //   9: tableswitch default -> 49, 1 -> 36, 2 -> 37, 3 -> 43
/*     */     //   36: return
/*     */     //   37: ldc_w 'https://forms-stgn.w3jbcom-nonprod.aws.intellij.net/feedback'
/*     */     //   40: goto -> 57
/*     */     //   43: ldc_w 'https://forms-service.jetbrains.com/feedback'
/*     */     //   46: goto -> 57
/*     */     //   49: new kotlin/NoWhenBranchMatchedException
/*     */     //   52: dup
/*     */     //   53: invokespecial <init> : ()V
/*     */     //   56: athrow
/*     */     //   57: astore #4
/*     */     //   59: aload #4
/*     */     //   61: invokestatic tryMapUrlBlocking : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: dup
/*     */     //   65: ldc_w 'tryMapUrlBlocking(...)'
/*     */     //   68: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   71: astore #5
/*     */     //   73: getstatic feedback/GeneralFeedbackSubmitKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   76: aload #5
/*     */     //   78: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   83: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   86: aload #5
/*     */     //   88: aload_1
/*     */     //   89: aload_2
/*     */     //   90: aload_3
/*     */     //   91: invokestatic sendFeedback : (Ljava/lang/String;Lfeedback/FeedbackRequestDataHolder;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   94: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 0
/*     */     //   #109	-> 36
/*     */     //   #110	-> 37
/*     */     //   #111	-> 43
/*     */     //   #108	-> 49
/*     */     //   #114	-> 59
/*     */     //   #115	-> 73
/*     */     //   #116	-> 86
/*     */     //   #117	-> 94
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   59	36	4	feedbackUrl	Ljava/lang/String;
/*     */     //   73	22	5	regionalFeedbackUrl	Ljava/lang/String;
/*     */     //   0	95	0	$feedbackRequestType	Lfeedback/FeedbackRequestType;
/*     */     //   0	95	1	$feedbackData	Lfeedback/FeedbackRequestDataHolder;
/*     */     //   0	95	2	$onDone	Lkotlin/jvm/functions/Function0;
/*     */     //   0	95	3	$onError	Lkotlin/jvm/functions/Function0;
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
/*     */   private static final void sendFeedback(String feedbackUrl, FeedbackRequestDataHolder feedbackData, Function0 onDone, Function0 onError) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface toJsonObject : ()Lkotlinx/serialization/json/JsonObject;
/*     */     //   6: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   9: astore #4
/*     */     //   11: nop
/*     */     //   12: aload_0
/*     */     //   13: ldc 'application/json; charset=utf-8'
/*     */     //   15: invokestatic post : (Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/util/io/RequestBuilder;
/*     */     //   18: invokevirtual productNameAsUserAgent : ()Lcom/intellij/util/io/RequestBuilder;
/*     */     //   21: ldc 'application/json'
/*     */     //   23: invokevirtual accept : (Ljava/lang/String;)Lcom/intellij/util/io/RequestBuilder;
/*     */     //   26: aload #4
/*     */     //   28: aload_3
/*     */     //   29: aload_1
/*     */     //   30: aload_2
/*     */     //   31: <illegal opcode> process : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lfeedback/FeedbackRequestDataHolder;Lkotlin/jvm/functions/Function0;)Lcom/intellij/util/io/HttpRequests$RequestProcessor;
/*     */     //   36: invokevirtual connect : (Lcom/intellij/util/io/HttpRequests$RequestProcessor;)Ljava/lang/Object;
/*     */     //   39: checkcast kotlin/Unit
/*     */     //   42: pop
/*     */     //   43: goto -> 74
/*     */     //   46: astore #5
/*     */     //   48: getstatic feedback/GeneralFeedbackSubmitKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   51: aload #4
/*     */     //   53: aload #5
/*     */     //   55: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   58: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   63: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   66: aload_3
/*     */     //   67: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   72: pop
/*     */     //   73: return
/*     */     //   74: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 0
/*     */     //   #126	-> 11
/*     */     //   #128	-> 12
/*     */     //   #129	-> 18
/*     */     //   #130	-> 21
/*     */     //   #131	-> 26
/*     */     //   #166	-> 46
/*     */     //   #167	-> 48
/*     */     //   #168	-> 66
/*     */     //   #170	-> 73
/*     */     //   #172	-> 74
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   48	26	5	e	Ljava/io/IOException;
/*     */     //   11	64	4	requestData	Ljava/lang/String;
/*     */     //   0	75	0	feedbackUrl	Ljava/lang/String;
/*     */     //   0	75	1	feedbackData	Lfeedback/FeedbackRequestDataHolder;
/*     */     //   0	75	2	onDone	Lkotlin/jvm/functions/Function0;
/*     */     //   0	75	3	onError	Lkotlin/jvm/functions/Function0;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   11	43	46	java/io/IOException
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
/*     */   private static final Unit sendFeedback$lambda$1(String $requestData, Function0 $onError, FeedbackRequestDataHolder $feedbackData, Function0 $onDone, HttpRequests.Request it) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w 'it'
/*     */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   8: nop
/*     */     //   9: aload #4
/*     */     //   11: aload_0
/*     */     //   12: invokeinterface write : (Ljava/lang/String;)V
/*     */     //   17: aload #4
/*     */     //   19: invokeinterface getConnection : ()Ljava/net/URLConnection;
/*     */     //   24: dup
/*     */     //   25: ldc_w 'getConnection(...)'
/*     */     //   28: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   31: astore #5
/*     */     //   33: aload #5
/*     */     //   35: instanceof javax/net/ssl/HttpsURLConnection
/*     */     //   38: ifeq -> 114
/*     */     //   41: aload #5
/*     */     //   43: checkcast javax/net/ssl/HttpsURLConnection
/*     */     //   46: invokevirtual getResponseCode : ()I
/*     */     //   49: sipush #200
/*     */     //   52: if_icmpeq -> 114
/*     */     //   55: aload #4
/*     */     //   57: invokeinterface getConnection : ()Ljava/net/URLConnection;
/*     */     //   62: ldc_w 'Request-Id'
/*     */     //   65: invokevirtual getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   68: astore #6
/*     */     //   70: aload #4
/*     */     //   72: invokeinterface readError : ()Ljava/lang/String;
/*     */     //   77: astore #7
/*     */     //   79: getstatic feedback/GeneralFeedbackSubmitKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   82: aload_0
/*     */     //   83: aload #5
/*     */     //   85: checkcast javax/net/ssl/HttpsURLConnection
/*     */     //   88: invokevirtual getResponseCode : ()I
/*     */     //   91: aload #7
/*     */     //   93: aload #6
/*     */     //   95: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   100: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   109: pop
/*     */     //   110: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   113: areturn
/*     */     //   114: aload #4
/*     */     //   116: invokeinterface getInputStream : ()Ljava/io/InputStream;
/*     */     //   121: invokevirtual readAllBytes : ()[B
/*     */     //   124: astore #6
/*     */     //   126: getstatic feedback/GeneralFeedbackSubmitKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   129: new java/lang/String
/*     */     //   132: dup
/*     */     //   133: aload #6
/*     */     //   135: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   138: aload #6
/*     */     //   140: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   143: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   146: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   149: aload #4
/*     */     //   151: invokeinterface getConnection : ()Ljava/net/URLConnection;
/*     */     //   156: ldc_w 'Request-Id'
/*     */     //   159: invokevirtual getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   162: astore #7
/*     */     //   164: getstatic feedback/GeneralFeedbackSubmitKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   167: aload #7
/*     */     //   169: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   174: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   177: goto -> 272
/*     */     //   180: astore #5
/*     */     //   182: aload #4
/*     */     //   184: invokeinterface getConnection : ()Ljava/net/URLConnection;
/*     */     //   189: dup
/*     */     //   190: ldc_w 'null cannot be cast to non-null type java.net.HttpURLConnection'
/*     */     //   193: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   196: checkcast java/net/HttpURLConnection
/*     */     //   199: invokevirtual getErrorStream : ()Ljava/io/InputStream;
/*     */     //   202: astore #7
/*     */     //   204: aload #7
/*     */     //   206: ifnull -> 236
/*     */     //   209: aload #7
/*     */     //   211: invokevirtual readAllBytes : ()[B
/*     */     //   214: astore #8
/*     */     //   216: aload #8
/*     */     //   218: ifnull -> 236
/*     */     //   221: new java/lang/String
/*     */     //   224: dup
/*     */     //   225: aload #8
/*     */     //   227: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   230: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   233: goto -> 237
/*     */     //   236: aconst_null
/*     */     //   237: astore #6
/*     */     //   239: getstatic feedback/GeneralFeedbackSubmitKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   242: aload_0
/*     */     //   243: aload #6
/*     */     //   245: aload #5
/*     */     //   247: checkcast java/lang/Throwable
/*     */     //   250: invokestatic stackTraceToString : (Ljava/lang/Throwable;)Ljava/lang/String;
/*     */     //   253: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   258: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   261: aload_1
/*     */     //   262: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   267: pop
/*     */     //   268: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   271: areturn
/*     */     //   272: aload_2
/*     */     //   273: instanceof feedback/FeedbackRequestData
/*     */     //   276: ifeq -> 279
/*     */     //   279: aload_3
/*     */     //   280: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   285: pop
/*     */     //   286: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   289: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #132	-> 8
/*     */     //   #133	-> 9
/*     */     //   #134	-> 17
/*     */     //   #136	-> 33
/*     */     //   #137	-> 55
/*     */     //   #138	-> 70
/*     */     //   #139	-> 79
/*     */     //   #140	-> 91
/*     */     //   #139	-> 100
/*     */     //   #141	-> 103
/*     */     //   #143	-> 110
/*     */     //   #146	-> 114
/*     */     //   #147	-> 126
/*     */     //   #147	-> 146
/*     */     //   #148	-> 149
/*     */     //   #149	-> 164
/*     */     //   #151	-> 180
/*     */     //   #152	-> 182
/*     */     //   #152	-> 236
/*     */     //   #153	-> 239
/*     */     //   #154	-> 243
/*     */     //   #155	-> 245
/*     */     //   #153	-> 258
/*     */     //   #156	-> 261
/*     */     //   #158	-> 268
/*     */     //   #160	-> 272
/*     */     //   #163	-> 279
/*     */     //   #164	-> 286
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   70	44	6	requestId	Ljava/lang/String;
/*     */     //   79	35	7	errorResponse	Ljava/lang/String;
/*     */     //   33	144	5	connection	Ljava/net/URLConnection;
/*     */     //   126	51	6	bytes	[B
/*     */     //   164	13	7	requestId	Ljava/lang/String;
/*     */     //   239	33	6	errorResponse	Ljava/lang/String;
/*     */     //   182	90	5	e	Ljava/io/IOException;
/*     */     //   0	290	0	$requestData	Ljava/lang/String;
/*     */     //   0	290	1	$onError	Lkotlin/jvm/functions/Function0;
/*     */     //   0	290	2	$feedbackData	Lfeedback/FeedbackRequestDataHolder;
/*     */     //   0	290	3	$onDone	Lkotlin/jvm/functions/Function0;
/*     */     //   0	290	4	it	Lcom/intellij/util/io/HttpRequests$Request;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	177	180	java/io/IOException
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
/*     */   @NotNull
/*     */   public static final JsonElement cleanFeedbackFromEmails(@NotNull JsonElement jsonElement) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'jsonElement'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore_1
/*     */     //   8: aload_1
/*     */     //   9: instanceof kotlinx/serialization/json/JsonObject
/*     */     //   12: ifeq -> 138
/*     */     //   15: iconst_0
/*     */     //   16: istore_2
/*     */     //   17: new kotlinx/serialization/json/JsonObjectBuilder
/*     */     //   20: dup
/*     */     //   21: invokespecial <init> : ()V
/*     */     //   24: astore_3
/*     */     //   25: aload_3
/*     */     //   26: astore #4
/*     */     //   28: iconst_0
/*     */     //   29: istore #5
/*     */     //   31: aload_0
/*     */     //   32: checkcast java/util/Map
/*     */     //   35: astore #6
/*     */     //   37: iconst_0
/*     */     //   38: istore #7
/*     */     //   40: aload #6
/*     */     //   42: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   47: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   52: astore #8
/*     */     //   54: aload #8
/*     */     //   56: invokeinterface hasNext : ()Z
/*     */     //   61: ifeq -> 125
/*     */     //   64: aload #8
/*     */     //   66: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   71: checkcast java/util/Map$Entry
/*     */     //   74: astore #9
/*     */     //   76: aload #9
/*     */     //   78: astore #10
/*     */     //   80: iconst_0
/*     */     //   81: istore #11
/*     */     //   83: aload #10
/*     */     //   85: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   90: checkcast java/lang/String
/*     */     //   93: astore #12
/*     */     //   95: aload #10
/*     */     //   97: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   102: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   105: astore #13
/*     */     //   107: aload #4
/*     */     //   109: aload #12
/*     */     //   111: aload #13
/*     */     //   113: invokestatic cleanFeedbackFromEmails : (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
/*     */     //   116: invokevirtual put : (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
/*     */     //   119: pop
/*     */     //   120: nop
/*     */     //   121: nop
/*     */     //   122: goto -> 54
/*     */     //   125: nop
/*     */     //   126: nop
/*     */     //   127: nop
/*     */     //   128: aload_3
/*     */     //   129: invokevirtual build : ()Lkotlinx/serialization/json/JsonObject;
/*     */     //   132: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   135: goto -> 308
/*     */     //   138: aload_1
/*     */     //   139: instanceof kotlinx/serialization/json/JsonArray
/*     */     //   142: ifeq -> 237
/*     */     //   145: iconst_0
/*     */     //   146: istore_2
/*     */     //   147: new kotlinx/serialization/json/JsonArrayBuilder
/*     */     //   150: dup
/*     */     //   151: invokespecial <init> : ()V
/*     */     //   154: astore_3
/*     */     //   155: aload_3
/*     */     //   156: astore #4
/*     */     //   158: iconst_0
/*     */     //   159: istore #5
/*     */     //   161: aload_0
/*     */     //   162: checkcast java/lang/Iterable
/*     */     //   165: astore #6
/*     */     //   167: iconst_0
/*     */     //   168: istore #7
/*     */     //   170: aload #6
/*     */     //   172: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   177: astore #8
/*     */     //   179: aload #8
/*     */     //   181: invokeinterface hasNext : ()Z
/*     */     //   186: ifeq -> 224
/*     */     //   189: aload #8
/*     */     //   191: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   196: astore #9
/*     */     //   198: aload #9
/*     */     //   200: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   203: astore #10
/*     */     //   205: iconst_0
/*     */     //   206: istore #11
/*     */     //   208: aload #4
/*     */     //   210: aload #10
/*     */     //   212: invokestatic cleanFeedbackFromEmails : (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
/*     */     //   215: invokevirtual add : (Lkotlinx/serialization/json/JsonElement;)Z
/*     */     //   218: pop
/*     */     //   219: nop
/*     */     //   220: nop
/*     */     //   221: goto -> 179
/*     */     //   224: nop
/*     */     //   225: nop
/*     */     //   226: nop
/*     */     //   227: aload_3
/*     */     //   228: invokevirtual build : ()Lkotlinx/serialization/json/JsonArray;
/*     */     //   231: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   234: goto -> 308
/*     */     //   237: aload_1
/*     */     //   238: instanceof kotlinx/serialization/json/JsonPrimitive
/*     */     //   241: ifeq -> 300
/*     */     //   244: invokestatic getEMAIL_REGEX : ()Lkotlin/text/Regex;
/*     */     //   247: aload_0
/*     */     //   248: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   251: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   254: checkcast java/lang/CharSequence
/*     */     //   257: iconst_0
/*     */     //   258: iconst_2
/*     */     //   259: aconst_null
/*     */     //   260: invokestatic find$default : (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
/*     */     //   263: ifnull -> 290
/*     */     //   266: invokestatic getEMAIL_REGEX : ()Lkotlin/text/Regex;
/*     */     //   269: aload_0
/*     */     //   270: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   273: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   276: checkcast java/lang/CharSequence
/*     */     //   279: ldc '<EMAIL>'
/*     */     //   281: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   284: invokestatic JsonPrimitive : (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
/*     */     //   287: goto -> 294
/*     */     //   290: aload_0
/*     */     //   291: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   294: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   297: goto -> 308
/*     */     //   300: new kotlin/NoWhenBranchMatchedException
/*     */     //   303: dup
/*     */     //   304: invokespecial <init> : ()V
/*     */     //   307: athrow
/*     */     //   308: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #181	-> 6
/*     */     //   #182	-> 8
/*     */     //   #183	-> 15
/*     */     //   #235	-> 17
/*     */     //   #236	-> 25
/*     */     //   #184	-> 31
/*     */     //   #237	-> 40
/*     */     //   #237	-> 52
/*     */     //   #184	-> 83
/*     */     //   #184	-> 90
/*     */     //   #184	-> 102
/*     */     //   #185	-> 107
/*     */     //   #186	-> 120
/*     */     //   #237	-> 121
/*     */     //   #238	-> 125
/*     */     //   #187	-> 126
/*     */     //   #236	-> 127
/*     */     //   #239	-> 128
/*     */     //   #189	-> 138
/*     */     //   #190	-> 145
/*     */     //   #240	-> 147
/*     */     //   #241	-> 155
/*     */     //   #191	-> 161
/*     */     //   #242	-> 170
/*     */     //   #192	-> 208
/*     */     //   #193	-> 219
/*     */     //   #242	-> 220
/*     */     //   #243	-> 224
/*     */     //   #194	-> 225
/*     */     //   #241	-> 226
/*     */     //   #244	-> 227
/*     */     //   #196	-> 237
/*     */     //   #197	-> 244
/*     */     //   #198	-> 266
/*     */     //   #201	-> 290
/*     */     //   #181	-> 300
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   83	38	11	$i$a$-forEach-GeneralFeedbackSubmitKt$cleanFeedbackFromEmails$1$1	I
/*     */     //   95	26	12	key	Ljava/lang/String;
/*     */     //   107	14	13	element	Lkotlinx/serialization/json/JsonElement;
/*     */     //   76	46	9	element$iv	Ljava/util/Map$Entry;
/*     */     //   40	86	7	$i$f$forEach	I
/*     */     //   37	89	6	$this$forEach$iv	Ljava/util/Map;
/*     */     //   31	96	5	$i$a$-buildJsonObject-GeneralFeedbackSubmitKt$cleanFeedbackFromEmails$1	I
/*     */     //   28	99	4	$this$cleanFeedbackFromEmails_u24lambda_u243	Lkotlinx/serialization/json/JsonObjectBuilder;
/*     */     //   17	115	2	$i$f$buildJsonObject	I
/*     */     //   25	107	3	builder$iv	Lkotlinx/serialization/json/JsonObjectBuilder;
/*     */     //   208	12	11	$i$a$-forEach-GeneralFeedbackSubmitKt$cleanFeedbackFromEmails$2$1	I
/*     */     //   205	15	10	element	Lkotlinx/serialization/json/JsonElement;
/*     */     //   198	23	9	element$iv	Ljava/lang/Object;
/*     */     //   170	55	7	$i$f$forEach	I
/*     */     //   167	58	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   161	65	5	$i$a$-buildJsonArray-GeneralFeedbackSubmitKt$cleanFeedbackFromEmails$2	I
/*     */     //   158	68	4	$this$cleanFeedbackFromEmails_u24lambda_u245	Lkotlinx/serialization/json/JsonArrayBuilder;
/*     */     //   147	84	2	$i$f$buildJsonArray	I
/*     */     //   155	76	3	builder$iv	Lkotlinx/serialization/json/JsonArrayBuilder;
/*     */     //   0	309	0	jsonElement	Lkotlinx/serialization/json/JsonElement;
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
/*     */   @NotNull
/*     */   public static final String getProductTag() {
/* 212 */     return 
/* 213 */       PlatformUtils.isIntelliJ() ? "ij_idea1" : (
/* 214 */       PlatformUtils.isPhpStorm() ? "ij_phpstorm1" : (
/* 215 */       PlatformUtils.isWebStorm() ? "ij_webstorm1" : (
/* 216 */       PlatformUtils.isPyCharm() ? "ij_pycharm1" : (
/* 217 */       PlatformUtils.isRubyMine() ? "ij_rubymine1" : (
/* 218 */       PlatformUtils.isAppCode() ? "ij_appcode1" : (
/* 219 */       (PlatformUtils.isCLion() && !isCLionNova()) ? "ij_clion1" : (
/* 220 */       (PlatformUtils.isCLion() && isCLionNova()) ? "ij_clion_nova1" : (
/* 221 */       PlatformUtils.isDataGrip() ? "ij_datagrip1" : (
/* 222 */       PlatformUtils.isGoIde() ? "ij_goland1" : (
/* 223 */       PlatformUtils.isJetBrainsClient() ? "ij_code_with_me1" : (
/* 224 */       PlatformUtils.isDataSpell() ? "ij_dataspell1" : (
/* 225 */       PlatformUtils.isRider() ? "ij_rider1" : (
/* 226 */       PlatformUtils.isRustRover() ? "ij_rustrover1" : (
/* 227 */       PlatformUtils.isAqua() ? "ij_aqua1" : 
/* 228 */       "undefined"))))))))))))));
/*     */   }
/*     */ 
/*     */   
/*     */   private static final boolean isCLionNova() {
/* 233 */     Intrinsics.checkNotNullExpressionValue(ApplicationNamesInfo.getInstance().getFullProductNameWithEdition(), "getFullProductNameWithEdition(...)"); return StringsKt.contains$default(ApplicationNamesInfo.getInstance().getFullProductNameWithEdition(), "Nova", false, 2, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\GeneralFeedbackSubmitKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */