/*    */ package org.jetbrains.jewel.bridge;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.SharedFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.theme.IntUiBridgeKt;
/*    */ import org.jetbrains.jewel.foundation.theme.ThemeDefinition;
/*    */ import org.jetbrains.jewel.ui.ComponentStyling;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\007\b\001\030\0002\0020\001:\001\016B\007¢\006\004\b\002\020\003J\016\020\013\032\0020\bH@¢\006\002\020\fJ\b\020\r\032\0020\bH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\032\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/bridge/SwingBridgeService;", "", "<init>", "()V", "scrollbarHelper", "Lorg/jetbrains/jewel/bridge/ScrollbarHelper;", "currentBridgeThemeData", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "getCurrentBridgeThemeData$ide_laf_bridge", "()Lkotlinx/coroutines/flow/StateFlow;", "tryGettingThemeData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readThemeData", "BridgeThemeData", "ide-laf-bridge"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nSwingBridgeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwingBridgeService.kt\norg/jetbrains/jewel/bridge/SwingBridgeService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
/*    */ public final class SwingBridgeService {
/*    */   @NotNull
/* 19 */   private final ScrollbarHelper scrollbarHelper = ScrollbarHelper.Companion.getInstance();
/*    */   @NotNull
/* 21 */   public final StateFlow<BridgeThemeData> getCurrentBridgeThemeData$ide_laf_bridge() { return this.currentBridgeThemeData; } @NotNull
/* 22 */   private final StateFlow<BridgeThemeData> currentBridgeThemeData = LafFlowService.customLafFlowState$default(LafFlowService.Companion.getInstance(), BridgeThemeData.Companion.getDEFAULT(), null, this::currentBridgeThemeData$lambda$0, 2, null); public static final int $stable = 8;
/* 23 */   private static final Flow currentBridgeThemeData$lambda$0(SwingBridgeService this$0, SharedFlow flow) { Intrinsics.checkNotNullParameter(flow, "flow"); return FlowKt.combine((Flow)flow, (Flow)this$0.scrollbarHelper.getScrollbarVisibilityStyleFlow(), (Flow)this$0.scrollbarHelper.getTrackClickBehaviorFlow(), new SwingBridgeService$currentBridgeThemeData$1$1(null)); } @DebugMetadata(f = "SwingBridgeService.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.SwingBridgeService$currentBridgeThemeData$1$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\002\032\0020\0042\006\020\002\032\0020\005H\n"}, d2 = {"<anonymous>", "Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "<unused var>", "", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;"}) static final class SwingBridgeService$currentBridgeThemeData$1$1 extends SuspendLambda implements Function4<Unit, ScrollbarVisibility, TrackClickBehavior, Continuation<? super BridgeThemeData>, Object> { int label; SwingBridgeService$currentBridgeThemeData$1$1(Continuation $completion) { super(4, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */ 
/*    */ 
/*    */           
/* 27 */           this.label = 1; if (SwingBridgeService.this.tryGettingThemeData((Continuation)this) == object) return object;  return SwingBridgeService.this.tryGettingThemeData((Continuation)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Object invoke(Unit p1, ScrollbarVisibility p2, TrackClickBehavior p3, Continuation<? super SwingBridgeService$currentBridgeThemeData$1$1> p4) {
/*    */       return (new SwingBridgeService$currentBridgeThemeData$1$1(p4)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */   
/*    */   private final Object tryGettingThemeData(Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof org/jetbrains/jewel/bridge/SwingBridgeService$tryGettingThemeData$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast org/jetbrains/jewel/bridge/SwingBridgeService$tryGettingThemeData$1
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
/*    */     //   39: new org/jetbrains/jewel/bridge/SwingBridgeService$tryGettingThemeData$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lorg/jetbrains/jewel/bridge/SwingBridgeService;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 243, 0 -> 88, 1 -> 145
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: iconst_0
/*    */     //   94: istore_2
/*    */     //   95: iload_2
/*    */     //   96: bipush #20
/*    */     //   98: if_icmpge -> 238
/*    */     //   101: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */     //   104: pop
/*    */     //   105: bipush #20
/*    */     //   107: getstatic kotlin/time/DurationUnit.MILLISECONDS : Lkotlin/time/DurationUnit;
/*    */     //   110: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */     //   113: aload #7
/*    */     //   115: aload #7
/*    */     //   117: aload_0
/*    */     //   118: putfield L$0 : Ljava/lang/Object;
/*    */     //   121: aload #7
/*    */     //   123: iload_2
/*    */     //   124: putfield I$0 : I
/*    */     //   127: aload #7
/*    */     //   129: iconst_1
/*    */     //   130: putfield label : I
/*    */     //   133: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   136: dup
/*    */     //   137: aload #8
/*    */     //   139: if_acmpne -> 167
/*    */     //   142: aload #8
/*    */     //   144: areturn
/*    */     //   145: aload #7
/*    */     //   147: getfield I$0 : I
/*    */     //   150: istore_2
/*    */     //   151: aload #7
/*    */     //   153: getfield L$0 : Ljava/lang/Object;
/*    */     //   156: checkcast org/jetbrains/jewel/bridge/SwingBridgeService
/*    */     //   159: astore_0
/*    */     //   160: aload #6
/*    */     //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   165: aload #6
/*    */     //   167: pop
/*    */     //   168: iinc #2, 1
/*    */     //   171: aload_0
/*    */     //   172: astore_3
/*    */     //   173: nop
/*    */     //   174: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   177: pop
/*    */     //   178: aload_3
/*    */     //   179: checkcast org/jetbrains/jewel/bridge/SwingBridgeService
/*    */     //   182: astore #4
/*    */     //   184: iconst_0
/*    */     //   185: istore #5
/*    */     //   187: aload #4
/*    */     //   189: invokespecial readThemeData : ()Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;
/*    */     //   192: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   195: astore #4
/*    */     //   197: goto -> 216
/*    */     //   200: astore #5
/*    */     //   202: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*    */     //   205: pop
/*    */     //   206: aload #5
/*    */     //   208: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*    */     //   211: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   214: astore #4
/*    */     //   216: aload #4
/*    */     //   218: astore_3
/*    */     //   219: aload_3
/*    */     //   220: invokestatic isSuccess-impl : (Ljava/lang/Object;)Z
/*    */     //   223: ifeq -> 95
/*    */     //   226: aload_3
/*    */     //   227: checkcast org/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData
/*    */     //   230: astore #4
/*    */     //   232: iconst_0
/*    */     //   233: istore #5
/*    */     //   235: aload #4
/*    */     //   237: areturn
/*    */     //   238: aload_0
/*    */     //   239: invokespecial readThemeData : ()Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;
/*    */     //   242: areturn
/*    */     //   243: new java/lang/IllegalStateException
/*    */     //   246: dup
/*    */     //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   249: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   252: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 60
/*    */     //   #32	-> 93
/*    */     //   #33	-> 95
/*    */     //   #34	-> 101
/*    */     //   #34	-> 115
/*    */     //   #31	-> 142
/*    */     //   #35	-> 167
/*    */     //   #36	-> 171
/*    */     //   #73	-> 184
/*    */     //   #36	-> 187
/*    */     //   #36	-> 192
/*    */     //   #37	-> 219
/*    */     //   #38	-> 235
/*    */     //   #41	-> 238
/*    */     //   #31	-> 243
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	52	0	this	Lorg/jetbrains/jewel/bridge/SwingBridgeService;
/*    */     //   160	32	0	this	Lorg/jetbrains/jewel/bridge/SwingBridgeService;
/*    */     //   192	51	0	this	Lorg/jetbrains/jewel/bridge/SwingBridgeService;
/*    */     //   95	50	2	counter	I
/*    */     //   151	41	2	counter	I
/*    */     //   192	51	2	counter	I
/*    */     //   184	8	4	$this$tryGettingThemeData_u24lambda_u241	Lorg/jetbrains/jewel/bridge/SwingBridgeService;
/*    */     //   232	6	4	it	Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;
/*    */     //   187	5	5	$i$a$-runCatching-SwingBridgeService$tryGettingThemeData$2	I
/*    */     //   235	3	5	$i$a$-onSuccess-SwingBridgeService$tryGettingThemeData$3	I
/*    */     //   0	253	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	193	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	186	6	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   173	197	200	java/lang/Throwable
/*    */   }
/*    */   
/*    */   private final BridgeThemeData readThemeData() {
/* 45 */     ThemeDefinition themeDefinition = IntUiBridgeKt.createBridgeThemeDefinition();
/* 46 */     return new BridgeThemeData(
/* 47 */         IntUiBridgeKt.createBridgeThemeDefinition(), 
/* 48 */         IntUiBridgeKt.createBridgeComponentStyling(themeDefinition));
/*    */   }
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0262\0020\001:\001\026B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "", "themeDefinition", "Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "componentStyling", "Lorg/jetbrains/jewel/ui/ComponentStyling;", "<init>", "(Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;)V", "getThemeDefinition", "()Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;", "getComponentStyling", "()Lorg/jetbrains/jewel/ui/ComponentStyling;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ide-laf-bridge"})
/*    */   @StabilityInferred(parameters = 0)
/* 52 */   public static final class BridgeThemeData { public BridgeThemeData(@NotNull ThemeDefinition themeDefinition, @NotNull ComponentStyling componentStyling) { this.themeDefinition = themeDefinition; this.componentStyling = componentStyling; } @NotNull public final ThemeDefinition getThemeDefinition() { return this.themeDefinition; } @NotNull public final ComponentStyling getComponentStyling() { return this.componentStyling; } @NotNull public final ThemeDefinition component1() { return this.themeDefinition; } @NotNull public final ComponentStyling component2() { return this.componentStyling; } @NotNull public final BridgeThemeData copy(@NotNull ThemeDefinition themeDefinition, @NotNull ComponentStyling componentStyling) { Intrinsics.checkNotNullParameter(themeDefinition, "themeDefinition"); Intrinsics.checkNotNullParameter(componentStyling, "componentStyling"); return new BridgeThemeData(themeDefinition, componentStyling); } @NotNull public String toString() { return "BridgeThemeData(themeDefinition=" + this.themeDefinition + ", componentStyling=" + this.componentStyling + ")"; } public int hashCode() { result = this.themeDefinition.hashCode(); return result * 31 + this.componentStyling.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof BridgeThemeData)) return false;  BridgeThemeData bridgeThemeData = (BridgeThemeData)other; return !Intrinsics.areEqual(this.themeDefinition, bridgeThemeData.themeDefinition) ? false : (!!Intrinsics.areEqual(this.componentStyling, bridgeThemeData.componentStyling)); } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData$Companion;", "", "<init>", "()V", "DEFAULT", "Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "getDEFAULT", "()Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "ide-laf-bridge"}) public static final class Companion
/*    */     {
/* 54 */       @NotNull public final SwingBridgeService.BridgeThemeData getDEFAULT() { return SwingBridgeService.BridgeThemeData.DEFAULT; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final ThemeDefinition themeDefinition; @NotNull private final ComponentStyling componentStyling; public static final int $stable = 8; @NotNull private static final BridgeThemeData DEFAULT; static { Companion $this$DEFAULT_u24lambda_u240 = Companion; int $i$a$-run-SwingBridgeService$BridgeThemeData$Companion$DEFAULT$1 = 0;
/* 55 */       TextStyle textStyle = TypographyKt.copyWithSize-Ce1Lr_4$default(TextStyle.Companion.getDefault(), TextUnitKt.getSp(13), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388606, null);
/* 56 */       TextStyle monospaceTextStyle = TextStyle.copy-p1EtxEg$default(textStyle, 0L, 0L, null, null, null, (FontFamily)FontFamily.Companion.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
/* 57 */       ThemeDefinition themeDefinition = 
/* 58 */         IntUiBridgeKt.createBridgeThemeDefinition(
/* 59 */           textStyle, 
/* 60 */           monospaceTextStyle, 
/* 61 */           monospaceTextStyle);
/*    */ 
/*    */       
/* 64 */       DEFAULT = new BridgeThemeData(
/* 65 */           themeDefinition, 
/* 66 */           IntUiBridgeKt.createBridgeComponentStyling(themeDefinition)); }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData$Companion;", "", "<init>", "()V", "DEFAULT", "Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "getDEFAULT", "()Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;", "ide-laf-bridge"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final SwingBridgeService.BridgeThemeData getDEFAULT() {
/*    */       return SwingBridgeService.BridgeThemeData.DEFAULT;
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SwingBridgeService.kt", l = {34}, i = {0, 0}, s = {"L$0", "I$0"}, n = {"this", "counter"}, m = "tryGettingThemeData", c = "org.jetbrains.jewel.bridge.SwingBridgeService")
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   static final class SwingBridgeService$tryGettingThemeData$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int I$0;
/*    */     int label;
/*    */     
/*    */     SwingBridgeService$tryGettingThemeData$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SwingBridgeService.this.tryGettingThemeData((Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\SwingBridgeService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */