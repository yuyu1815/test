/*     */ package androidx.compose.runtime.changelist;
/*     */ 
/*     */ import androidx.compose.runtime.Applier;
/*     */ import androidx.compose.runtime.InternalComposeApi;
/*     */ import androidx.compose.runtime.RememberManager;
/*     */ import androidx.compose.runtime.SlotWriter;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\025\n\000\n\002\020\b\n\000\n\002\020\021\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\b\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\034\n\002\b\004\b\000\030\000 J2\0020\001:\003JKLB\005¢\006\002\020\002J\006\020\025\032\0020\026J\020\020\027\032\0020\0062\006\020\030\032\0020\006H\002J\030\020\031\032\0020\0062\006\020\032\032\0020\0062\006\020\033\032\0020\006H\002J)\020\034\032\0020\0262\033\020\035\032\027\022\b\022\0060\037R\0020\000\022\004\022\0020\0260\036¢\006\002\b H\bø\001\000J\020\020!\032\0020\0262\006\020\033\032\0020\006H\002J\020\020\"\032\0020\0262\006\020\033\032\0020\006H\002J\"\020#\032\0020\0262\n\020$\032\006\022\002\b\0030%2\006\020&\032\0020'2\006\020(\032\0020)J)\020*\032\0020\0262\033\020+\032\027\022\b\022\0060\037R\0020\000\022\004\022\0020\0260\036¢\006\002\b H\bø\001\000J\006\020,\032\0020-J\006\020.\032\0020-J\b\020/\032\0020\rH\002J\006\0200\032\0020\026J\016\0201\032\0020\0262\006\0202\032\0020\000J\016\0203\032\0020\0262\006\0204\032\0020\rJ:\0203\032\0020\0262\006\0204\032\0020\r2\027\0205\032\023\022\004\022\00206\022\004\022\0020\0260\036¢\006\002\b H\bø\001\000\002\n\n\b\b\001\022\002\020\002 \001J\020\0207\032\0020\0262\006\0204\032\0020\rH\007J\020\0208\032\002092\006\020:\032\00209H\026J\b\020;\032\00209H\027J\032\020<\032\0020\0062\006\020=\032\0020>H\002ø\001\001¢\006\004\b?\020@J\036\020A\032\0020\0062\n\020=\032\006\022\002\b\0030BH\002ø\001\001¢\006\004\bC\020@J\030\020D\032\00209*\0060\037R\0020\0002\006\020:\032\00209H\002J\026\020E\032\00209*\004\030\0010\t2\006\020:\032\00209H\002J\f\020F\032\00209*\00209H\002J \020G\032\00209\"\004\b\000\020H*\b\022\004\022\002HH0I2\006\020:\032\00209H\002R\016\020\003\032\0020\004X\016¢\006\002\n\000R\016\020\005\032\0020\006X\016¢\006\002\n\000R\030\020\007\032\n\022\006\022\004\030\0010\t0\bX\016¢\006\004\n\002\020\nR\016\020\013\032\0020\006X\016¢\006\002\n\000R\030\020\f\032\n\022\006\022\004\030\0010\r0\bX\016¢\006\004\n\002\020\016R\016\020\017\032\0020\006X\016¢\006\002\n\000R\016\020\020\032\0020\006X\016¢\006\002\n\000R\016\020\021\032\0020\006X\016¢\006\002\n\000R\021\020\022\032\0020\0068F¢\006\006\032\004\b\023\020\024\002\016\n\005\b20\001\n\005\b¡\0360\001¨\006M"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "intArgs", "", "intArgsSize", "", "objectArgs", "", "", "[Ljava/lang/Object;", "objectArgsSize", "opCodes", "Landroidx/compose/runtime/changelist/Operation;", "[Landroidx/compose/runtime/changelist/Operation;", "opCodesSize", "pushedIntMask", "pushedObjectMask", "size", "getSize", "()I", "clear", "", "createExpectedArgMask", "paramCount", "determineNewSize", "currentSize", "requiredSize", "drain", "sink", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Lkotlin/ExtensionFunctionType;", "ensureIntArgsSizeAtLeast", "ensureObjectArgsSizeAtLeast", "executeAndFlushAllPendingOperations", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "forEach", "action", "isEmpty", "", "isNotEmpty", "peekOperation", "pop", "popInto", "other", "push", "operation", "args", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "pushOp", "toDebugString", "", "linePrefix", "toString", "topIntIndexOf", "parameter", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "topIntIndexOf-w8GmfQM", "(I)I", "topObjectIndexOf", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "topObjectIndexOf-31yXWZQ", "currentOpToDebugString", "formatOpArgumentToString", "indent", "toCollectionString", "T", "", "Companion", "OpIterator", "WriteScope", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,476:1\n295#1,7:491\n284#1:498\n295#1,7:499\n285#1,2:506\n295#1,7:508\n33#2,7:477\n50#2,7:484\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n284#1:491,7\n308#1:498\n308#1:499,7\n308#1:506,2\n407#1:508,7\n147#1:477,7\n174#1:484,7\n*E\n"})
/*     */ public final class Operations
/*     */   extends OperationsDebugStringFormattable
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*  45 */   private Operation[] opCodes = new Operation[16];
/*     */   private int opCodesSize;
/*     */   @NotNull
/*  48 */   private int[] intArgs = new int[16];
/*     */   private int intArgsSize;
/*     */   @NotNull
/*  51 */   private Object[] objectArgs = new Object[16];
/*     */   
/*     */   private int objectArgsSize;
/*     */   
/*     */   private int pushedIntMask;
/*     */   
/*     */   private int pushedObjectMask;
/*     */   
/*     */   public static final int $stable = 8;
/*     */   
/*     */   private static final int MaxResizeAmount = 1024;
/*     */   
/*     */   public static final int InitialCapacity = 16;
/*     */ 
/*     */   
/*     */   public final int getSize() {
/*  67 */     return this.opCodesSize;
/*     */   }
/*  69 */   public final boolean isEmpty() { return (getSize() == 0); } public final boolean isNotEmpty() {
/*  70 */     return (getSize() != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void clear() {
/*  81 */     this.opCodesSize = 0;
/*  82 */     this.intArgsSize = 0;
/*     */     
/*  84 */     ArraysKt.fill(this.objectArgs, null, 0, this.objectArgsSize);
/*  85 */     this.objectArgsSize = 0;
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
/*     */   @InternalComposeApi
/*     */   public final void pushOp(@NotNull Operation operation) {
/* 103 */     Intrinsics.checkNotNullParameter(operation, "operation"); this.pushedIntMask = 0;
/* 104 */     this.pushedObjectMask = 0;
/*     */ 
/*     */     
/* 107 */     if (this.opCodesSize == this.opCodes.length) {
/* 108 */       int resizeAmount = RangesKt.coerceAtMost(this.opCodesSize, 1024);
/* 109 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.opCodes, this.opCodesSize + resizeAmount), "copyOf(...)"); this.opCodes = Arrays.copyOf(this.opCodes, this.opCodesSize + resizeAmount);
/*     */     } 
/* 111 */     ensureIntArgsSizeAtLeast(this.intArgsSize + operation.getInts());
/* 112 */     ensureObjectArgsSizeAtLeast(this.objectArgsSize + operation.getObjects());
/*     */ 
/*     */     
/* 115 */     int i = this.opCodesSize; this.opCodesSize = i + 1; this.opCodes[i] = operation;
/* 116 */     this.intArgsSize += operation.getInts();
/* 117 */     this.objectArgsSize += operation.getObjects();
/*     */   }
/*     */   
/*     */   private final int determineNewSize(int currentSize, int requiredSize) {
/* 121 */     int resizeAmount = RangesKt.coerceAtMost(currentSize, 1024);
/* 122 */     return RangesKt.coerceAtLeast(currentSize + resizeAmount, requiredSize);
/*     */   }
/*     */   
/*     */   private final void ensureIntArgsSizeAtLeast(int requiredSize) {
/* 126 */     int currentSize = this.intArgs.length;
/* 127 */     if (requiredSize > currentSize) {
/* 128 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.intArgs, determineNewSize(currentSize, requiredSize)), "copyOf(...)"); this.intArgs = Arrays.copyOf(this.intArgs, determineNewSize(currentSize, requiredSize));
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void ensureObjectArgsSizeAtLeast(int requiredSize) {
/* 133 */     int currentSize = this.objectArgs.length;
/* 134 */     if (requiredSize > currentSize) {
/* 135 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.objectArgs, determineNewSize(currentSize, requiredSize)), "copyOf(...)"); this.objectArgs = Arrays.copyOf(this.objectArgs, determineNewSize(currentSize, requiredSize));
/*     */     } 
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
/*     */   public final void push(@NotNull Operation operation) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'operation'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokevirtual getInts : ()I
/*     */     //   10: ifne -> 24
/*     */     //   13: aload_1
/*     */     //   14: invokevirtual getObjects : ()I
/*     */     //   17: ifne -> 24
/*     */     //   20: iconst_1
/*     */     //   21: goto -> 25
/*     */     //   24: iconst_0
/*     */     //   25: istore_2
/*     */     //   26: iconst_0
/*     */     //   27: istore_3
/*     */     //   28: nop
/*     */     //   29: iload_2
/*     */     //   30: ifne -> 87
/*     */     //   33: iconst_0
/*     */     //   34: istore #4
/*     */     //   36: new java/lang/StringBuilder
/*     */     //   39: dup
/*     */     //   40: invokespecial <init> : ()V
/*     */     //   43: ldc 'Cannot push '
/*     */     //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   48: aload_1
/*     */     //   49: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   52: ldc ' without arguments because it expects '
/*     */     //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   57: aload_1
/*     */     //   58: invokevirtual getInts : ()I
/*     */     //   61: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   64: ldc ' ints and '
/*     */     //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   69: aload_1
/*     */     //   70: invokevirtual getObjects : ()I
/*     */     //   73: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   76: ldc ' objects.'
/*     */     //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   81: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   84: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   87: nop
/*     */     //   88: aload_0
/*     */     //   89: aload_1
/*     */     //   90: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   93: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #147	-> 6
/*     */     //   #477	-> 28
/*     */     //   #480	-> 29
/*     */     //   #481	-> 33
/*     */     //   #148	-> 36
/*     */     //   #149	-> 57
/*     */     //   #148	-> 61
/*     */     //   #149	-> 64
/*     */     //   #148	-> 66
/*     */     //   #149	-> 69
/*     */     //   #148	-> 73
/*     */     //   #149	-> 76
/*     */     //   #148	-> 78
/*     */     //   #481	-> 84
/*     */     //   #483	-> 87
/*     */     //   #152	-> 88
/*     */     //   #153	-> 93
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   36	48	4	$i$a$-requirePrecondition-Operations$push$1	I
/*     */     //   28	60	3	$i$f$requirePrecondition	I
/*     */     //   26	62	2	value$iv	Z
/*     */     //   0	94	0	this	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   0	94	1	operation	Landroidx/compose/runtime/changelist/Operation;
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
/*     */   public final void push(@NotNull Operation operation, @NotNull Function1 args) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'operation'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'args'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iconst_0
/*     */     //   13: istore_3
/*     */     //   14: nop
/*     */     //   15: aload_0
/*     */     //   16: aload_1
/*     */     //   17: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   20: aload_2
/*     */     //   21: aload_0
/*     */     //   22: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*     */     //   25: invokestatic box-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations$WriteScope;
/*     */     //   28: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   33: pop
/*     */     //   34: aload_0
/*     */     //   35: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   38: aload_0
/*     */     //   39: aload_1
/*     */     //   40: invokevirtual getInts : ()I
/*     */     //   43: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   46: if_icmpne -> 68
/*     */     //   49: aload_0
/*     */     //   50: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   53: aload_0
/*     */     //   54: aload_1
/*     */     //   55: invokevirtual getObjects : ()I
/*     */     //   58: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */     //   61: if_icmpne -> 68
/*     */     //   64: iconst_1
/*     */     //   65: goto -> 69
/*     */     //   68: iconst_0
/*     */     //   69: istore #4
/*     */     //   71: nop
/*     */     //   72: iconst_0
/*     */     //   73: istore #5
/*     */     //   75: nop
/*     */     //   76: iload #4
/*     */     //   78: ifne -> 369
/*     */     //   81: iconst_0
/*     */     //   82: istore #6
/*     */     //   84: iconst_0
/*     */     //   85: istore #7
/*     */     //   87: new java/lang/StringBuilder
/*     */     //   90: dup
/*     */     //   91: invokespecial <init> : ()V
/*     */     //   94: astore #8
/*     */     //   96: aload #8
/*     */     //   98: astore #9
/*     */     //   100: iconst_0
/*     */     //   101: istore #10
/*     */     //   103: aload_1
/*     */     //   104: invokevirtual getInts : ()I
/*     */     //   107: istore #11
/*     */     //   109: iconst_0
/*     */     //   110: istore #12
/*     */     //   112: iload #12
/*     */     //   114: iload #11
/*     */     //   116: if_icmpge -> 179
/*     */     //   119: iload #12
/*     */     //   121: istore #13
/*     */     //   123: iconst_0
/*     */     //   124: istore #14
/*     */     //   126: iconst_1
/*     */     //   127: iload #13
/*     */     //   129: ishl
/*     */     //   130: aload_0
/*     */     //   131: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   134: iand
/*     */     //   135: ifeq -> 172
/*     */     //   138: iload #7
/*     */     //   140: ifle -> 151
/*     */     //   143: aload #9
/*     */     //   145: ldc ', '
/*     */     //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   150: pop
/*     */     //   151: aload #9
/*     */     //   153: aload_1
/*     */     //   154: iload #13
/*     */     //   156: invokestatic constructor-impl : (I)I
/*     */     //   159: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */     //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   165: pop
/*     */     //   166: iload #7
/*     */     //   168: iconst_1
/*     */     //   169: iadd
/*     */     //   170: istore #7
/*     */     //   172: nop
/*     */     //   173: iinc #12, 1
/*     */     //   176: goto -> 112
/*     */     //   179: nop
/*     */     //   180: aload #8
/*     */     //   182: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   185: dup
/*     */     //   186: ldc 'toString(...)'
/*     */     //   188: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   191: astore #16
/*     */     //   193: iconst_0
/*     */     //   194: istore #8
/*     */     //   196: new java/lang/StringBuilder
/*     */     //   199: dup
/*     */     //   200: invokespecial <init> : ()V
/*     */     //   203: astore #10
/*     */     //   205: aload #10
/*     */     //   207: astore #11
/*     */     //   209: iconst_0
/*     */     //   210: istore #12
/*     */     //   212: aload_1
/*     */     //   213: invokevirtual getObjects : ()I
/*     */     //   216: istore #13
/*     */     //   218: iconst_0
/*     */     //   219: istore #14
/*     */     //   221: iload #14
/*     */     //   223: iload #13
/*     */     //   225: if_icmpge -> 288
/*     */     //   228: iload #14
/*     */     //   230: istore #15
/*     */     //   232: iconst_0
/*     */     //   233: istore #17
/*     */     //   235: iconst_1
/*     */     //   236: iload #15
/*     */     //   238: ishl
/*     */     //   239: aload_0
/*     */     //   240: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */     //   243: iand
/*     */     //   244: ifeq -> 281
/*     */     //   247: iload #7
/*     */     //   249: ifle -> 260
/*     */     //   252: aload #11
/*     */     //   254: ldc ', '
/*     */     //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   259: pop
/*     */     //   260: aload #11
/*     */     //   262: aload_1
/*     */     //   263: iload #15
/*     */     //   265: invokestatic constructor-impl : (I)I
/*     */     //   268: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */     //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   274: pop
/*     */     //   275: iload #8
/*     */     //   277: iconst_1
/*     */     //   278: iadd
/*     */     //   279: istore #8
/*     */     //   281: nop
/*     */     //   282: iinc #14, 1
/*     */     //   285: goto -> 221
/*     */     //   288: nop
/*     */     //   289: aload #10
/*     */     //   291: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   294: dup
/*     */     //   295: ldc 'toString(...)'
/*     */     //   297: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   300: astore #9
/*     */     //   302: new java/lang/StringBuilder
/*     */     //   305: dup
/*     */     //   306: invokespecial <init> : ()V
/*     */     //   309: ldc 'Error while pushing '
/*     */     //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   314: aload_1
/*     */     //   315: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   318: ldc '. Not all arguments were provided. Missing '
/*     */     //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   323: iload #7
/*     */     //   325: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   328: ldc ' int arguments ('
/*     */     //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   333: aload #16
/*     */     //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   338: ldc ') and '
/*     */     //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   343: iload #8
/*     */     //   345: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   348: ldc ' object arguments ('
/*     */     //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   353: aload #9
/*     */     //   355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   358: ldc ').'
/*     */     //   360: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   363: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   366: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   369: nop
/*     */     //   370: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #167	-> 14
/*     */     //   #170	-> 15
/*     */     //   #171	-> 20
/*     */     //   #175	-> 34
/*     */     //   #176	-> 49
/*     */     //   #174	-> 71
/*     */     //   #484	-> 75
/*     */     //   #487	-> 76
/*     */     //   #488	-> 81
/*     */     //   #178	-> 84
/*     */     //   #179	-> 87
/*     */     //   #180	-> 103
/*     */     //   #181	-> 126
/*     */     //   #182	-> 138
/*     */     //   #183	-> 151
/*     */     //   #184	-> 166
/*     */     //   #186	-> 172
/*     */     //   #180	-> 173
/*     */     //   #187	-> 179
/*     */     //   #179	-> 180
/*     */     //   #179	-> 191
/*     */     //   #189	-> 193
/*     */     //   #190	-> 196
/*     */     //   #191	-> 212
/*     */     //   #192	-> 235
/*     */     //   #193	-> 247
/*     */     //   #194	-> 260
/*     */     //   #195	-> 275
/*     */     //   #197	-> 281
/*     */     //   #191	-> 282
/*     */     //   #198	-> 288
/*     */     //   #190	-> 289
/*     */     //   #190	-> 300
/*     */     //   #200	-> 302
/*     */     //   #201	-> 323
/*     */     //   #200	-> 325
/*     */     //   #201	-> 328
/*     */     //   #200	-> 330
/*     */     //   #201	-> 333
/*     */     //   #200	-> 335
/*     */     //   #201	-> 338
/*     */     //   #200	-> 340
/*     */     //   #202	-> 343
/*     */     //   #200	-> 345
/*     */     //   #202	-> 348
/*     */     //   #200	-> 350
/*     */     //   #202	-> 353
/*     */     //   #200	-> 355
/*     */     //   #202	-> 358
/*     */     //   #200	-> 360
/*     */     //   #488	-> 366
/*     */     //   #490	-> 369
/*     */     //   #204	-> 370
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   126	47	14	$i$a$-repeat-Operations$push$3$missingInts$1$1	I
/*     */     //   123	50	13	arg	I
/*     */     //   103	77	10	$i$a$-buildString-Operations$push$3$missingInts$1	I
/*     */     //   100	80	9	$this$push_u24lambda_u246_u24lambda_u243	Ljava/lang/StringBuilder;
/*     */     //   235	47	17	$i$a$-repeat-Operations$push$3$missingObjects$1$1	I
/*     */     //   232	50	15	arg	I
/*     */     //   212	77	12	$i$a$-buildString-Operations$push$3$missingObjects$1	I
/*     */     //   209	80	11	$this$push_u24lambda_u246_u24lambda_u245	Ljava/lang/StringBuilder;
/*     */     //   84	282	6	$i$a$-checkPrecondition-Operations$push$3	I
/*     */     //   87	279	7	missingIntCount	I
/*     */     //   193	173	16	missingInts	Ljava/lang/String;
/*     */     //   196	170	8	missingObjectCount	I
/*     */     //   302	64	9	missingObjects	Ljava/lang/String;
/*     */     //   75	295	5	$i$f$checkPrecondition	I
/*     */     //   72	298	4	value$iv	Z
/*     */     //   14	357	3	$i$f$push	I
/*     */     //   0	371	0	this	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   0	371	1	operation	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	371	2	args	Lkotlin/jvm/functions/Function1;
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
/*     */   private final int createExpectedArgMask(int paramCount) {
/* 213 */     return (paramCount == 0) ? 0 : (-1 >>> 32 - paramCount);
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
/*     */   public final void pop() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual isEmpty : ()Z
/*     */     //   4: ifeq -> 17
/*     */     //   7: new java/util/NoSuchElementException
/*     */     //   10: dup
/*     */     //   11: ldc 'Cannot pop(), because the stack is empty.'
/*     */     //   13: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   16: athrow
/*     */     //   17: aload_0
/*     */     //   18: getfield opCodes : [Landroidx/compose/runtime/changelist/Operation;
/*     */     //   21: aload_0
/*     */     //   22: aload_0
/*     */     //   23: getfield opCodesSize : I
/*     */     //   26: iconst_m1
/*     */     //   27: iadd
/*     */     //   28: putfield opCodesSize : I
/*     */     //   31: aload_0
/*     */     //   32: getfield opCodesSize : I
/*     */     //   35: aaload
/*     */     //   36: dup
/*     */     //   37: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   40: astore_1
/*     */     //   41: aload_0
/*     */     //   42: getfield opCodes : [Landroidx/compose/runtime/changelist/Operation;
/*     */     //   45: aload_0
/*     */     //   46: getfield opCodesSize : I
/*     */     //   49: aconst_null
/*     */     //   50: aastore
/*     */     //   51: aload_1
/*     */     //   52: invokevirtual getObjects : ()I
/*     */     //   55: istore_2
/*     */     //   56: iconst_0
/*     */     //   57: istore_3
/*     */     //   58: iload_3
/*     */     //   59: iload_2
/*     */     //   60: if_icmpge -> 96
/*     */     //   63: iload_3
/*     */     //   64: istore #4
/*     */     //   66: iconst_0
/*     */     //   67: istore #5
/*     */     //   69: aload_0
/*     */     //   70: getfield objectArgs : [Ljava/lang/Object;
/*     */     //   73: aload_0
/*     */     //   74: aload_0
/*     */     //   75: getfield objectArgsSize : I
/*     */     //   78: iconst_m1
/*     */     //   79: iadd
/*     */     //   80: putfield objectArgsSize : I
/*     */     //   83: aload_0
/*     */     //   84: getfield objectArgsSize : I
/*     */     //   87: aconst_null
/*     */     //   88: aastore
/*     */     //   89: nop
/*     */     //   90: iinc #3, 1
/*     */     //   93: goto -> 58
/*     */     //   96: aload_1
/*     */     //   97: invokevirtual getInts : ()I
/*     */     //   100: istore_2
/*     */     //   101: iconst_0
/*     */     //   102: istore_3
/*     */     //   103: iload_3
/*     */     //   104: iload_2
/*     */     //   105: if_icmpge -> 141
/*     */     //   108: iload_3
/*     */     //   109: istore #4
/*     */     //   111: iconst_0
/*     */     //   112: istore #5
/*     */     //   114: aload_0
/*     */     //   115: getfield intArgs : [I
/*     */     //   118: aload_0
/*     */     //   119: aload_0
/*     */     //   120: getfield intArgsSize : I
/*     */     //   123: iconst_m1
/*     */     //   124: iadd
/*     */     //   125: putfield intArgsSize : I
/*     */     //   128: aload_0
/*     */     //   129: getfield intArgsSize : I
/*     */     //   132: iconst_0
/*     */     //   133: iastore
/*     */     //   134: nop
/*     */     //   135: iinc #3, 1
/*     */     //   138: goto -> 103
/*     */     //   141: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #221	-> 0
/*     */     //   #222	-> 7
/*     */     //   #224	-> 17
/*     */     //   #225	-> 41
/*     */     //   #227	-> 51
/*     */     //   #228	-> 69
/*     */     //   #229	-> 89
/*     */     //   #227	-> 90
/*     */     //   #231	-> 96
/*     */     //   #232	-> 114
/*     */     //   #233	-> 134
/*     */     //   #231	-> 135
/*     */     //   #234	-> 141
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   69	21	5	$i$a$-repeat-Operations$pop$1	I
/*     */     //   66	24	4	it	I
/*     */     //   114	21	5	$i$a$-repeat-Operations$pop$2	I
/*     */     //   111	24	4	it	I
/*     */     //   41	101	1	op	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   0	142	0	this	Landroidx/compose/runtime/changelist/Operations;
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
/*     */   public final void popInto(@NotNull Operations other) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'other'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual isEmpty : ()Z
/*     */     //   11: ifeq -> 24
/*     */     //   14: new java/util/NoSuchElementException
/*     */     //   17: dup
/*     */     //   18: ldc 'Cannot pop(), because the stack is empty.'
/*     */     //   20: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   23: athrow
/*     */     //   24: aload_0
/*     */     //   25: getfield opCodes : [Landroidx/compose/runtime/changelist/Operation;
/*     */     //   28: aload_0
/*     */     //   29: aload_0
/*     */     //   30: getfield opCodesSize : I
/*     */     //   33: iconst_m1
/*     */     //   34: iadd
/*     */     //   35: putfield opCodesSize : I
/*     */     //   38: aload_0
/*     */     //   39: getfield opCodesSize : I
/*     */     //   42: aaload
/*     */     //   43: dup
/*     */     //   44: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   47: astore_2
/*     */     //   48: aload_0
/*     */     //   49: getfield opCodes : [Landroidx/compose/runtime/changelist/Operation;
/*     */     //   52: aload_0
/*     */     //   53: getfield opCodesSize : I
/*     */     //   56: aconst_null
/*     */     //   57: aastore
/*     */     //   58: aload_1
/*     */     //   59: aload_2
/*     */     //   60: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*     */     //   63: iconst_0
/*     */     //   64: istore_3
/*     */     //   65: aload_0
/*     */     //   66: getfield objectArgsSize : I
/*     */     //   69: istore_3
/*     */     //   70: iconst_0
/*     */     //   71: istore #4
/*     */     //   73: aload_1
/*     */     //   74: getfield objectArgsSize : I
/*     */     //   77: istore #4
/*     */     //   79: aload_2
/*     */     //   80: invokevirtual getObjects : ()I
/*     */     //   83: istore #5
/*     */     //   85: iconst_0
/*     */     //   86: istore #6
/*     */     //   88: iload #6
/*     */     //   90: iload #5
/*     */     //   92: if_icmpge -> 139
/*     */     //   95: iload #6
/*     */     //   97: istore #7
/*     */     //   99: iconst_0
/*     */     //   100: istore #8
/*     */     //   102: iload #4
/*     */     //   104: iconst_m1
/*     */     //   105: iadd
/*     */     //   106: istore #4
/*     */     //   108: iload_3
/*     */     //   109: iconst_m1
/*     */     //   110: iadd
/*     */     //   111: istore_3
/*     */     //   112: aload_1
/*     */     //   113: getfield objectArgs : [Ljava/lang/Object;
/*     */     //   116: iload #4
/*     */     //   118: aload_0
/*     */     //   119: getfield objectArgs : [Ljava/lang/Object;
/*     */     //   122: iload_3
/*     */     //   123: aaload
/*     */     //   124: aastore
/*     */     //   125: aload_0
/*     */     //   126: getfield objectArgs : [Ljava/lang/Object;
/*     */     //   129: iload_3
/*     */     //   130: aconst_null
/*     */     //   131: aastore
/*     */     //   132: nop
/*     */     //   133: iinc #6, 1
/*     */     //   136: goto -> 88
/*     */     //   139: iconst_0
/*     */     //   140: istore #5
/*     */     //   142: aload_0
/*     */     //   143: getfield intArgsSize : I
/*     */     //   146: istore #5
/*     */     //   148: iconst_0
/*     */     //   149: istore #6
/*     */     //   151: aload_1
/*     */     //   152: getfield intArgsSize : I
/*     */     //   155: istore #6
/*     */     //   157: aload_2
/*     */     //   158: invokevirtual getInts : ()I
/*     */     //   161: istore #7
/*     */     //   163: iconst_0
/*     */     //   164: istore #8
/*     */     //   166: iload #8
/*     */     //   168: iload #7
/*     */     //   170: if_icmpge -> 221
/*     */     //   173: iload #8
/*     */     //   175: istore #9
/*     */     //   177: iconst_0
/*     */     //   178: istore #10
/*     */     //   180: iload #6
/*     */     //   182: iconst_m1
/*     */     //   183: iadd
/*     */     //   184: istore #6
/*     */     //   186: iload #5
/*     */     //   188: iconst_m1
/*     */     //   189: iadd
/*     */     //   190: istore #5
/*     */     //   192: aload_1
/*     */     //   193: getfield intArgs : [I
/*     */     //   196: iload #6
/*     */     //   198: aload_0
/*     */     //   199: getfield intArgs : [I
/*     */     //   202: iload #5
/*     */     //   204: iaload
/*     */     //   205: iastore
/*     */     //   206: aload_0
/*     */     //   207: getfield intArgs : [I
/*     */     //   210: iload #5
/*     */     //   212: iconst_0
/*     */     //   213: iastore
/*     */     //   214: nop
/*     */     //   215: iinc #8, 1
/*     */     //   218: goto -> 166
/*     */     //   221: aload_0
/*     */     //   222: aload_0
/*     */     //   223: getfield objectArgsSize : I
/*     */     //   226: aload_2
/*     */     //   227: invokevirtual getObjects : ()I
/*     */     //   230: isub
/*     */     //   231: putfield objectArgsSize : I
/*     */     //   234: aload_0
/*     */     //   235: aload_0
/*     */     //   236: getfield intArgsSize : I
/*     */     //   239: aload_2
/*     */     //   240: invokevirtual getInts : ()I
/*     */     //   243: isub
/*     */     //   244: putfield intArgsSize : I
/*     */     //   247: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #242	-> 7
/*     */     //   #243	-> 14
/*     */     //   #245	-> 24
/*     */     //   #246	-> 48
/*     */     //   #248	-> 58
/*     */     //   #250	-> 63
/*     */     //   #251	-> 70
/*     */     //   #252	-> 79
/*     */     //   #253	-> 102
/*     */     //   #254	-> 108
/*     */     //   #255	-> 112
/*     */     //   #256	-> 125
/*     */     //   #257	-> 132
/*     */     //   #252	-> 133
/*     */     //   #259	-> 139
/*     */     //   #260	-> 148
/*     */     //   #261	-> 157
/*     */     //   #262	-> 180
/*     */     //   #263	-> 186
/*     */     //   #264	-> 192
/*     */     //   #265	-> 206
/*     */     //   #266	-> 214
/*     */     //   #261	-> 215
/*     */     //   #268	-> 221
/*     */     //   #269	-> 234
/*     */     //   #270	-> 247
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   102	31	8	$i$a$-repeat-Operations$popInto$1	I
/*     */     //   99	34	7	it	I
/*     */     //   180	35	10	$i$a$-repeat-Operations$popInto$2	I
/*     */     //   177	38	9	it	I
/*     */     //   48	200	2	op	Landroidx/compose/runtime/changelist/Operation;
/*     */     //   65	183	3	thisObjIdx	I
/*     */     //   73	175	4	otherObjIdx	I
/*     */     //   142	106	5	thisIntIdx	I
/*     */     //   151	97	6	otherIntIdx	I
/*     */     //   0	248	0	this	Landroidx/compose/runtime/changelist/Operations;
/*     */     //   0	248	1	other	Landroidx/compose/runtime/changelist/Operations;
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
/*     */   public final void forEach(@NotNull Function1 action) {
/*     */     Intrinsics.checkNotNullParameter(action, "action");
/*     */     int $i$f$forEach = 0;
/*     */     if (isNotEmpty()) {
/*     */       OpIterator iterator = new OpIterator();
/*     */       do {
/*     */         action.invoke(iterator);
/*     */       } while (iterator.next());
/*     */     } 
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
/*     */   public final void drain(@NotNull Function1 sink)
/*     */   {
/* 284 */     Intrinsics.checkNotNullParameter(sink, "sink"); int $i$f$drain = 0; Operations this_$iv = this; int $i$f$forEach = 0;
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
/* 491 */     if (this_$iv.isNotEmpty()) {
/* 492 */       OpIterator iterator$iv = new OpIterator();
/*     */       do {
/* 494 */         sink.invoke(iterator$iv);
/* 495 */       } while (iterator$iv.next());
/*     */     }  clear(); } public final void executeAndFlushAllPendingOperations(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) { Intrinsics.checkNotNullParameter(applier, "applier"); Intrinsics.checkNotNullParameter(slots, "slots"); Intrinsics.checkNotNullParameter(rememberManager, "rememberManager"); Operations this_$iv = this;
/*     */     int $i$f$drain = 0;
/* 498 */     Operations this_$iv$iv = this_$iv; int $i$f$forEach = 0;
/* 499 */     if (this_$iv$iv.isNotEmpty()) {
/* 500 */       OpIterator iterator$iv$iv = new OpIterator();
/*     */       do {
/* 502 */         OpIterator $this$executeAndFlushAllPendingOperations_u24lambda_u2412 = iterator$iv$iv; int $i$a$-drain-Operations$executeAndFlushAllPendingOperations$1 = 0; Operation $this$executeAndFlushAllPendingOperations_u24lambda_u2412_u24lambda_u2411 = $this$executeAndFlushAllPendingOperations_u24lambda_u2412.getOperation(); int $i$a$-with-Operations$executeAndFlushAllPendingOperations$1$1 = 0; $this$executeAndFlushAllPendingOperations_u24lambda_u2412_u24lambda_u2411.execute($this$executeAndFlushAllPendingOperations_u24lambda_u2412, applier, slots, rememberManager);
/* 503 */       } while (iterator$iv$iv.next());
/*     */     } 
/*     */     
/* 506 */     this_$iv.clear(); } @NotNull public String toDebugString(@NotNull String linePrefix) { Intrinsics.checkNotNullParameter(linePrefix, "linePrefix"); StringBuilder stringBuilder1 = new StringBuilder(), $this$toDebugString_u24lambda_u2414 = stringBuilder1; int $i$a$-buildString-Operations$toDebugString$1 = 0; int opNumber = 0; opNumber = 1; Operations this_$iv = this;
/*     */     int $i$f$forEach = 0;
/* 508 */     if (this_$iv.isNotEmpty()) {
/* 509 */       OpIterator iterator$iv = new OpIterator();
/*     */       do {
/* 511 */         OpIterator $this$toDebugString_u24lambda_u2414_u24lambda_u2413 = iterator$iv; int $i$a$-forEach-Operations$toDebugString$1$1 = 0; $this$toDebugString_u24lambda_u2414.append(linePrefix); int i = opNumber; opNumber = i + 1; $this$toDebugString_u24lambda_u2414.append(i); $this$toDebugString_u24lambda_u2414.append(". "); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2414.append(currentOpToDebugString($this$toDebugString_u24lambda_u2414_u24lambda_u2413, linePrefix)), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toDebugString_u24lambda_u2414.append(currentOpToDebugString($this$toDebugString_u24lambda_u2414_u24lambda_u2413, linePrefix)).append('\n'), "append(...)"); $this$toDebugString_u24lambda_u2414.append(currentOpToDebugString($this$toDebugString_u24lambda_u2414_u24lambda_u2413, linePrefix)).append('\n');
/* 512 */       } while (iterator$iv.next());
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString(); }
/*     */ 
/*     */   
/*     */   private final String indent(String $this$indent) {
/*     */     return $this$indent + "    ";
/*     */   }
/*     */   
/*     */   private final Operation peekOperation() {
/*     */     Intrinsics.checkNotNull(this.opCodes[this.opCodesSize - 1]);
/*     */     return this.opCodes[this.opCodesSize - 1];
/*     */   }
/*     */   
/*     */   private final int topIntIndexOf-w8GmfQM(int parameter) {
/*     */     return this.intArgsSize - peekOperation().getInts() + parameter;
/*     */   }
/*     */   
/*     */   private final int topObjectIndexOf-31yXWZQ(int parameter) {
/*     */     return this.objectArgsSize - peekOperation().getObjects() + parameter;
/*     */   }
/*     */   
/*     */   @JvmInline
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\n\032\0020\0132\b\020\f\032\004\030\0010\001HÖ\003¢\006\004\b\r\020\016J\020\020\017\032\0020\020HÖ\001¢\006\004\b\021\020\022J \020\023\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\020ø\001\000¢\006\004\b\030\020\031J,\020\032\032\0020\024\"\004\b\000\020\0332\f\020\025\032\b\022\004\022\002H\0330\0342\006\020\027\032\002H\033ø\001\000¢\006\004\b\035\020\036J\020\020\037\032\0020 HÖ\001¢\006\004\b!\020\"R\021\020\006\032\0020\0078F¢\006\006\032\004\b\b\020\tR\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003\002\007\n\005\b¡\0360\001¨\006#"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "stack", "Landroidx/compose/runtime/changelist/Operations;", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/changelist/Operations;)I", "setInt", "", "parameter", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "value", "setInt-A6tL2VI", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setObject", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "toString", "", "toString-impl", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "runtime"})
/*     */   @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,476:1\n50#2,7:477\n50#2,7:484\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n336#1:477,7\n345#1:484,7\n*E\n"})
/*     */   public static final class WriteScope {
/*     */     @NotNull
/*     */     private final Operations stack;
/*     */     
/*     */     @NotNull
/*     */     public static final Operation getOperation-impl(Operations arg0) {
/*     */       return arg0.peekOperation();
/*     */     }
/*     */     
/*     */     public static final void setInt-A6tL2VI(Operations arg0, int parameter, int value) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: astore_3
/*     */       //   2: iconst_0
/*     */       //   3: istore #4
/*     */       //   5: iconst_1
/*     */       //   6: iload_1
/*     */       //   7: ishl
/*     */       //   8: istore #5
/*     */       //   10: aload_3
/*     */       //   11: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */       //   14: iload #5
/*     */       //   16: iand
/*     */       //   17: ifne -> 24
/*     */       //   20: iconst_1
/*     */       //   21: goto -> 25
/*     */       //   24: iconst_0
/*     */       //   25: istore #6
/*     */       //   27: iconst_0
/*     */       //   28: istore #7
/*     */       //   30: nop
/*     */       //   31: iload #6
/*     */       //   33: ifne -> 68
/*     */       //   36: iconst_0
/*     */       //   37: istore #8
/*     */       //   39: new java/lang/StringBuilder
/*     */       //   42: dup
/*     */       //   43: invokespecial <init> : ()V
/*     */       //   46: ldc 'Already pushed argument '
/*     */       //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   51: aload_0
/*     */       //   52: invokestatic getOperation-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;
/*     */       //   55: iload_1
/*     */       //   56: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*     */       //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   62: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   65: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */       //   68: nop
/*     */       //   69: aload_3
/*     */       //   70: aload_3
/*     */       //   71: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */       //   74: iload #5
/*     */       //   76: ior
/*     */       //   77: invokestatic access$setPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;I)V
/*     */       //   80: aload_3
/*     */       //   81: invokestatic access$getIntArgs$p : (Landroidx/compose/runtime/changelist/Operations;)[I
/*     */       //   84: aload_3
/*     */       //   85: iload_1
/*     */       //   86: invokestatic access$topIntIndexOf-w8GmfQM : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */       //   89: iload_2
/*     */       //   90: iastore
/*     */       //   91: nop
/*     */       //   92: nop
/*     */       //   93: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #334	-> 0
/*     */       //   #335	-> 5
/*     */       //   #336	-> 10
/*     */       //   #477	-> 30
/*     */       //   #480	-> 31
/*     */       //   #481	-> 36
/*     */       //   #337	-> 39
/*     */       //   #481	-> 65
/*     */       //   #483	-> 68
/*     */       //   #339	-> 69
/*     */       //   #340	-> 80
/*     */       //   #341	-> 91
/*     */       //   #334	-> 92
/*     */       //   #341	-> 93
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   39	26	8	$i$a$-checkPrecondition-Operations$WriteScope$setInt$1$1	I
/*     */       //   30	39	7	$i$f$checkPrecondition	I
/*     */       //   27	42	6	value$iv	Z
/*     */       //   5	87	4	$i$a$-with-Operations$WriteScope$setInt$1	I
/*     */       //   10	82	5	mask	I
/*     */       //   2	90	3	$this$setInt_A6tL2VI_u24lambda_u241	Landroidx/compose/runtime/changelist/Operations;
/*     */       //   0	94	0	arg0	Landroidx/compose/runtime/changelist/Operations;
/*     */       //   0	94	1	parameter	I
/*     */       //   0	94	2	value	I
/*     */     }
/*     */     
/*     */     public static final <T> void setObject-DKhxnng(Operations arg0, int parameter, Object value) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: astore_3
/*     */       //   2: iconst_0
/*     */       //   3: istore #4
/*     */       //   5: iconst_1
/*     */       //   6: iload_1
/*     */       //   7: ishl
/*     */       //   8: istore #5
/*     */       //   10: aload_3
/*     */       //   11: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */       //   14: iload #5
/*     */       //   16: iand
/*     */       //   17: ifne -> 24
/*     */       //   20: iconst_1
/*     */       //   21: goto -> 25
/*     */       //   24: iconst_0
/*     */       //   25: istore #6
/*     */       //   27: iconst_0
/*     */       //   28: istore #7
/*     */       //   30: nop
/*     */       //   31: iload #6
/*     */       //   33: ifne -> 68
/*     */       //   36: iconst_0
/*     */       //   37: istore #8
/*     */       //   39: new java/lang/StringBuilder
/*     */       //   42: dup
/*     */       //   43: invokespecial <init> : ()V
/*     */       //   46: ldc 'Already pushed argument '
/*     */       //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   51: aload_0
/*     */       //   52: invokestatic getOperation-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;
/*     */       //   55: iload_1
/*     */       //   56: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*     */       //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   62: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   65: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */       //   68: nop
/*     */       //   69: aload_3
/*     */       //   70: aload_3
/*     */       //   71: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*     */       //   74: iload #5
/*     */       //   76: ior
/*     */       //   77: invokestatic access$setPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;I)V
/*     */       //   80: aload_3
/*     */       //   81: invokestatic access$getObjectArgs$p : (Landroidx/compose/runtime/changelist/Operations;)[Ljava/lang/Object;
/*     */       //   84: aload_3
/*     */       //   85: iload_1
/*     */       //   86: invokestatic access$topObjectIndexOf-31yXWZQ : (Landroidx/compose/runtime/changelist/Operations;I)I
/*     */       //   89: aload_2
/*     */       //   90: aastore
/*     */       //   91: nop
/*     */       //   92: nop
/*     */       //   93: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #343	-> 0
/*     */       //   #344	-> 5
/*     */       //   #345	-> 10
/*     */       //   #484	-> 30
/*     */       //   #487	-> 31
/*     */       //   #488	-> 36
/*     */       //   #346	-> 39
/*     */       //   #488	-> 65
/*     */       //   #490	-> 68
/*     */       //   #348	-> 69
/*     */       //   #349	-> 80
/*     */       //   #350	-> 91
/*     */       //   #343	-> 92
/*     */       //   #350	-> 93
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   39	26	8	$i$a$-checkPrecondition-Operations$WriteScope$setObject$1$1	I
/*     */       //   30	39	7	$i$f$checkPrecondition	I
/*     */       //   27	42	6	value$iv	Z
/*     */       //   5	87	4	$i$a$-with-Operations$WriteScope$setObject$1	I
/*     */       //   10	82	5	mask	I
/*     */       //   2	90	3	$this$setObject_DKhxnng_u24lambda_u243	Landroidx/compose/runtime/changelist/Operations;
/*     */       //   0	94	0	arg0	Landroidx/compose/runtime/changelist/Operations;
/*     */       //   0	94	1	parameter	I
/*     */       //   0	94	2	value	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public static String toString-impl(Operations arg0) {
/*     */       return "WriteScope(stack=" + arg0 + ')';
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return toString-impl(this.stack);
/*     */     }
/*     */     
/*     */     public static int hashCode-impl(Operations arg0) {
/*     */       return arg0.hashCode();
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return hashCode-impl(this.stack);
/*     */     }
/*     */     
/*     */     public static boolean equals-impl(Operations arg0, Object other) {
/*     */       return !(other instanceof WriteScope) ? false : (!!Intrinsics.areEqual(arg0, ((WriteScope)other).unbox-impl()));
/*     */     }
/*     */     
/*     */     public boolean equals(Object other) {
/*     */       return equals-impl(this.stack, other);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public static Operations constructor-impl(@NotNull Operations stack) {
/*     */       Intrinsics.checkNotNullParameter(stack, "stack");
/*     */       return stack;
/*     */     }
/*     */     
/*     */     public static final boolean equals-impl0(Operations p1, Operations p2) {
/*     */       return Intrinsics.areEqual(p1, p2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\013\n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\032\020\013\032\0020\0042\006\020\f\032\0020\rH\026ø\001\000¢\006\004\b\016\020\017J&\020\020\032\002H\021\"\004\b\000\020\0212\f\020\f\032\b\022\004\022\002H\0210\022H\026ø\001\000¢\006\004\b\023\020\024J\006\020\025\032\0020\026R\016\020\003\032\0020\004X\016¢\006\002\n\000R\016\020\005\032\0020\004X\016¢\006\002\n\000R\016\020\006\032\0020\004X\016¢\006\002\n\000R\021\020\007\032\0020\b8F¢\006\006\032\004\b\t\020\n\002\007\n\005\b¡\0360\001¨\006\027"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "(Landroidx/compose/runtime/changelist/Operations;)V", "intIdx", "", "objIdx", "opIdx", "operation", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "getInt", "parameter", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInt-w8GmfQM", "(I)I", "getObject", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "next", "", "runtime"})
/*     */   public final class OpIterator implements OperationArgContainer {
/*     */     private int opIdx;
/*     */     private int intIdx;
/*     */     private int objIdx;
/*     */     
/*     */     public final boolean next() {
/*     */       if (this.opIdx >= Operations.this.opCodesSize)
/*     */         return false; 
/*     */       Operation op = getOperation();
/*     */       this.intIdx += op.getInts();
/*     */       this.objIdx += op.getObjects();
/*     */       int i = this.opIdx;
/*     */       this.opIdx = i + 1;
/*     */       return (this.opIdx < Operations.this.opCodesSize);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Operation getOperation() {
/*     */       Intrinsics.checkNotNull(Operations.this.opCodes[this.opIdx]);
/*     */       return Operations.this.opCodes[this.opIdx];
/*     */     }
/*     */     
/*     */     public int getInt-w8GmfQM(int parameter) {
/*     */       return Operations.this.intArgs[this.intIdx + parameter];
/*     */     }
/*     */     
/*     */     public <T> T getObject-31yXWZQ(int parameter) {
/*     */       return (T)Operations.this.objectArgs[this.objIdx + parameter];
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000¨\006\006"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$Companion;", "", "()V", "InitialCapacity", "", "MaxResizeAmount", "runtime"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return super.toString();
/*     */   }
/*     */   
/*     */   private final String currentOpToDebugString(OpIterator $this$currentOpToDebugString, String linePrefix) {
/*     */     Operation operation = $this$currentOpToDebugString.getOperation();
/*     */     if (operation.getInts() == 0 && operation.getObjects() == 0) {
/*     */     
/*     */     } else {
/*     */       StringBuilder stringBuilder1 = new StringBuilder(), $this$currentOpToDebugString_u24lambda_u2417 = stringBuilder1;
/*     */       int $i$a$-buildString-Operations$currentOpToDebugString$1 = 0;
/*     */       $this$currentOpToDebugString_u24lambda_u2417.append(operation.getName());
/*     */       $this$currentOpToDebugString_u24lambda_u2417.append('(');
/*     */       boolean isFirstParam = false;
/*     */       isFirstParam = true;
/*     */       String argLinePrefix = indent(linePrefix);
/*     */       int i = operation.getInts();
/*     */       byte b = 0;
/*     */       if (b < i) {
/*     */         int offset = b, $i$a$-repeat-Operations$currentOpToDebugString$1$1 = 0;
/*     */         int param = Operation.IntParameter.constructor-impl(offset);
/*     */         String name = operation.intParamName-w8GmfQM(param);
/*     */         if (!isFirstParam) {
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append(", ");
/*     */         } else {
/*     */           isFirstParam = false;
/*     */         } 
/*     */         Intrinsics.checkNotNullExpressionValue($this$currentOpToDebugString_u24lambda_u2417.append('\n'), "append(...)");
/*     */         $this$currentOpToDebugString_u24lambda_u2417.append('\n');
/*     */         $this$currentOpToDebugString_u24lambda_u2417.append(argLinePrefix);
/*     */         $this$currentOpToDebugString_u24lambda_u2417.append(name);
/*     */         $this$currentOpToDebugString_u24lambda_u2417.append(" = ");
/*     */         $this$currentOpToDebugString_u24lambda_u2417.append($this$currentOpToDebugString.getInt-w8GmfQM(param));
/*     */         b++;
/*     */       } else {
/*     */         i = operation.getObjects();
/*     */         b = 0;
/*     */         if (b < i) {
/*     */           int offset = b, $i$a$-repeat-Operations$currentOpToDebugString$1$2 = 0;
/*     */           int param = Operation.ObjectParameter.constructor-impl(offset);
/*     */           String name = operation.objectParamName-31yXWZQ(param);
/*     */           if (!isFirstParam) {
/*     */             $this$currentOpToDebugString_u24lambda_u2417.append(", ");
/*     */           } else {
/*     */             isFirstParam = false;
/*     */           } 
/*     */           Intrinsics.checkNotNullExpressionValue($this$currentOpToDebugString_u24lambda_u2417.append('\n'), "append(...)");
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append('\n');
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append(argLinePrefix);
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append(name);
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append(" = ");
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append(formatOpArgumentToString($this$currentOpToDebugString.getObject-31yXWZQ(param), argLinePrefix));
/*     */           b++;
/*     */         } else {
/*     */           Intrinsics.checkNotNullExpressionValue($this$currentOpToDebugString_u24lambda_u2417.append('\n'), "append(...)");
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append('\n');
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append(linePrefix);
/*     */           $this$currentOpToDebugString_u24lambda_u2417.append(")");
/*     */           Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   private final String formatOpArgumentToString(Object $this$formatOpArgumentToString, String linePrefix) {
/*     */     Object object = $this$formatOpArgumentToString;
/*     */     return (object == null) ? "null" : ((object instanceof Object[]) ? toCollectionString(ArraysKt.asIterable((Object[])$this$formatOpArgumentToString), linePrefix) : ((object instanceof int[]) ? toCollectionString(ArraysKt.asIterable((int[])$this$formatOpArgumentToString), linePrefix) : ((object instanceof long[]) ? toCollectionString(ArraysKt.asIterable((long[])$this$formatOpArgumentToString), linePrefix) : ((object instanceof float[]) ? toCollectionString(ArraysKt.asIterable((float[])$this$formatOpArgumentToString), linePrefix) : ((object instanceof double[]) ? toCollectionString(ArraysKt.asIterable((double[])$this$formatOpArgumentToString), linePrefix) : ((object instanceof Iterable) ? toCollectionString((Iterable)$this$formatOpArgumentToString, linePrefix) : ((object instanceof OperationsDebugStringFormattable) ? ((OperationsDebugStringFormattable)$this$formatOpArgumentToString).toDebugString(linePrefix) : $this$formatOpArgumentToString.toString())))))));
/*     */   }
/*     */   
/*     */   private final <T> String toCollectionString(Iterable $this$toCollectionString, String linePrefix) {
/*     */     return CollectionsKt.joinToString$default($this$toCollectionString, ", ", "[", "]", 0, null, new Operations$toCollectionString$1(linePrefix), 24, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\r\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"})
/*     */   static final class Operations$toCollectionString$1 extends Lambda implements Function1<T, CharSequence> {
/*     */     @NotNull
/*     */     public final CharSequence invoke(Object it) {
/*     */       return Operations.this.formatOpArgumentToString(it, this.$linePrefix);
/*     */     }
/*     */     
/*     */     Operations$toCollectionString$1(String $linePrefix) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\changelist\Operations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */