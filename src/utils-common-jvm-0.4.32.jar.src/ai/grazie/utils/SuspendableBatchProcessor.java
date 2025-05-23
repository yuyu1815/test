/*     */ package ai.grazie.utils;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.channels.Channel;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\b\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003:\002)*Bt\022=\020\004\0329\b\001\022\031\022\027\022\004\022\0028\0000\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\020\022\016\022\n\022\b\022\004\022\0028\0010\0060\n\022\006\022\004\030\0010\0030\005\022\b\b\002\020\013\032\0020\f\022\032\b\002\020\r\032\024\022\n\022\b\022\004\022\0028\0000\006\022\004\022\0020\f0\016\022\b\b\002\020\017\032\0020\020¢\006\002\020\021J*\020\033\032\0020\0342\f\020\t\032\b\022\004\022\0028\0000\0062\f\020\035\032\b\022\004\022\0028\0010\036H@¢\006\002\020\037J0\020 \032\b\022\004\022\0028\0010\0062\f\020\t\032\b\022\004\022\0028\0000\0062\f\020\035\032\b\022\004\022\0028\0010\036H@¢\006\002\020\037J(\020!\032\0020\0342\030\020\"\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010#0\006H@¢\006\002\020$J\016\020%\032\0020\034H@¢\006\002\020&J\"\020'\032\b\022\004\022\0028\0010\0062\f\020\t\032\b\022\004\022\0028\0000\006H@¢\006\002\020$J\016\020(\032\0020\034H@¢\006\002\020&R\032\020\022\032\016\022\004\022\0028\000\022\004\022\0028\0010\023X\016¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\016\020\024\032\0020\025X\004¢\006\002\n\000R\016\020\017\032\0020\020X\004¢\006\002\n\000R \020\r\032\024\022\n\022\b\022\004\022\0028\0000\006\022\004\022\0020\f0\016X\004¢\006\002\n\000R\016\020\026\032\0020\027X\016¢\006\002\n\000R\016\020\030\032\0020\031X\004¢\006\002\n\000RG\020\004\0329\b\001\022\031\022\027\022\004\022\0028\0000\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\020\022\016\022\n\022\b\022\004\022\0028\0010\0060\n\022\006\022\004\030\0010\0030\005X\004¢\006\004\n\002\020\032¨\006+"}, d2 = {"Lai/grazie/utils/SuspendableBatchProcessor;", "T", "Result", "", "process", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "parameters", "Lkotlin/coroutines/Continuation;", "bufferLimit", "", "counter", "Lkotlin/Function1;", "bufferTimeout", "Lai/grazie/utils/mpp/time/Duration;", "(Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function1;Lai/grazie/utils/mpp/time/Duration;)V", "buffer", "Lai/grazie/utils/SuspendableBatchProcessor$Buffer;", "bufferMutex", "Lkotlinx/coroutines/sync/Mutex;", "isBufferingInProgress", "", "log", "Lai/grazie/utils/mpp/MPPLogger;", "Lkotlin/jvm/functions/Function2;", "addToBuffer", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "(Ljava/util/List;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResult", "processBatch", "batch", "Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processBuffer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processWithBatching", "startProcessing", "Buffer", "BufferItem", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nSuspendableBatchProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableBatchProcessor.kt\nai/grazie/utils/SuspendableBatchProcessor\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n116#2,7:114\n124#2,2:125\n116#2,10:127\n1557#3:121\n1628#3,3:122\n1557#3:137\n1628#3,3:138\n*S KotlinDebug\n*F\n+ 1 SuspendableBatchProcessor.kt\nai/grazie/utils/SuspendableBatchProcessor\n*L\n87#1:114,7\n87#1:125,2\n96#1:127,10\n88#1:121\n88#1:122,3\n107#1:137\n107#1:138,3\n*E\n"})
/*     */ public final class SuspendableBatchProcessor<T, Result> {
/*     */   @NotNull
/*     */   private final Function2<List<? extends T>, Continuation<? super List<? extends Result>>, Object> process;
/*     */   private final int bufferLimit;
/*     */   @NotNull
/*     */   private final Function1<List<? extends T>, Integer> counter;
/*     */   @NotNull
/*     */   private final Duration bufferTimeout;
/*     */   @NotNull
/*     */   private Buffer<T, Result> buffer;
/*     */   private boolean isBufferingInProgress;
/*     */   @NotNull
/*     */   private final Mutex bufferMutex;
/*     */   @NotNull
/*     */   private final MPPLogger log;
/*     */   
/*  28 */   public SuspendableBatchProcessor(@NotNull Function2<List<? extends T>, Continuation<? super List<? extends Result>>, Object> process, int bufferLimit, @NotNull Function1<List<? extends T>, Integer> counter, @NotNull Duration bufferTimeout) { this.process = process;
/*  29 */     this.bufferLimit = bufferLimit;
/*  30 */     this.counter = counter;
/*  31 */     this.bufferTimeout = bufferTimeout;
/*     */     
/*  33 */     this.buffer = new Buffer<>();
/*     */     
/*  35 */     this.bufferMutex = MutexKt.Mutex$default(false, 1, null);
/*  36 */     this.log = LoggerFactory.INSTANCE.create("batch-processor"); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\002\020\001*\004\b\003\020\0022\0020\003B\033\022\006\020\004\032\0028\002\022\f\020\005\032\b\022\004\022\0028\0030\006¢\006\002\020\007J\016\020\r\032\0028\002HÆ\003¢\006\002\020\013J\017\020\016\032\b\022\004\022\0028\0030\006HÆ\003J4\020\017\032\016\022\004\022\0028\002\022\004\022\0028\0030\0002\b\b\002\020\004\032\0028\0022\016\b\002\020\005\032\b\022\004\022\0028\0030\006HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\003HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\027HÖ\001R\027\020\005\032\b\022\004\022\0028\0030\006¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\0028\002¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\030"}, d2 = {"Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;", "T", "Result", "", "parameter", "channel", "Lkotlinx/coroutines/channels/Channel;", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Channel;)V", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "getParameter", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Channel;)Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;", "equals", "", "other", "hashCode", "", "toString", "", "utils-common"})
/*     */   private static final class BufferItem<T, Result> { private final T parameter; @NotNull
/*  38 */     private final Channel<Result> channel; public BufferItem(Object parameter, @NotNull Channel<Result> channel) { this.parameter = (T)parameter; this.channel = channel; } public final T getParameter() { return this.parameter; } public final T component1() { return this.parameter; } @NotNull public final Channel<Result> component2() { return this.channel; } @NotNull public final BufferItem<T, Result> copy(Object parameter, @NotNull Channel<Result> channel) { Intrinsics.checkNotNullParameter(channel, "channel"); return new BufferItem((T)parameter, channel); } @NotNull public final Channel<Result> getChannel() { return this.channel; } @NotNull public String toString() { return "BufferItem(parameter=" + this.parameter + ", channel=" + this.channel + ")"; } public int hashCode() { result = (this.parameter == null) ? 0 : this.parameter.hashCode(); return result * 31 + this.channel.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof BufferItem)) return false;  BufferItem bufferItem = (BufferItem)other; return !Intrinsics.areEqual(this.parameter, bufferItem.parameter) ? false : (!!Intrinsics.areEqual(this.channel, bufferItem.channel)); } }
/*     */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\b\003\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\0020\003B\005¢\006\002\020\004R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R#\020\017\032\024\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\0210\020¢\006\b\n\000\032\004\b\022\020\023¨\006\024"}, d2 = {"Lai/grazie/utils/SuspendableBatchProcessor$Buffer;", "T", "Result", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "id", "Lai/grazie/utils/mpp/UUID;", "getId", "()Lai/grazie/utils/mpp/UUID;", "items", "", "Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;", "getItems", "()Ljava/util/List;", "utils-common"}) private static final class Buffer<T, Result> {
/*  40 */     @NotNull private final UUID id; public Buffer() { this.id = UUID.Companion.random();
/*  41 */       this.items = new ArrayList<>(); } @NotNull private final List<SuspendableBatchProcessor.BufferItem<T, Result>> items; private int count; @NotNull public final UUID getId() { return this.id; } @NotNull public final List<SuspendableBatchProcessor.BufferItem<T, Result>> getItems() { return this.items; }
/*  42 */     public final int getCount() { return this.count; } public final void setCount(int <set-?>) { this.count = <set-?>; }
/*     */      }
/*     */   @Nullable
/*     */   public final Object processWithBatching(@NotNull List parameters, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/utils/SuspendableBatchProcessor$processWithBatching$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/utils/SuspendableBatchProcessor$processWithBatching$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/utils/SuspendableBatchProcessor$processWithBatching$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 291, 0 -> 92, 1 -> 148, 2 -> 236
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: iconst_0
/*     */     //   98: aconst_null
/*     */     //   99: aconst_null
/*     */     //   100: bipush #7
/*     */     //   102: aconst_null
/*     */     //   103: invokestatic Channel$default : (ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
/*     */     //   106: astore_3
/*     */     //   107: aload_0
/*     */     //   108: aload_1
/*     */     //   109: aload_3
/*     */     //   110: aload #7
/*     */     //   112: aload #7
/*     */     //   114: aload_0
/*     */     //   115: putfield L$0 : Ljava/lang/Object;
/*     */     //   118: aload #7
/*     */     //   120: aload_1
/*     */     //   121: putfield L$1 : Ljava/lang/Object;
/*     */     //   124: aload #7
/*     */     //   126: aload_3
/*     */     //   127: putfield L$2 : Ljava/lang/Object;
/*     */     //   130: aload #7
/*     */     //   132: iconst_1
/*     */     //   133: putfield label : I
/*     */     //   136: invokespecial addToBuffer : (Ljava/util/List;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   139: dup
/*     */     //   140: aload #8
/*     */     //   142: if_acmpne -> 182
/*     */     //   145: aload #8
/*     */     //   147: areturn
/*     */     //   148: aload #7
/*     */     //   150: getfield L$2 : Ljava/lang/Object;
/*     */     //   153: checkcast kotlinx/coroutines/channels/Channel
/*     */     //   156: astore_3
/*     */     //   157: aload #7
/*     */     //   159: getfield L$1 : Ljava/lang/Object;
/*     */     //   162: checkcast java/util/List
/*     */     //   165: astore_1
/*     */     //   166: aload #7
/*     */     //   168: getfield L$0 : Ljava/lang/Object;
/*     */     //   171: checkcast ai/grazie/utils/SuspendableBatchProcessor
/*     */     //   174: astore_0
/*     */     //   175: aload #6
/*     */     //   177: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   180: aload #6
/*     */     //   182: pop
/*     */     //   183: nop
/*     */     //   184: new ai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2
/*     */     //   187: dup
/*     */     //   188: aload_0
/*     */     //   189: aload_1
/*     */     //   190: aload_3
/*     */     //   191: aconst_null
/*     */     //   192: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Ljava/util/List;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
/*     */     //   195: checkcast kotlin/jvm/functions/Function2
/*     */     //   198: aload #7
/*     */     //   200: aload #7
/*     */     //   202: aload_3
/*     */     //   203: putfield L$0 : Ljava/lang/Object;
/*     */     //   206: aload #7
/*     */     //   208: aconst_null
/*     */     //   209: putfield L$1 : Ljava/lang/Object;
/*     */     //   212: aload #7
/*     */     //   214: aconst_null
/*     */     //   215: putfield L$2 : Ljava/lang/Object;
/*     */     //   218: aload #7
/*     */     //   220: iconst_2
/*     */     //   221: putfield label : I
/*     */     //   224: invokestatic coroutineScope : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   227: dup
/*     */     //   228: aload #8
/*     */     //   230: if_acmpne -> 253
/*     */     //   233: aload #8
/*     */     //   235: areturn
/*     */     //   236: aload #7
/*     */     //   238: getfield L$0 : Ljava/lang/Object;
/*     */     //   241: checkcast kotlinx/coroutines/channels/Channel
/*     */     //   244: astore_3
/*     */     //   245: nop
/*     */     //   246: aload #6
/*     */     //   248: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   251: aload #6
/*     */     //   253: checkcast java/util/List
/*     */     //   256: astore #4
/*     */     //   258: aload_3
/*     */     //   259: checkcast kotlinx/coroutines/channels/SendChannel
/*     */     //   262: aconst_null
/*     */     //   263: iconst_1
/*     */     //   264: aconst_null
/*     */     //   265: invokestatic close$default : (Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z
/*     */     //   268: pop
/*     */     //   269: goto -> 288
/*     */     //   272: astore #5
/*     */     //   274: aload_3
/*     */     //   275: checkcast kotlinx/coroutines/channels/SendChannel
/*     */     //   278: aconst_null
/*     */     //   279: iconst_1
/*     */     //   280: aconst_null
/*     */     //   281: invokestatic close$default : (Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z
/*     */     //   284: pop
/*     */     //   285: aload #5
/*     */     //   287: athrow
/*     */     //   288: aload #4
/*     */     //   290: areturn
/*     */     //   291: new java/lang/IllegalStateException
/*     */     //   294: dup
/*     */     //   295: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   297: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   300: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 60
/*     */     //   #49	-> 97
/*     */     //   #50	-> 107
/*     */     //   #48	-> 145
/*     */     //   #51	-> 182
/*     */     //   #52	-> 183
/*     */     //   #53	-> 184
/*     */     //   #48	-> 233
/*     */     //   #65	-> 258
/*     */     //   #66	-> 269
/*     */     //   #65	-> 272
/*     */     //   #67	-> 288
/*     */     //   #48	-> 291
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	51	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   175	52	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   97	51	1	parameters	Ljava/util/List;
/*     */     //   166	61	1	parameters	Ljava/util/List;
/*     */     //   107	41	3	resultChannel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   157	79	3	resultChannel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   245	24	3	resultChannel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   272	19	3	resultChannel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   258	14	4	result	Ljava/util/List;
/*     */     //   288	3	4	result	Ljava/util/List;
/*     */     //   0	301	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	241	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	234	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   183	227	272	finally
/*     */     //   245	258	272	finally
/*     */     //   272	274	272	finally
/*     */   }
/*     */   @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {118, 62}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "ai.grazie.utils.SuspendableBatchProcessor$processWithBatching$2")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\b\002\n\002\030\002\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\003\"\004\b\001\020\002*\0020\004H@"}, d2 = {"<anonymous>", "", "Result", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nSuspendableBatchProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableBatchProcessor.kt\nai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,113:1\n116#2,10:114\n*S KotlinDebug\n*F\n+ 1 SuspendableBatchProcessor.kt\nai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2\n*L\n54#1:114,10\n*E\n"})
/*     */   static final class SuspendableBatchProcessor$processWithBatching$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Result>>, Object> { Object L$1; Object L$2;
/*     */     int label;
/*     */     
/*     */     SuspendableBatchProcessor$processWithBatching$2(List<T> $parameters, Channel<Result> $resultChannel, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #10
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 273, 0 -> 36, 1 -> 111, 2 -> 267
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: aload_0
/*     */       //   49: getfield this$0 : Lai/grazie/utils/SuspendableBatchProcessor;
/*     */       //   52: invokestatic access$getBufferMutex$p : (Lai/grazie/utils/SuspendableBatchProcessor;)Lkotlinx/coroutines/sync/Mutex;
/*     */       //   55: astore_3
/*     */       //   56: aload_0
/*     */       //   57: getfield this$0 : Lai/grazie/utils/SuspendableBatchProcessor;
/*     */       //   60: astore #5
/*     */       //   62: aconst_null
/*     */       //   63: astore #4
/*     */       //   65: iconst_0
/*     */       //   66: istore #6
/*     */       //   68: nop
/*     */       //   69: aload_3
/*     */       //   70: aload #4
/*     */       //   72: aload_0
/*     */       //   73: checkcast kotlin/coroutines/Continuation
/*     */       //   76: aload_0
/*     */       //   77: aload_2
/*     */       //   78: putfield L$0 : Ljava/lang/Object;
/*     */       //   81: aload_0
/*     */       //   82: aload_3
/*     */       //   83: putfield L$1 : Ljava/lang/Object;
/*     */       //   86: aload_0
/*     */       //   87: aload #5
/*     */       //   89: putfield L$2 : Ljava/lang/Object;
/*     */       //   92: aload_0
/*     */       //   93: iconst_1
/*     */       //   94: putfield label : I
/*     */       //   97: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   102: dup
/*     */       //   103: aload #10
/*     */       //   105: if_acmpne -> 147
/*     */       //   108: aload #10
/*     */       //   110: areturn
/*     */       //   111: iconst_0
/*     */       //   112: istore #6
/*     */       //   114: aload_0
/*     */       //   115: getfield L$2 : Ljava/lang/Object;
/*     */       //   118: checkcast ai/grazie/utils/SuspendableBatchProcessor
/*     */       //   121: astore #5
/*     */       //   123: aconst_null
/*     */       //   124: astore #4
/*     */       //   126: aload_0
/*     */       //   127: getfield L$1 : Ljava/lang/Object;
/*     */       //   130: checkcast kotlinx/coroutines/sync/Mutex
/*     */       //   133: astore_3
/*     */       //   134: aload_0
/*     */       //   135: getfield L$0 : Ljava/lang/Object;
/*     */       //   138: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   141: astore_2
/*     */       //   142: aload_1
/*     */       //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   146: aload_1
/*     */       //   147: pop
/*     */       //   148: nop
/*     */       //   149: iconst_0
/*     */       //   150: istore #7
/*     */       //   152: aload #5
/*     */       //   154: invokestatic access$isBufferingInProgress$p : (Lai/grazie/utils/SuspendableBatchProcessor;)Z
/*     */       //   157: ifne -> 188
/*     */       //   160: aload #5
/*     */       //   162: iconst_1
/*     */       //   163: invokestatic access$setBufferingInProgress$p : (Lai/grazie/utils/SuspendableBatchProcessor;Z)V
/*     */       //   166: aload_2
/*     */       //   167: aconst_null
/*     */       //   168: aconst_null
/*     */       //   169: new ai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2$1$1
/*     */       //   172: dup
/*     */       //   173: aload #5
/*     */       //   175: aconst_null
/*     */       //   176: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*     */       //   179: checkcast kotlin/jvm/functions/Function2
/*     */       //   182: iconst_3
/*     */       //   183: aconst_null
/*     */       //   184: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */       //   187: pop
/*     */       //   188: nop
/*     */       //   189: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   192: astore #8
/*     */       //   194: aload_3
/*     */       //   195: aload #4
/*     */       //   197: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   202: goto -> 218
/*     */       //   205: astore #9
/*     */       //   207: aload_3
/*     */       //   208: aload #4
/*     */       //   210: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   215: aload #9
/*     */       //   217: athrow
/*     */       //   218: nop
/*     */       //   219: aload_0
/*     */       //   220: getfield this$0 : Lai/grazie/utils/SuspendableBatchProcessor;
/*     */       //   223: aload_0
/*     */       //   224: getfield $parameters : Ljava/util/List;
/*     */       //   227: aload_0
/*     */       //   228: getfield $resultChannel : Lkotlinx/coroutines/channels/Channel;
/*     */       //   231: aload_0
/*     */       //   232: checkcast kotlin/coroutines/Continuation
/*     */       //   235: aload_0
/*     */       //   236: aconst_null
/*     */       //   237: putfield L$0 : Ljava/lang/Object;
/*     */       //   240: aload_0
/*     */       //   241: aconst_null
/*     */       //   242: putfield L$1 : Ljava/lang/Object;
/*     */       //   245: aload_0
/*     */       //   246: aconst_null
/*     */       //   247: putfield L$2 : Ljava/lang/Object;
/*     */       //   250: aload_0
/*     */       //   251: iconst_2
/*     */       //   252: putfield label : I
/*     */       //   255: invokestatic access$getResult : (Lai/grazie/utils/SuspendableBatchProcessor;Ljava/util/List;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   258: dup
/*     */       //   259: aload #10
/*     */       //   261: if_acmpne -> 272
/*     */       //   264: aload #10
/*     */       //   266: areturn
/*     */       //   267: aload_1
/*     */       //   268: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   271: aload_1
/*     */       //   272: areturn
/*     */       //   273: new java/lang/IllegalStateException
/*     */       //   276: dup
/*     */       //   277: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   279: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   282: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #53	-> 3
/*     */       //   #54	-> 48
/*     */       //   #114	-> 62
/*     */       //   #115	-> 68
/*     */       //   #118	-> 69
/*     */       //   #53	-> 108
/*     */       //   #119	-> 147
/*     */       //   #120	-> 149
/*     */       //   #55	-> 152
/*     */       //   #56	-> 160
/*     */       //   #57	-> 166
/*     */       //   #61	-> 188
/*     */       //   #120	-> 192
/*     */       //   #122	-> 194
/*     */       //   #123	-> 202
/*     */       //   #122	-> 205
/*     */       //   #119	-> 218
/*     */       //   #62	-> 219
/*     */       //   #53	-> 264
/*     */       //   #62	-> 272
/*     */       //   #53	-> 273
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	63	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   142	46	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   62	49	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   134	55	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   189	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   205	14	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   65	46	4	owner$iv	Ljava/lang/Object;
/*     */       //   134	55	4	owner$iv	Ljava/lang/Object;
/*     */       //   189	13	4	owner$iv	Ljava/lang/Object;
/*     */       //   205	14	4	owner$iv	Ljava/lang/Object;
/*     */       //   152	37	7	$i$a$-withLock$default-SuspendableBatchProcessor$processWithBatching$2$1	I
/*     */       //   68	43	6	$i$f$withLock	I
/*     */       //   0	283	0	this	Lai/grazie/utils/SuspendableBatchProcessor$processWithBatching$2;
/*     */       //   40	233	1	$result	Ljava/lang/Object;
/*     */       //   114	105	6	$i$f$withLock	I
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   148	194	205	finally
/*     */       //   205	207	205	finally
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super SuspendableBatchProcessor$processWithBatching$2> $completion) {
/*     */       SuspendableBatchProcessor$processWithBatching$2 suspendableBatchProcessor$processWithBatching$2 = new SuspendableBatchProcessor$processWithBatching$2(this.$parameters, this.$resultChannel, $completion);
/*     */       suspendableBatchProcessor$processWithBatching$2.L$0 = value;
/*     */       return (Continuation<Unit>)suspendableBatchProcessor$processWithBatching$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((SuspendableBatchProcessor$processWithBatching$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   
/*     */   private final Object startProcessing(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/utils/SuspendableBatchProcessor$startProcessing$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/utils/SuspendableBatchProcessor$startProcessing$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #4
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/utils/SuspendableBatchProcessor$startProcessing$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore_3
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #5
/*     */     //   61: aload #4
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 236, 0 -> 92, 1 -> 166, 2 -> 226
/*     */     //   92: aload_3
/*     */     //   93: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   96: getstatic ai/grazie/utils/mpp/time/Timer.Companion : Lai/grazie/utils/mpp/time/Timer$Companion;
/*     */     //   99: invokevirtual start : ()Lai/grazie/utils/mpp/time/Timer;
/*     */     //   102: astore_2
/*     */     //   103: aload_0
/*     */     //   104: getfield buffer : Lai/grazie/utils/SuspendableBatchProcessor$Buffer;
/*     */     //   107: invokevirtual getCount : ()I
/*     */     //   110: aload_0
/*     */     //   111: getfield bufferLimit : I
/*     */     //   114: if_icmpgt -> 193
/*     */     //   117: aload_2
/*     */     //   118: invokevirtual elapsed : ()Lai/grazie/utils/mpp/time/Duration;
/*     */     //   121: aload_0
/*     */     //   122: getfield bufferTimeout : Lai/grazie/utils/mpp/time/Duration;
/*     */     //   125: invokevirtual compareTo : (Lai/grazie/utils/mpp/time/Duration;)I
/*     */     //   128: ifge -> 193
/*     */     //   131: ldc2_w 10
/*     */     //   134: aload #4
/*     */     //   136: aload #4
/*     */     //   138: aload_0
/*     */     //   139: putfield L$0 : Ljava/lang/Object;
/*     */     //   142: aload #4
/*     */     //   144: aload_2
/*     */     //   145: putfield L$1 : Ljava/lang/Object;
/*     */     //   148: aload #4
/*     */     //   150: iconst_1
/*     */     //   151: putfield label : I
/*     */     //   154: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   157: dup
/*     */     //   158: aload #5
/*     */     //   160: if_acmpne -> 189
/*     */     //   163: aload #5
/*     */     //   165: areturn
/*     */     //   166: aload #4
/*     */     //   168: getfield L$1 : Ljava/lang/Object;
/*     */     //   171: checkcast ai/grazie/utils/mpp/time/Timer
/*     */     //   174: astore_2
/*     */     //   175: aload #4
/*     */     //   177: getfield L$0 : Ljava/lang/Object;
/*     */     //   180: checkcast ai/grazie/utils/SuspendableBatchProcessor
/*     */     //   183: astore_0
/*     */     //   184: aload_3
/*     */     //   185: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   188: aload_3
/*     */     //   189: pop
/*     */     //   190: goto -> 103
/*     */     //   193: aload_0
/*     */     //   194: aload #4
/*     */     //   196: aload #4
/*     */     //   198: aconst_null
/*     */     //   199: putfield L$0 : Ljava/lang/Object;
/*     */     //   202: aload #4
/*     */     //   204: aconst_null
/*     */     //   205: putfield L$1 : Ljava/lang/Object;
/*     */     //   208: aload #4
/*     */     //   210: iconst_2
/*     */     //   211: putfield label : I
/*     */     //   214: invokespecial processBuffer : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   217: dup
/*     */     //   218: aload #5
/*     */     //   220: if_acmpne -> 231
/*     */     //   223: aload #5
/*     */     //   225: areturn
/*     */     //   226: aload_3
/*     */     //   227: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   230: aload_3
/*     */     //   231: pop
/*     */     //   232: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   235: areturn
/*     */     //   236: new java/lang/IllegalStateException
/*     */     //   239: dup
/*     */     //   240: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   242: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   245: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 59
/*     */     //   #71	-> 96
/*     */     //   #72	-> 103
/*     */     //   #73	-> 131
/*     */     //   #70	-> 163
/*     */     //   #73	-> 189
/*     */     //   #75	-> 193
/*     */     //   #70	-> 223
/*     */     //   #76	-> 231
/*     */     //   #70	-> 236
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   96	70	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   184	33	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   103	63	2	timer	Lai/grazie/utils/mpp/time/Timer;
/*     */     //   175	18	2	timer	Lai/grazie/utils/mpp/time/Timer;
/*     */     //   0	246	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	186	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	180	3	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final Object getResult(List parameters, Channel channel, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/utils/SuspendableBatchProcessor$getResult$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/utils/SuspendableBatchProcessor$getResult$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/utils/SuspendableBatchProcessor$getResult$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 250, 0 -> 88, 1 -> 184
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new java/util/ArrayList
/*     */     //   96: dup
/*     */     //   97: invokespecial <init> : ()V
/*     */     //   100: astore #4
/*     */     //   102: iconst_0
/*     */     //   103: istore #5
/*     */     //   105: aload_1
/*     */     //   106: checkcast java/util/Collection
/*     */     //   109: invokeinterface size : ()I
/*     */     //   114: istore #6
/*     */     //   116: iload #5
/*     */     //   118: iload #6
/*     */     //   120: if_icmpge -> 247
/*     */     //   123: aload #4
/*     */     //   125: astore #7
/*     */     //   127: aload_2
/*     */     //   128: aload #9
/*     */     //   130: aload #9
/*     */     //   132: aload_2
/*     */     //   133: putfield L$0 : Ljava/lang/Object;
/*     */     //   136: aload #9
/*     */     //   138: aload #4
/*     */     //   140: putfield L$1 : Ljava/lang/Object;
/*     */     //   143: aload #9
/*     */     //   145: aload #7
/*     */     //   147: putfield L$2 : Ljava/lang/Object;
/*     */     //   150: aload #9
/*     */     //   152: iload #5
/*     */     //   154: putfield I$0 : I
/*     */     //   157: aload #9
/*     */     //   159: iload #6
/*     */     //   161: putfield I$1 : I
/*     */     //   164: aload #9
/*     */     //   166: iconst_1
/*     */     //   167: putfield label : I
/*     */     //   170: invokeinterface receive : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   175: dup
/*     */     //   176: aload #10
/*     */     //   178: if_acmpne -> 234
/*     */     //   181: aload #10
/*     */     //   183: areturn
/*     */     //   184: aload #9
/*     */     //   186: getfield I$1 : I
/*     */     //   189: istore #6
/*     */     //   191: aload #9
/*     */     //   193: getfield I$0 : I
/*     */     //   196: istore #5
/*     */     //   198: aload #9
/*     */     //   200: getfield L$2 : Ljava/lang/Object;
/*     */     //   203: checkcast java/util/ArrayList
/*     */     //   206: astore #7
/*     */     //   208: aload #9
/*     */     //   210: getfield L$1 : Ljava/lang/Object;
/*     */     //   213: checkcast java/util/ArrayList
/*     */     //   216: astore #4
/*     */     //   218: aload #9
/*     */     //   220: getfield L$0 : Ljava/lang/Object;
/*     */     //   223: checkcast kotlinx/coroutines/channels/Channel
/*     */     //   226: astore_2
/*     */     //   227: aload #8
/*     */     //   229: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   232: aload #8
/*     */     //   234: aload #7
/*     */     //   236: swap
/*     */     //   237: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   240: pop
/*     */     //   241: iinc #5, 1
/*     */     //   244: goto -> 116
/*     */     //   247: aload #4
/*     */     //   249: areturn
/*     */     //   250: new java/lang/IllegalStateException
/*     */     //   253: dup
/*     */     //   254: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   256: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   259: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #78	-> 60
/*     */     //   #79	-> 93
/*     */     //   #80	-> 102
/*     */     //   #81	-> 123
/*     */     //   #78	-> 181
/*     */     //   #81	-> 234
/*     */     //   #80	-> 241
/*     */     //   #83	-> 247
/*     */     //   #78	-> 250
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	23	1	parameters	Ljava/util/List;
/*     */     //   93	91	2	channel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   227	23	2	channel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   102	82	4	result	Ljava/util/ArrayList;
/*     */     //   218	32	4	result	Ljava/util/ArrayList;
/*     */     //   105	79	5	i	I
/*     */     //   198	49	5	i	I
/*     */     //   0	260	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	200	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	193	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final Object addToBuffer(List parameters, Channel channel, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/utils/SuspendableBatchProcessor$addToBuffer$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/utils/SuspendableBatchProcessor$addToBuffer$1
/*     */     //   11: astore #22
/*     */     //   13: aload #22
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #22
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/utils/SuspendableBatchProcessor$addToBuffer$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #22
/*     */     //   50: aload #22
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #21
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #23
/*     */     //   62: aload #22
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 425, 0 -> 88, 1 -> 157
/*     */     //   88: aload #21
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield bufferMutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   97: astore #4
/*     */     //   99: aconst_null
/*     */     //   100: astore #5
/*     */     //   102: iconst_0
/*     */     //   103: istore #6
/*     */     //   105: nop
/*     */     //   106: aload #4
/*     */     //   108: aload #5
/*     */     //   110: aload #22
/*     */     //   112: aload #22
/*     */     //   114: aload_0
/*     */     //   115: putfield L$0 : Ljava/lang/Object;
/*     */     //   118: aload #22
/*     */     //   120: aload_1
/*     */     //   121: putfield L$1 : Ljava/lang/Object;
/*     */     //   124: aload #22
/*     */     //   126: aload_2
/*     */     //   127: putfield L$2 : Ljava/lang/Object;
/*     */     //   130: aload #22
/*     */     //   132: aload #4
/*     */     //   134: putfield L$3 : Ljava/lang/Object;
/*     */     //   137: aload #22
/*     */     //   139: iconst_1
/*     */     //   140: putfield label : I
/*     */     //   143: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   148: dup
/*     */     //   149: aload #23
/*     */     //   151: if_acmpne -> 207
/*     */     //   154: aload #23
/*     */     //   156: areturn
/*     */     //   157: iconst_0
/*     */     //   158: istore #6
/*     */     //   160: aconst_null
/*     */     //   161: astore #5
/*     */     //   163: aload #22
/*     */     //   165: getfield L$3 : Ljava/lang/Object;
/*     */     //   168: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   171: astore #4
/*     */     //   173: aload #22
/*     */     //   175: getfield L$2 : Ljava/lang/Object;
/*     */     //   178: checkcast kotlinx/coroutines/channels/Channel
/*     */     //   181: astore_2
/*     */     //   182: aload #22
/*     */     //   184: getfield L$1 : Ljava/lang/Object;
/*     */     //   187: checkcast java/util/List
/*     */     //   190: astore_1
/*     */     //   191: aload #22
/*     */     //   193: getfield L$0 : Ljava/lang/Object;
/*     */     //   196: checkcast ai/grazie/utils/SuspendableBatchProcessor
/*     */     //   199: astore_0
/*     */     //   200: aload #21
/*     */     //   202: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   205: aload #21
/*     */     //   207: pop
/*     */     //   208: nop
/*     */     //   209: iconst_0
/*     */     //   210: istore #7
/*     */     //   212: aload_0
/*     */     //   213: getfield buffer : Lai/grazie/utils/SuspendableBatchProcessor$Buffer;
/*     */     //   216: invokevirtual getItems : ()Ljava/util/List;
/*     */     //   219: aload_1
/*     */     //   220: checkcast java/lang/Iterable
/*     */     //   223: astore #8
/*     */     //   225: astore #9
/*     */     //   227: iconst_0
/*     */     //   228: istore #10
/*     */     //   230: aload #8
/*     */     //   232: astore #11
/*     */     //   234: new java/util/ArrayList
/*     */     //   237: dup
/*     */     //   238: aload #8
/*     */     //   240: bipush #10
/*     */     //   242: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   245: invokespecial <init> : (I)V
/*     */     //   248: checkcast java/util/Collection
/*     */     //   251: astore #12
/*     */     //   253: iconst_0
/*     */     //   254: istore #13
/*     */     //   256: aload #11
/*     */     //   258: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   263: astore #14
/*     */     //   265: aload #14
/*     */     //   267: invokeinterface hasNext : ()Z
/*     */     //   272: ifeq -> 317
/*     */     //   275: aload #14
/*     */     //   277: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   282: astore #15
/*     */     //   284: aload #12
/*     */     //   286: aload #15
/*     */     //   288: astore #16
/*     */     //   290: astore #17
/*     */     //   292: iconst_0
/*     */     //   293: istore #18
/*     */     //   295: new ai/grazie/utils/SuspendableBatchProcessor$BufferItem
/*     */     //   298: dup
/*     */     //   299: aload #16
/*     */     //   301: aload_2
/*     */     //   302: invokespecial <init> : (Ljava/lang/Object;Lkotlinx/coroutines/channels/Channel;)V
/*     */     //   305: aload #17
/*     */     //   307: swap
/*     */     //   308: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   313: pop
/*     */     //   314: goto -> 265
/*     */     //   317: aload #12
/*     */     //   319: checkcast java/util/List
/*     */     //   322: nop
/*     */     //   323: aload #9
/*     */     //   325: swap
/*     */     //   326: checkcast java/util/Collection
/*     */     //   329: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   334: pop
/*     */     //   335: aload_0
/*     */     //   336: getfield buffer : Lai/grazie/utils/SuspendableBatchProcessor$Buffer;
/*     */     //   339: astore #8
/*     */     //   341: aload #8
/*     */     //   343: aload #8
/*     */     //   345: invokevirtual getCount : ()I
/*     */     //   348: aload_0
/*     */     //   349: getfield counter : Lkotlin/jvm/functions/Function1;
/*     */     //   352: aload_1
/*     */     //   353: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   358: checkcast java/lang/Number
/*     */     //   361: invokevirtual intValue : ()I
/*     */     //   364: iadd
/*     */     //   365: invokevirtual setCount : (I)V
/*     */     //   368: aload_0
/*     */     //   369: getfield log : Lai/grazie/utils/mpp/MPPLogger;
/*     */     //   372: new ai/grazie/utils/SuspendableBatchProcessor$addToBuffer$2$2
/*     */     //   375: dup
/*     */     //   376: aload_0
/*     */     //   377: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;)V
/*     */     //   380: checkcast kotlin/jvm/functions/Function0
/*     */     //   383: invokeinterface info : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   388: nop
/*     */     //   389: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   392: astore #19
/*     */     //   394: aload #4
/*     */     //   396: aload #5
/*     */     //   398: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   403: goto -> 420
/*     */     //   406: astore #20
/*     */     //   408: aload #4
/*     */     //   410: aload #5
/*     */     //   412: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   417: aload #20
/*     */     //   419: athrow
/*     */     //   420: nop
/*     */     //   421: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   424: areturn
/*     */     //   425: new java/lang/IllegalStateException
/*     */     //   428: dup
/*     */     //   429: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   431: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   434: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 60
/*     */     //   #87	-> 93
/*     */     //   #114	-> 99
/*     */     //   #115	-> 105
/*     */     //   #118	-> 106
/*     */     //   #86	-> 154
/*     */     //   #119	-> 207
/*     */     //   #120	-> 209
/*     */     //   #88	-> 212
/*     */     //   #121	-> 230
/*     */     //   #122	-> 256
/*     */     //   #123	-> 284
/*     */     //   #88	-> 295
/*     */     //   #123	-> 308
/*     */     //   #124	-> 317
/*     */     //   #121	-> 322
/*     */     //   #88	-> 329
/*     */     //   #89	-> 335
/*     */     //   #90	-> 368
/*     */     //   #91	-> 388
/*     */     //   #120	-> 392
/*     */     //   #125	-> 394
/*     */     //   #126	-> 403
/*     */     //   #125	-> 406
/*     */     //   #119	-> 420
/*     */     //   #92	-> 421
/*     */     //   #86	-> 425
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	64	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   200	188	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   93	64	1	parameters	Ljava/util/List;
/*     */     //   191	177	1	parameters	Ljava/util/List;
/*     */     //   93	64	2	channel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   182	135	2	channel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   99	58	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   173	216	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   389	14	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   406	15	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   102	55	5	owner$iv	Ljava/lang/Object;
/*     */     //   173	216	5	owner$iv	Ljava/lang/Object;
/*     */     //   389	14	5	owner$iv	Ljava/lang/Object;
/*     */     //   406	15	5	owner$iv	Ljava/lang/Object;
/*     */     //   227	26	8	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   253	12	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   253	66	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   284	30	15	item$iv$iv	Ljava/lang/Object;
/*     */     //   292	13	16	it	Ljava/lang/Object;
/*     */     //   295	10	18	$i$a$-map-SuspendableBatchProcessor$addToBuffer$2$1	I
/*     */     //   256	63	13	$i$f$mapTo	I
/*     */     //   230	93	10	$i$f$map	I
/*     */     //   212	177	7	$i$a$-withLock$default-SuspendableBatchProcessor$addToBuffer$2	I
/*     */     //   105	52	6	$i$f$withLock	I
/*     */     //   0	435	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	375	22	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	368	21	$result	Ljava/lang/Object;
/*     */     //   160	261	6	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   208	394	406	finally
/*     */     //   406	408	406	finally
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "T", "Result", "invoke"})
/*     */   static final class SuspendableBatchProcessor$addToBuffer$2$2 extends Lambda implements Function0<String> { SuspendableBatchProcessor$addToBuffer$2$2() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final String invoke() {
/*  90 */       return "Added items to batch " + SuspendableBatchProcessor.this.buffer.getId().getText();
/*     */     } }
/*     */   private final Object processBuffer(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/utils/SuspendableBatchProcessor$processBuffer$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/utils/SuspendableBatchProcessor$processBuffer$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #10
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/utils/SuspendableBatchProcessor$processBuffer$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 379, 0 -> 92, 1 -> 160, 2 -> 329
/*     */     //   92: aload #9
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   100: dup
/*     */     //   101: invokespecial <init> : ()V
/*     */     //   104: astore_2
/*     */     //   105: aload_0
/*     */     //   106: getfield bufferMutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   109: astore_3
/*     */     //   110: aconst_null
/*     */     //   111: astore #4
/*     */     //   113: iconst_0
/*     */     //   114: istore #5
/*     */     //   116: nop
/*     */     //   117: aload_3
/*     */     //   118: aload #4
/*     */     //   120: aload #10
/*     */     //   122: aload #10
/*     */     //   124: aload_0
/*     */     //   125: putfield L$0 : Ljava/lang/Object;
/*     */     //   128: aload #10
/*     */     //   130: aload_2
/*     */     //   131: putfield L$1 : Ljava/lang/Object;
/*     */     //   134: aload #10
/*     */     //   136: aload_3
/*     */     //   137: putfield L$2 : Ljava/lang/Object;
/*     */     //   140: aload #10
/*     */     //   142: iconst_1
/*     */     //   143: putfield label : I
/*     */     //   146: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   151: dup
/*     */     //   152: aload #11
/*     */     //   154: if_acmpne -> 200
/*     */     //   157: aload #11
/*     */     //   159: areturn
/*     */     //   160: iconst_0
/*     */     //   161: istore #5
/*     */     //   163: aconst_null
/*     */     //   164: astore #4
/*     */     //   166: aload #10
/*     */     //   168: getfield L$2 : Ljava/lang/Object;
/*     */     //   171: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   174: astore_3
/*     */     //   175: aload #10
/*     */     //   177: getfield L$1 : Ljava/lang/Object;
/*     */     //   180: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   183: astore_2
/*     */     //   184: aload #10
/*     */     //   186: getfield L$0 : Ljava/lang/Object;
/*     */     //   189: checkcast ai/grazie/utils/SuspendableBatchProcessor
/*     */     //   192: astore_0
/*     */     //   193: aload #9
/*     */     //   195: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   198: aload #9
/*     */     //   200: pop
/*     */     //   201: nop
/*     */     //   202: iconst_0
/*     */     //   203: istore #6
/*     */     //   205: aload_0
/*     */     //   206: iconst_0
/*     */     //   207: putfield isBufferingInProgress : Z
/*     */     //   210: aload_2
/*     */     //   211: aload_0
/*     */     //   212: getfield buffer : Lai/grazie/utils/SuspendableBatchProcessor$Buffer;
/*     */     //   215: putfield element : Ljava/lang/Object;
/*     */     //   218: aload_0
/*     */     //   219: new ai/grazie/utils/SuspendableBatchProcessor$Buffer
/*     */     //   222: dup
/*     */     //   223: invokespecial <init> : ()V
/*     */     //   226: putfield buffer : Lai/grazie/utils/SuspendableBatchProcessor$Buffer;
/*     */     //   229: nop
/*     */     //   230: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   233: astore #7
/*     */     //   235: aload_3
/*     */     //   236: aload #4
/*     */     //   238: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   243: goto -> 259
/*     */     //   246: astore #8
/*     */     //   248: aload_3
/*     */     //   249: aload #4
/*     */     //   251: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   256: aload #8
/*     */     //   258: athrow
/*     */     //   259: nop
/*     */     //   260: aload_0
/*     */     //   261: getfield log : Lai/grazie/utils/mpp/MPPLogger;
/*     */     //   264: new ai/grazie/utils/SuspendableBatchProcessor$processBuffer$3
/*     */     //   267: dup
/*     */     //   268: aload_2
/*     */     //   269: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*     */     //   272: checkcast kotlin/jvm/functions/Function0
/*     */     //   275: invokeinterface info : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   280: aload_0
/*     */     //   281: aload_2
/*     */     //   282: getfield element : Ljava/lang/Object;
/*     */     //   285: checkcast ai/grazie/utils/SuspendableBatchProcessor$Buffer
/*     */     //   288: invokevirtual getItems : ()Ljava/util/List;
/*     */     //   291: aload #10
/*     */     //   293: aload #10
/*     */     //   295: aload_0
/*     */     //   296: putfield L$0 : Ljava/lang/Object;
/*     */     //   299: aload #10
/*     */     //   301: aload_2
/*     */     //   302: putfield L$1 : Ljava/lang/Object;
/*     */     //   305: aload #10
/*     */     //   307: aconst_null
/*     */     //   308: putfield L$2 : Ljava/lang/Object;
/*     */     //   311: aload #10
/*     */     //   313: iconst_2
/*     */     //   314: putfield label : I
/*     */     //   317: invokespecial processBatch : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   320: dup
/*     */     //   321: aload #11
/*     */     //   323: if_acmpne -> 354
/*     */     //   326: aload #11
/*     */     //   328: areturn
/*     */     //   329: aload #10
/*     */     //   331: getfield L$1 : Ljava/lang/Object;
/*     */     //   334: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   337: astore_2
/*     */     //   338: aload #10
/*     */     //   340: getfield L$0 : Ljava/lang/Object;
/*     */     //   343: checkcast ai/grazie/utils/SuspendableBatchProcessor
/*     */     //   346: astore_0
/*     */     //   347: aload #9
/*     */     //   349: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   352: aload #9
/*     */     //   354: pop
/*     */     //   355: aload_0
/*     */     //   356: getfield log : Lai/grazie/utils/mpp/MPPLogger;
/*     */     //   359: new ai/grazie/utils/SuspendableBatchProcessor$processBuffer$4
/*     */     //   362: dup
/*     */     //   363: aload_2
/*     */     //   364: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;)V
/*     */     //   367: checkcast kotlin/jvm/functions/Function0
/*     */     //   370: invokeinterface info : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   375: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   378: areturn
/*     */     //   379: new java/lang/IllegalStateException
/*     */     //   382: dup
/*     */     //   383: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   385: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   388: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #94	-> 60
/*     */     //   #95	-> 97
/*     */     //   #96	-> 105
/*     */     //   #127	-> 110
/*     */     //   #128	-> 116
/*     */     //   #131	-> 117
/*     */     //   #94	-> 157
/*     */     //   #132	-> 200
/*     */     //   #133	-> 202
/*     */     //   #97	-> 205
/*     */     //   #98	-> 210
/*     */     //   #99	-> 218
/*     */     //   #100	-> 229
/*     */     //   #133	-> 233
/*     */     //   #135	-> 235
/*     */     //   #136	-> 243
/*     */     //   #135	-> 246
/*     */     //   #132	-> 259
/*     */     //   #101	-> 260
/*     */     //   #102	-> 280
/*     */     //   #94	-> 326
/*     */     //   #103	-> 354
/*     */     //   #104	-> 375
/*     */     //   #94	-> 379
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	63	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   193	37	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   230	16	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   259	70	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   347	32	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   105	55	2	currentBatch	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   184	46	2	currentBatch	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   230	16	2	currentBatch	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   259	70	2	currentBatch	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   338	41	2	currentBatch	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   110	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   175	55	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   230	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   246	14	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   113	47	4	owner$iv	Ljava/lang/Object;
/*     */     //   175	55	4	owner$iv	Ljava/lang/Object;
/*     */     //   230	13	4	owner$iv	Ljava/lang/Object;
/*     */     //   246	14	4	owner$iv	Ljava/lang/Object;
/*     */     //   205	25	6	$i$a$-withLock$default-SuspendableBatchProcessor$processBuffer$2	I
/*     */     //   116	44	5	$i$f$withLock	I
/*     */     //   0	389	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	329	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	322	9	$result	Ljava/lang/Object;
/*     */     //   163	97	5	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   201	235	246	finally
/*     */     //   246	248	246	finally
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "T", "Result", "invoke"})
/*     */   static final class SuspendableBatchProcessor$processBuffer$3 extends Lambda implements Function0<String> { SuspendableBatchProcessor$processBuffer$3(Ref.ObjectRef<SuspendableBatchProcessor.Buffer<T, Result>> $currentBatch) {
/*     */       super(0);
/*     */     }
/*     */     
/* 101 */     public final String invoke() { return "Processing buffer " + ((SuspendableBatchProcessor.Buffer)this.$currentBatch.element).getId().getText() + " of size " + ((SuspendableBatchProcessor.Buffer)this.$currentBatch.element).getCount(); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "T", "Result", "invoke"})
/*     */   static final class SuspendableBatchProcessor$processBuffer$4 extends Lambda implements Function0<String> { SuspendableBatchProcessor$processBuffer$4(Ref.ObjectRef<SuspendableBatchProcessor.Buffer<T, Result>> $currentBatch) { super(0); }
/* 103 */     public final String invoke() { return "Finished processing buffer " + ((SuspendableBatchProcessor.Buffer)this.$currentBatch.element).getId().getText(); }
/*     */      }
/*     */ 
/*     */   
/*     */   private final Object processBatch(List batch, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/utils/SuspendableBatchProcessor$processBatch$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/utils/SuspendableBatchProcessor$processBatch$1
/*     */     //   11: astore #16
/*     */     //   13: aload #16
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #16
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/utils/SuspendableBatchProcessor$processBatch$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/utils/SuspendableBatchProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #16
/*     */     //   50: aload #16
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #15
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #17
/*     */     //   62: aload #16
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 395, 0 -> 92, 1 -> 234, 2 -> 345
/*     */     //   92: aload #15
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield process : Lkotlin/jvm/functions/Function2;
/*     */     //   101: aload_1
/*     */     //   102: checkcast java/lang/Iterable
/*     */     //   105: astore #4
/*     */     //   107: astore #13
/*     */     //   109: iconst_0
/*     */     //   110: istore #5
/*     */     //   112: aload #4
/*     */     //   114: astore #6
/*     */     //   116: new java/util/ArrayList
/*     */     //   119: dup
/*     */     //   120: aload #4
/*     */     //   122: bipush #10
/*     */     //   124: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   127: invokespecial <init> : (I)V
/*     */     //   130: checkcast java/util/Collection
/*     */     //   133: astore #7
/*     */     //   135: iconst_0
/*     */     //   136: istore #8
/*     */     //   138: aload #6
/*     */     //   140: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   145: astore #9
/*     */     //   147: aload #9
/*     */     //   149: invokeinterface hasNext : ()Z
/*     */     //   154: ifeq -> 197
/*     */     //   157: aload #9
/*     */     //   159: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   164: astore #10
/*     */     //   166: aload #7
/*     */     //   168: aload #10
/*     */     //   170: checkcast ai/grazie/utils/SuspendableBatchProcessor$BufferItem
/*     */     //   173: astore #11
/*     */     //   175: astore #14
/*     */     //   177: iconst_0
/*     */     //   178: istore #12
/*     */     //   180: aload #11
/*     */     //   182: invokevirtual getParameter : ()Ljava/lang/Object;
/*     */     //   185: aload #14
/*     */     //   187: swap
/*     */     //   188: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   193: pop
/*     */     //   194: goto -> 147
/*     */     //   197: aload #7
/*     */     //   199: checkcast java/util/List
/*     */     //   202: nop
/*     */     //   203: aload #13
/*     */     //   205: swap
/*     */     //   206: aload #16
/*     */     //   208: aload #16
/*     */     //   210: aload_1
/*     */     //   211: putfield L$0 : Ljava/lang/Object;
/*     */     //   214: aload #16
/*     */     //   216: iconst_1
/*     */     //   217: putfield label : I
/*     */     //   220: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   225: dup
/*     */     //   226: aload #17
/*     */     //   228: if_acmpne -> 250
/*     */     //   231: aload #17
/*     */     //   233: areturn
/*     */     //   234: aload #16
/*     */     //   236: getfield L$0 : Ljava/lang/Object;
/*     */     //   239: checkcast java/util/List
/*     */     //   242: astore_1
/*     */     //   243: aload #15
/*     */     //   245: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   248: aload #15
/*     */     //   250: checkcast java/util/List
/*     */     //   253: astore_3
/*     */     //   254: iconst_0
/*     */     //   255: istore #4
/*     */     //   257: aload_1
/*     */     //   258: checkcast java/util/Collection
/*     */     //   261: invokeinterface size : ()I
/*     */     //   266: istore #5
/*     */     //   268: iload #4
/*     */     //   270: iload #5
/*     */     //   272: if_icmpge -> 391
/*     */     //   275: aload_1
/*     */     //   276: iload #4
/*     */     //   278: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   283: checkcast ai/grazie/utils/SuspendableBatchProcessor$BufferItem
/*     */     //   286: invokevirtual getChannel : ()Lkotlinx/coroutines/channels/Channel;
/*     */     //   289: aload_3
/*     */     //   290: iload #4
/*     */     //   292: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   297: aload #16
/*     */     //   299: aload #16
/*     */     //   301: aload_1
/*     */     //   302: putfield L$0 : Ljava/lang/Object;
/*     */     //   305: aload #16
/*     */     //   307: aload_3
/*     */     //   308: putfield L$1 : Ljava/lang/Object;
/*     */     //   311: aload #16
/*     */     //   313: iload #4
/*     */     //   315: putfield I$0 : I
/*     */     //   318: aload #16
/*     */     //   320: iload #5
/*     */     //   322: putfield I$1 : I
/*     */     //   325: aload #16
/*     */     //   327: iconst_2
/*     */     //   328: putfield label : I
/*     */     //   331: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   336: dup
/*     */     //   337: aload #17
/*     */     //   339: if_acmpne -> 384
/*     */     //   342: aload #17
/*     */     //   344: areturn
/*     */     //   345: aload #16
/*     */     //   347: getfield I$1 : I
/*     */     //   350: istore #5
/*     */     //   352: aload #16
/*     */     //   354: getfield I$0 : I
/*     */     //   357: istore #4
/*     */     //   359: aload #16
/*     */     //   361: getfield L$1 : Ljava/lang/Object;
/*     */     //   364: checkcast java/util/List
/*     */     //   367: astore_3
/*     */     //   368: aload #16
/*     */     //   370: getfield L$0 : Ljava/lang/Object;
/*     */     //   373: checkcast java/util/List
/*     */     //   376: astore_1
/*     */     //   377: aload #15
/*     */     //   379: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   382: aload #15
/*     */     //   384: pop
/*     */     //   385: iinc #4, 1
/*     */     //   388: goto -> 268
/*     */     //   391: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   394: areturn
/*     */     //   395: new java/lang/IllegalStateException
/*     */     //   398: dup
/*     */     //   399: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   401: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   404: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 60
/*     */     //   #107	-> 97
/*     */     //   #137	-> 112
/*     */     //   #138	-> 138
/*     */     //   #139	-> 166
/*     */     //   #107	-> 180
/*     */     //   #139	-> 188
/*     */     //   #140	-> 197
/*     */     //   #137	-> 202
/*     */     //   #107	-> 208
/*     */     //   #106	-> 231
/*     */     //   #108	-> 254
/*     */     //   #109	-> 275
/*     */     //   #106	-> 342
/*     */     //   #108	-> 384
/*     */     //   #111	-> 391
/*     */     //   #106	-> 395
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	12	0	this	Lai/grazie/utils/SuspendableBatchProcessor;
/*     */     //   97	137	1	batch	Ljava/util/List;
/*     */     //   243	102	1	batch	Ljava/util/List;
/*     */     //   377	18	1	batch	Ljava/util/List;
/*     */     //   254	91	3	result	Ljava/util/List;
/*     */     //   368	27	3	result	Ljava/util/List;
/*     */     //   109	26	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   257	88	4	i	I
/*     */     //   359	32	4	i	I
/*     */     //   135	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   135	64	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   166	28	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   177	8	11	it	Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;
/*     */     //   180	5	12	$i$a$-map-SuspendableBatchProcessor$processBatch$result$1	I
/*     */     //   138	61	8	$i$f$mapTo	I
/*     */     //   112	91	5	$i$f$map	I
/*     */     //   0	405	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	345	16	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	338	15	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {118}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "parameters", "channel", "$this$withLock_u24default$iv"}, m = "addToBuffer", c = "ai.grazie.utils.SuspendableBatchProcessor")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class SuspendableBatchProcessor$addToBuffer$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     SuspendableBatchProcessor$addToBuffer$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SuspendableBatchProcessor.this.addToBuffer(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {81}, i = {0, 0, 0}, s = {"L$0", "L$1", "I$0"}, n = {"channel", "result", "i"}, m = "getResult", c = "ai.grazie.utils.SuspendableBatchProcessor")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class SuspendableBatchProcessor$getResult$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     SuspendableBatchProcessor$getResult$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SuspendableBatchProcessor.this.getResult(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {107, 109}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "L$1", "I$0"}, n = {"batch", "batch", "result", "i"}, m = "processBatch", c = "ai.grazie.utils.SuspendableBatchProcessor")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class SuspendableBatchProcessor$processBatch$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     SuspendableBatchProcessor$processBatch$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SuspendableBatchProcessor.this.processBatch(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {118, 102}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "currentBatch", "$this$withLock_u24default$iv", "this", "currentBatch"}, m = "processBuffer", c = "ai.grazie.utils.SuspendableBatchProcessor")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class SuspendableBatchProcessor$processBuffer$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     SuspendableBatchProcessor$processBuffer$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SuspendableBatchProcessor.this.processBuffer((Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {50, 53}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"this", "parameters", "resultChannel", "resultChannel"}, m = "processWithBatching", c = "ai.grazie.utils.SuspendableBatchProcessor")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class SuspendableBatchProcessor$processWithBatching$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     SuspendableBatchProcessor$processWithBatching$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SuspendableBatchProcessor.this.processWithBatching(null, (Continuation<? super List<? extends Result>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {73, 75}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "timer"}, m = "startProcessing", c = "ai.grazie.utils.SuspendableBatchProcessor")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class SuspendableBatchProcessor$startProcessing$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     SuspendableBatchProcessor$startProcessing$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SuspendableBatchProcessor.this.startProcessing((Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */