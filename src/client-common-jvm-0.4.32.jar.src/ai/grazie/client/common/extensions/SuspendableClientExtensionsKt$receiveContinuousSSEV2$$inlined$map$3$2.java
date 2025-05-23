package ai.grazie.client.common.extensions;

import ai.grazie.model.cloud.sse.continuous.ContinuousSSEEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 176, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n*L\n1#1,218:1\n50#2:219\n105#3:220\n32#4,15:221\n*S KotlinDebug\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n105#1:221,15\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver, ContinuousSSEEvent.Companion paramCompanion) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2$1
    //   11: astore_3
    //   12: aload_3
    //   13: getfield label : I
    //   16: ldc -2147483648
    //   18: iand
    //   19: ifeq -> 36
    //   22: aload_3
    //   23: dup
    //   24: getfield label : I
    //   27: ldc -2147483648
    //   29: isub
    //   30: putfield label : I
    //   33: goto -> 46
    //   36: new ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 465, 0 -> 84, 1 -> 450
    //   84: aload #4
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   93: aload_1
    //   94: astore #6
    //   96: astore #7
    //   98: iconst_0
    //   99: istore #8
    //   101: aload #7
    //   103: astore #9
    //   105: aload #6
    //   107: aload_3
    //   108: checkcast kotlin/coroutines/Continuation
    //   111: pop
    //   112: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: iconst_0
    //   121: istore #12
    //   123: aload_0
    //   124: getfield receiver$inlined : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   127: pop
    //   128: iconst_0
    //   129: istore #13
    //   131: aload #10
    //   133: astore #14
    //   135: aload #14
    //   137: instanceof ai/grazie/model/cloud/sse/continuous/Data
    //   140: ifeq -> 160
    //   143: aload #10
    //   145: iconst_1
    //   146: ldc 'O'
    //   148: invokestatic reifiedOperationMarker : (ILjava/lang/String;)V
    //   151: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   154: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   157: goto -> 425
    //   160: aload #14
    //   162: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   165: ifeq -> 274
    //   168: aload #10
    //   170: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   173: astore #15
    //   175: aload #15
    //   177: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Timeout
    //   180: ifeq -> 204
    //   183: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Timeout
    //   186: dup
    //   187: aload #10
    //   189: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   192: invokevirtual getMessage : ()Ljava/lang/String;
    //   195: invokespecial <init> : (Ljava/lang/String;)V
    //   198: checkcast java/lang/Throwable
    //   201: goto -> 273
    //   204: aload #15
    //   206: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   209: ifeq -> 233
    //   212: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Cancellation
    //   215: dup
    //   216: aload #10
    //   218: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   221: invokevirtual getReason : ()Ljava/lang/String;
    //   224: invokespecial <init> : (Ljava/lang/String;)V
    //   227: checkcast java/lang/Throwable
    //   230: goto -> 273
    //   233: aload #15
    //   235: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   238: ifeq -> 265
    //   241: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Error
    //   244: dup
    //   245: aload #10
    //   247: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   250: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   253: aconst_null
    //   254: iconst_2
    //   255: aconst_null
    //   256: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   259: checkcast java/lang/Throwable
    //   262: goto -> 273
    //   265: new kotlin/NoWhenBranchMatchedException
    //   268: dup
    //   269: invokespecial <init> : ()V
    //   272: athrow
    //   273: athrow
    //   274: aload #14
    //   276: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   279: ifeq -> 417
    //   282: aload #10
    //   284: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   287: astore #15
    //   289: aload #15
    //   291: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Timeout
    //   294: ifeq -> 318
    //   297: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Timeout
    //   300: dup
    //   301: aload #10
    //   303: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   306: invokevirtual getMessage : ()Ljava/lang/String;
    //   309: invokespecial <init> : (Ljava/lang/String;)V
    //   312: checkcast java/lang/Throwable
    //   315: goto -> 416
    //   318: aload #15
    //   320: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Cancellation
    //   323: ifeq -> 347
    //   326: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Cancellation
    //   329: dup
    //   330: aload #10
    //   332: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Cancellation
    //   335: invokevirtual getReason : ()Ljava/lang/String;
    //   338: invokespecial <init> : (Ljava/lang/String;)V
    //   341: checkcast java/lang/Throwable
    //   344: goto -> 416
    //   347: aload #15
    //   349: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd
    //   352: ifeq -> 376
    //   355: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$PrematureEnd
    //   358: dup
    //   359: aload #10
    //   361: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd
    //   364: invokevirtual getReason : ()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;
    //   367: invokespecial <init> : (Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;)V
    //   370: checkcast java/lang/Throwable
    //   373: goto -> 416
    //   376: aload #15
    //   378: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error
    //   381: ifeq -> 408
    //   384: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Error
    //   387: dup
    //   388: aload #10
    //   390: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error
    //   393: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   396: aconst_null
    //   397: iconst_2
    //   398: aconst_null
    //   399: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   402: checkcast java/lang/Throwable
    //   405: goto -> 416
    //   408: new kotlin/NoWhenBranchMatchedException
    //   411: dup
    //   412: invokespecial <init> : ()V
    //   415: athrow
    //   416: athrow
    //   417: new kotlin/NoWhenBranchMatchedException
    //   420: dup
    //   421: invokespecial <init> : ()V
    //   424: athrow
    //   425: nop
    //   426: nop
    //   427: aload #9
    //   429: swap
    //   430: aload_3
    //   431: aload_3
    //   432: iconst_1
    //   433: putfield label : I
    //   436: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   441: dup
    //   442: aload #5
    //   444: if_acmpne -> 460
    //   447: aload #5
    //   449: areturn
    //   450: iconst_0
    //   451: istore #8
    //   453: aload #4
    //   455: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   458: aload #4
    //   460: pop
    //   461: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   464: areturn
    //   465: new java/lang/IllegalStateException
    //   468: dup
    //   469: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   471: invokespecial <init> : (Ljava/lang/String;)V
    //   474: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 123
    //   #221	-> 131
    //   #222	-> 135
    //   #223	-> 160
    //   #224	-> 168
    //   #225	-> 175
    //   #226	-> 204
    //   #227	-> 233
    //   #230	-> 274
    //   #231	-> 282
    //   #232	-> 289
    //   #233	-> 318
    //   #234	-> 347
    //   #235	-> 376
    //   #221	-> 425
    //   #220	-> 426
    //   #219	-> 427
    //   #0	-> 447
    //   #49	-> 460
    //   #0	-> 465
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	39	0	this	Lai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	43	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   160	44	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   204	29	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   233	32	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   274	44	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   318	29	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   347	29	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   376	32	10	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   131	295	13	$i$f$handle	I
    //   120	307	11	$i$f$receiveContinuousSSEV2$handle$4	I
    //   123	304	12	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSEV2$4	I
    //   0	475	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	349	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	419	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	413	4	$result	Ljava/lang/Object;
    //   453	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
  
  @Nullable
  public final Object emit$$forInline(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: iconst_4
    //   1: invokestatic mark : (I)V
    //   4: new ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2$1
    //   7: dup
    //   8: aload_0
    //   9: aload_2
    //   10: invokespecial <init> : (Lai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2;Lkotlin/coroutines/Continuation;)V
    //   13: iconst_5
    //   14: invokestatic mark : (I)V
    //   17: pop
    //   18: aload_0
    //   19: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   22: aload_1
    //   23: aload_2
    //   24: astore_3
    //   25: astore #4
    //   27: astore #5
    //   29: iconst_0
    //   30: istore #6
    //   32: aload #5
    //   34: astore #7
    //   36: aload #4
    //   38: aload_2
    //   39: checkcast kotlin/coroutines/Continuation
    //   42: astore #8
    //   44: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent
    //   47: astore #9
    //   49: iconst_0
    //   50: istore #10
    //   52: iconst_0
    //   53: istore #11
    //   55: aload_0
    //   56: getfield receiver$inlined : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   59: astore #12
    //   61: iconst_0
    //   62: istore #13
    //   64: aload #9
    //   66: astore #14
    //   68: aload #14
    //   70: instanceof ai/grazie/model/cloud/sse/continuous/Data
    //   73: ifeq -> 93
    //   76: aload #9
    //   78: iconst_1
    //   79: ldc 'O'
    //   81: invokestatic reifiedOperationMarker : (ILjava/lang/String;)V
    //   84: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   87: checkcast ai/grazie/model/cloud/sse/continuous/Data
    //   90: goto -> 358
    //   93: aload #14
    //   95: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   98: ifeq -> 207
    //   101: aload #9
    //   103: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   106: astore #15
    //   108: aload #15
    //   110: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Timeout
    //   113: ifeq -> 137
    //   116: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Timeout
    //   119: dup
    //   120: aload #9
    //   122: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent
    //   125: invokevirtual getMessage : ()Ljava/lang/String;
    //   128: invokespecial <init> : (Ljava/lang/String;)V
    //   131: checkcast java/lang/Throwable
    //   134: goto -> 206
    //   137: aload #15
    //   139: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   142: ifeq -> 166
    //   145: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Cancellation
    //   148: dup
    //   149: aload #9
    //   151: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Cancellation
    //   154: invokevirtual getReason : ()Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: checkcast java/lang/Throwable
    //   163: goto -> 206
    //   166: aload #15
    //   168: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   171: ifeq -> 198
    //   174: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Error
    //   177: dup
    //   178: aload #9
    //   180: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Error
    //   183: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   186: aconst_null
    //   187: iconst_2
    //   188: aconst_null
    //   189: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   192: checkcast java/lang/Throwable
    //   195: goto -> 206
    //   198: new kotlin/NoWhenBranchMatchedException
    //   201: dup
    //   202: invokespecial <init> : ()V
    //   205: athrow
    //   206: athrow
    //   207: aload #14
    //   209: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   212: ifeq -> 350
    //   215: aload #9
    //   217: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   220: astore #15
    //   222: aload #15
    //   224: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Timeout
    //   227: ifeq -> 251
    //   230: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Timeout
    //   233: dup
    //   234: aload #9
    //   236: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2
    //   239: invokevirtual getMessage : ()Ljava/lang/String;
    //   242: invokespecial <init> : (Ljava/lang/String;)V
    //   245: checkcast java/lang/Throwable
    //   248: goto -> 349
    //   251: aload #15
    //   253: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Cancellation
    //   256: ifeq -> 280
    //   259: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Cancellation
    //   262: dup
    //   263: aload #9
    //   265: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Cancellation
    //   268: invokevirtual getReason : ()Ljava/lang/String;
    //   271: invokespecial <init> : (Ljava/lang/String;)V
    //   274: checkcast java/lang/Throwable
    //   277: goto -> 349
    //   280: aload #15
    //   282: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd
    //   285: ifeq -> 309
    //   288: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$PrematureEnd
    //   291: dup
    //   292: aload #9
    //   294: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd
    //   297: invokevirtual getReason : ()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;
    //   300: invokespecial <init> : (Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;)V
    //   303: checkcast java/lang/Throwable
    //   306: goto -> 349
    //   309: aload #15
    //   311: instanceof ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error
    //   314: ifeq -> 341
    //   317: new ai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Error
    //   320: dup
    //   321: aload #9
    //   323: checkcast ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error
    //   326: invokevirtual getErrorMessage : ()Ljava/lang/String;
    //   329: aconst_null
    //   330: iconst_2
    //   331: aconst_null
    //   332: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   335: checkcast java/lang/Throwable
    //   338: goto -> 349
    //   341: new kotlin/NoWhenBranchMatchedException
    //   344: dup
    //   345: invokespecial <init> : ()V
    //   348: athrow
    //   349: athrow
    //   350: new kotlin/NoWhenBranchMatchedException
    //   353: dup
    //   354: invokespecial <init> : ()V
    //   357: athrow
    //   358: nop
    //   359: nop
    //   360: astore #16
    //   362: aload #7
    //   364: aload #16
    //   366: aload_2
    //   367: iconst_0
    //   368: invokestatic mark : (I)V
    //   371: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   376: iconst_1
    //   377: invokestatic mark : (I)V
    //   380: pop
    //   381: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   384: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #49	-> 18
    //   #219	-> 32
    //   #220	-> 55
    //   #221	-> 64
    //   #222	-> 68
    //   #223	-> 93
    //   #224	-> 101
    //   #225	-> 108
    //   #226	-> 137
    //   #227	-> 166
    //   #230	-> 207
    //   #231	-> 215
    //   #232	-> 222
    //   #233	-> 251
    //   #234	-> 280
    //   #235	-> 309
    //   #221	-> 358
    //   #220	-> 359
    //   #219	-> 360
    //   #49	-> 381
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   64	295	13	$i$f$handle	I
    //   61	298	12	$this$handle$iv	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
    //   52	308	10	$i$f$receiveContinuousSSEV2$handle$4	I
    //   55	305	11	$i$a$-map-SuspendableClientExtensionsKt$receiveContinuousSSEV2$4	I
    //   49	311	9	p0	Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;
    //   49	311	8	$completion	Lkotlin/coroutines/Continuation;
    //   32	349	6	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   29	352	5	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   29	352	4	value	Ljava/lang/Object;
    //   29	352	3	$completion	Lkotlin/coroutines/Continuation;
    //   0	385	0	this	Lai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2;
    //   0	385	1	value	Ljava/lang/Object;
    //   0	385	2	$completion	Lkotlin/coroutines/Continuation;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\extensions\SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */