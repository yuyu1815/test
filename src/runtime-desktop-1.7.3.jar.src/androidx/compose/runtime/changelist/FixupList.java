/*    */ package androidx.compose.runtime.changelist;
/*    */ 
/*    */ import androidx.compose.runtime.Anchor;
/*    */ import androidx.compose.runtime.Applier;
/*    */ import androidx.compose.runtime.RememberManager;
/*    */ import androidx.compose.runtime.SlotWriter;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\006\020\n\032\0020\013J&\020\f\032\0020\0132\016\020\r\032\n\022\006\022\004\030\0010\0170\0162\006\020\020\032\0020\0072\006\020\021\032\0020\022J\006\020\023\032\0020\013J\"\020\024\032\0020\0132\n\020\025\032\006\022\002\b\0030\0262\006\020\027\032\0020\0302\006\020\031\032\0020\032J\006\020\033\032\0020\034J\006\020\035\032\0020\034J\020\020\036\032\0020\0372\006\020 \032\0020\037H\026J>\020!\032\0020\013\"\004\b\000\020\"\"\004\b\001\020#2\006\020$\032\002H\"2\035\020%\032\031\022\004\022\002H#\022\004\022\002H\"\022\004\022\0020\0130&¢\006\002\b'¢\006\002\020(R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\004X\004¢\006\002\n\000R\021\020\006\032\0020\0078F¢\006\006\032\004\b\b\020\t¨\006)"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "size", "", "getSize", "()I", "clear", "", "createAndInsertNode", "factory", "Lkotlin/Function0;", "", "insertIndex", "groupAnchor", "Landroidx/compose/runtime/Anchor;", "endNodeInsert", "executeAndFlushAllPendingFixups", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "toDebugString", "", "linePrefix", "updateNode", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,91:1\n4553#2,7:92\n4553#2,7:184\n167#3,5:99\n175#3,2:107\n174#3:109\n178#3,25:115\n204#3:141\n167#3,5:142\n175#3,2:149\n174#3:151\n178#3,25:157\n204#3:183\n167#3,5:191\n175#3,2:198\n174#3:200\n178#3,25:206\n204#3:232\n565#4:104\n566#4:105\n567#4:106\n50#5,5:110\n56#5:140\n50#5,5:152\n56#5:182\n50#5,5:201\n56#5:231\n597#6:147\n598#6:148\n435#7:196\n436#7:197\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n46#1:92,7\n71#1:184,7\n58#1:99,5\n58#1:107,2\n58#1:109\n58#1:115,25\n58#1:141\n64#1:142,5\n64#1:149,2\n64#1:151\n64#1:157,25\n64#1:183\n78#1:191,5\n78#1:198,2\n78#1:200\n78#1:206,25\n78#1:232\n59#1:104\n60#1:105\n61#1:106\n58#1:110,5\n58#1:140\n64#1:152,5\n64#1:182\n78#1:201,5\n78#1:231\n65#1:147\n66#1:148\n79#1:196\n80#1:197\n*E\n"})
/*    */ public final class FixupList
/*    */   extends OperationsDebugStringFormattable
/*    */ {
/*    */   @NotNull
/* 29 */   private final Operations operations = new Operations(); @NotNull
/* 30 */   private final Operations pendingOperations = new Operations();
/*    */   public static final int $stable = 8;
/* 32 */   public final int getSize() { return this.operations.getSize(); }
/* 33 */   public final boolean isEmpty() { return this.operations.isEmpty(); } public final boolean isNotEmpty() {
/* 34 */     return this.operations.isNotEmpty();
/*    */   }
/*    */   public final void clear() {
/* 37 */     this.pendingOperations.clear();
/* 38 */     this.operations.clear();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void executeAndFlushAllPendingFixups(@NotNull Applier applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'applier'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'slots'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'rememberManager'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload_0
/*    */     //   19: getfield pendingOperations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   22: invokevirtual isEmpty : ()Z
/*    */     //   25: istore #4
/*    */     //   27: iconst_0
/*    */     //   28: istore #5
/*    */     //   30: nop
/*    */     //   31: iload #4
/*    */     //   33: ifne -> 44
/*    */     //   36: iconst_0
/*    */     //   37: istore #6
/*    */     //   39: ldc 'FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?'
/*    */     //   41: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*    */     //   44: nop
/*    */     //   45: aload_0
/*    */     //   46: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   49: aload_1
/*    */     //   50: aload_2
/*    */     //   51: aload_3
/*    */     //   52: invokevirtual executeAndFlushAllPendingOperations : (Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
/*    */     //   55: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #46	-> 18
/*    */     //   #92	-> 30
/*    */     //   #95	-> 31
/*    */     //   #96	-> 36
/*    */     //   #47	-> 39
/*    */     //   #96	-> 41
/*    */     //   #98	-> 44
/*    */     //   #50	-> 45
/*    */     //   #51	-> 55
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   39	2	6	$i$a$-runtimeCheck-FixupList$executeAndFlushAllPendingFixups$1	I
/*    */     //   30	15	5	$i$f$runtimeCheck	I
/*    */     //   27	18	4	value$iv	Z
/*    */     //   0	56	0	this	Landroidx/compose/runtime/changelist/FixupList;
/*    */     //   0	56	1	applier	Landroidx/compose/runtime/Applier;
/*    */     //   0	56	2	slots	Landroidx/compose/runtime/SlotWriter;
/*    */     //   0	56	3	rememberManager	Landroidx/compose/runtime/RememberManager;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void createAndInsertNode(@NotNull Function0 factory, int insertIndex, @NotNull Anchor groupAnchor) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'factory'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_3
/*    */     //   7: ldc 'groupAnchor'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_0
/*    */     //   13: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   16: astore #4
/*    */     //   18: getstatic androidx/compose/runtime/changelist/Operation$InsertNodeFixup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
/*    */     //   21: checkcast androidx/compose/runtime/changelist/Operation
/*    */     //   24: astore #5
/*    */     //   26: iconst_0
/*    */     //   27: istore #6
/*    */     //   29: nop
/*    */     //   30: aload #4
/*    */     //   32: aload #5
/*    */     //   34: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*    */     //   37: aload #4
/*    */     //   39: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*    */     //   42: astore #7
/*    */     //   44: iconst_0
/*    */     //   45: istore #8
/*    */     //   47: aload #7
/*    */     //   49: getstatic androidx/compose/runtime/changelist/Operation$InsertNodeFixup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
/*    */     //   52: astore #9
/*    */     //   54: iconst_0
/*    */     //   55: istore #10
/*    */     //   57: iconst_0
/*    */     //   58: invokestatic constructor-impl : (I)I
/*    */     //   61: aload_1
/*    */     //   62: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*    */     //   65: aload #7
/*    */     //   67: getstatic androidx/compose/runtime/changelist/Operation$InsertNodeFixup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
/*    */     //   70: astore #9
/*    */     //   72: iconst_0
/*    */     //   73: istore #10
/*    */     //   75: iconst_0
/*    */     //   76: invokestatic constructor-impl : (I)I
/*    */     //   79: iload_2
/*    */     //   80: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*    */     //   83: aload #7
/*    */     //   85: getstatic androidx/compose/runtime/changelist/Operation$InsertNodeFixup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
/*    */     //   88: astore #9
/*    */     //   90: iconst_0
/*    */     //   91: istore #10
/*    */     //   93: iconst_1
/*    */     //   94: invokestatic constructor-impl : (I)I
/*    */     //   97: aload_3
/*    */     //   98: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*    */     //   101: nop
/*    */     //   102: nop
/*    */     //   103: aload #4
/*    */     //   105: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   108: aload #4
/*    */     //   110: aload #5
/*    */     //   112: invokevirtual getInts : ()I
/*    */     //   115: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*    */     //   118: if_icmpne -> 143
/*    */     //   121: aload #4
/*    */     //   123: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   126: aload #4
/*    */     //   128: aload #5
/*    */     //   130: invokevirtual getObjects : ()I
/*    */     //   133: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*    */     //   136: if_icmpne -> 143
/*    */     //   139: iconst_1
/*    */     //   140: goto -> 144
/*    */     //   143: iconst_0
/*    */     //   144: istore #11
/*    */     //   146: nop
/*    */     //   147: iconst_0
/*    */     //   148: istore #12
/*    */     //   150: nop
/*    */     //   151: iload #11
/*    */     //   153: ifne -> 451
/*    */     //   156: iconst_0
/*    */     //   157: istore #13
/*    */     //   159: iconst_0
/*    */     //   160: istore #14
/*    */     //   162: new java/lang/StringBuilder
/*    */     //   165: dup
/*    */     //   166: invokespecial <init> : ()V
/*    */     //   169: astore #15
/*    */     //   171: aload #15
/*    */     //   173: astore #16
/*    */     //   175: iconst_0
/*    */     //   176: istore #17
/*    */     //   178: aload #5
/*    */     //   180: invokevirtual getInts : ()I
/*    */     //   183: istore #18
/*    */     //   185: iconst_0
/*    */     //   186: istore #19
/*    */     //   188: iload #19
/*    */     //   190: iload #18
/*    */     //   192: if_icmpge -> 257
/*    */     //   195: iload #19
/*    */     //   197: istore #20
/*    */     //   199: iconst_0
/*    */     //   200: istore #21
/*    */     //   202: iconst_1
/*    */     //   203: iload #20
/*    */     //   205: ishl
/*    */     //   206: aload #4
/*    */     //   208: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   211: iand
/*    */     //   212: ifeq -> 250
/*    */     //   215: iload #14
/*    */     //   217: ifle -> 228
/*    */     //   220: aload #16
/*    */     //   222: ldc ', '
/*    */     //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   227: pop
/*    */     //   228: aload #16
/*    */     //   230: aload #5
/*    */     //   232: iload #20
/*    */     //   234: invokestatic constructor-impl : (I)I
/*    */     //   237: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*    */     //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   243: pop
/*    */     //   244: iload #14
/*    */     //   246: iconst_1
/*    */     //   247: iadd
/*    */     //   248: istore #14
/*    */     //   250: nop
/*    */     //   251: iinc #19, 1
/*    */     //   254: goto -> 188
/*    */     //   257: nop
/*    */     //   258: aload #15
/*    */     //   260: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   263: dup
/*    */     //   264: ldc 'toString(...)'
/*    */     //   266: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   269: astore #23
/*    */     //   271: iconst_0
/*    */     //   272: istore #15
/*    */     //   274: new java/lang/StringBuilder
/*    */     //   277: dup
/*    */     //   278: invokespecial <init> : ()V
/*    */     //   281: astore #17
/*    */     //   283: aload #17
/*    */     //   285: astore #18
/*    */     //   287: iconst_0
/*    */     //   288: istore #19
/*    */     //   290: aload #5
/*    */     //   292: invokevirtual getObjects : ()I
/*    */     //   295: istore #20
/*    */     //   297: iconst_0
/*    */     //   298: istore #21
/*    */     //   300: iload #21
/*    */     //   302: iload #20
/*    */     //   304: if_icmpge -> 369
/*    */     //   307: iload #21
/*    */     //   309: istore #22
/*    */     //   311: iconst_0
/*    */     //   312: istore #24
/*    */     //   314: iconst_1
/*    */     //   315: iload #22
/*    */     //   317: ishl
/*    */     //   318: aload #4
/*    */     //   320: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   323: iand
/*    */     //   324: ifeq -> 362
/*    */     //   327: iload #14
/*    */     //   329: ifle -> 340
/*    */     //   332: aload #18
/*    */     //   334: ldc ', '
/*    */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   339: pop
/*    */     //   340: aload #18
/*    */     //   342: aload #5
/*    */     //   344: iload #22
/*    */     //   346: invokestatic constructor-impl : (I)I
/*    */     //   349: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*    */     //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   355: pop
/*    */     //   356: iload #15
/*    */     //   358: iconst_1
/*    */     //   359: iadd
/*    */     //   360: istore #15
/*    */     //   362: nop
/*    */     //   363: iinc #21, 1
/*    */     //   366: goto -> 300
/*    */     //   369: nop
/*    */     //   370: aload #17
/*    */     //   372: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   375: dup
/*    */     //   376: ldc 'toString(...)'
/*    */     //   378: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   381: astore #16
/*    */     //   383: new java/lang/StringBuilder
/*    */     //   386: dup
/*    */     //   387: invokespecial <init> : ()V
/*    */     //   390: ldc 'Error while pushing '
/*    */     //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   395: aload #5
/*    */     //   397: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   400: ldc '. Not all arguments were provided. Missing '
/*    */     //   402: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   405: iload #14
/*    */     //   407: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   410: ldc ' int arguments ('
/*    */     //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   415: aload #23
/*    */     //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   420: ldc ') and '
/*    */     //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   425: iload #15
/*    */     //   427: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   430: ldc ' object arguments ('
/*    */     //   432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   435: aload #16
/*    */     //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   440: ldc ').'
/*    */     //   442: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   445: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   448: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*    */     //   451: nop
/*    */     //   452: nop
/*    */     //   453: aload_0
/*    */     //   454: getfield pendingOperations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   457: astore #4
/*    */     //   459: getstatic androidx/compose/runtime/changelist/Operation$PostInsertNodeFixup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
/*    */     //   462: checkcast androidx/compose/runtime/changelist/Operation
/*    */     //   465: astore #5
/*    */     //   467: iconst_0
/*    */     //   468: istore #6
/*    */     //   470: nop
/*    */     //   471: aload #4
/*    */     //   473: aload #5
/*    */     //   475: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*    */     //   478: aload #4
/*    */     //   480: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*    */     //   483: astore #7
/*    */     //   485: iconst_0
/*    */     //   486: istore #8
/*    */     //   488: aload #7
/*    */     //   490: getstatic androidx/compose/runtime/changelist/Operation$PostInsertNodeFixup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
/*    */     //   493: astore #9
/*    */     //   495: iconst_0
/*    */     //   496: istore #10
/*    */     //   498: iconst_0
/*    */     //   499: invokestatic constructor-impl : (I)I
/*    */     //   502: iload_2
/*    */     //   503: invokestatic setInt-A6tL2VI : (Landroidx/compose/runtime/changelist/Operations;II)V
/*    */     //   506: aload #7
/*    */     //   508: getstatic androidx/compose/runtime/changelist/Operation$PostInsertNodeFixup.INSTANCE : Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
/*    */     //   511: astore #9
/*    */     //   513: iconst_0
/*    */     //   514: istore #10
/*    */     //   516: iconst_0
/*    */     //   517: invokestatic constructor-impl : (I)I
/*    */     //   520: aload_3
/*    */     //   521: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*    */     //   524: nop
/*    */     //   525: nop
/*    */     //   526: aload #4
/*    */     //   528: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   531: aload #4
/*    */     //   533: aload #5
/*    */     //   535: invokevirtual getInts : ()I
/*    */     //   538: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*    */     //   541: if_icmpne -> 566
/*    */     //   544: aload #4
/*    */     //   546: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   549: aload #4
/*    */     //   551: aload #5
/*    */     //   553: invokevirtual getObjects : ()I
/*    */     //   556: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*    */     //   559: if_icmpne -> 566
/*    */     //   562: iconst_1
/*    */     //   563: goto -> 567
/*    */     //   566: iconst_0
/*    */     //   567: istore #11
/*    */     //   569: nop
/*    */     //   570: iconst_0
/*    */     //   571: istore #12
/*    */     //   573: nop
/*    */     //   574: iload #11
/*    */     //   576: ifne -> 874
/*    */     //   579: iconst_0
/*    */     //   580: istore #13
/*    */     //   582: iconst_0
/*    */     //   583: istore #14
/*    */     //   585: new java/lang/StringBuilder
/*    */     //   588: dup
/*    */     //   589: invokespecial <init> : ()V
/*    */     //   592: astore #15
/*    */     //   594: aload #15
/*    */     //   596: astore #16
/*    */     //   598: iconst_0
/*    */     //   599: istore #17
/*    */     //   601: aload #5
/*    */     //   603: invokevirtual getInts : ()I
/*    */     //   606: istore #18
/*    */     //   608: iconst_0
/*    */     //   609: istore #19
/*    */     //   611: iload #19
/*    */     //   613: iload #18
/*    */     //   615: if_icmpge -> 680
/*    */     //   618: iload #19
/*    */     //   620: istore #20
/*    */     //   622: iconst_0
/*    */     //   623: istore #21
/*    */     //   625: iconst_1
/*    */     //   626: iload #20
/*    */     //   628: ishl
/*    */     //   629: aload #4
/*    */     //   631: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   634: iand
/*    */     //   635: ifeq -> 673
/*    */     //   638: iload #14
/*    */     //   640: ifle -> 651
/*    */     //   643: aload #16
/*    */     //   645: ldc ', '
/*    */     //   647: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   650: pop
/*    */     //   651: aload #16
/*    */     //   653: aload #5
/*    */     //   655: iload #20
/*    */     //   657: invokestatic constructor-impl : (I)I
/*    */     //   660: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*    */     //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   666: pop
/*    */     //   667: iload #14
/*    */     //   669: iconst_1
/*    */     //   670: iadd
/*    */     //   671: istore #14
/*    */     //   673: nop
/*    */     //   674: iinc #19, 1
/*    */     //   677: goto -> 611
/*    */     //   680: nop
/*    */     //   681: aload #15
/*    */     //   683: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   686: dup
/*    */     //   687: ldc 'toString(...)'
/*    */     //   689: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   692: astore #23
/*    */     //   694: iconst_0
/*    */     //   695: istore #15
/*    */     //   697: new java/lang/StringBuilder
/*    */     //   700: dup
/*    */     //   701: invokespecial <init> : ()V
/*    */     //   704: astore #17
/*    */     //   706: aload #17
/*    */     //   708: astore #18
/*    */     //   710: iconst_0
/*    */     //   711: istore #19
/*    */     //   713: aload #5
/*    */     //   715: invokevirtual getObjects : ()I
/*    */     //   718: istore #20
/*    */     //   720: iconst_0
/*    */     //   721: istore #21
/*    */     //   723: iload #21
/*    */     //   725: iload #20
/*    */     //   727: if_icmpge -> 792
/*    */     //   730: iload #21
/*    */     //   732: istore #22
/*    */     //   734: iconst_0
/*    */     //   735: istore #24
/*    */     //   737: iconst_1
/*    */     //   738: iload #22
/*    */     //   740: ishl
/*    */     //   741: aload #4
/*    */     //   743: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   746: iand
/*    */     //   747: ifeq -> 785
/*    */     //   750: iload #14
/*    */     //   752: ifle -> 763
/*    */     //   755: aload #18
/*    */     //   757: ldc ', '
/*    */     //   759: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   762: pop
/*    */     //   763: aload #18
/*    */     //   765: aload #5
/*    */     //   767: iload #22
/*    */     //   769: invokestatic constructor-impl : (I)I
/*    */     //   772: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*    */     //   775: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   778: pop
/*    */     //   779: iload #15
/*    */     //   781: iconst_1
/*    */     //   782: iadd
/*    */     //   783: istore #15
/*    */     //   785: nop
/*    */     //   786: iinc #21, 1
/*    */     //   789: goto -> 723
/*    */     //   792: nop
/*    */     //   793: aload #17
/*    */     //   795: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   798: dup
/*    */     //   799: ldc 'toString(...)'
/*    */     //   801: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   804: astore #16
/*    */     //   806: new java/lang/StringBuilder
/*    */     //   809: dup
/*    */     //   810: invokespecial <init> : ()V
/*    */     //   813: ldc 'Error while pushing '
/*    */     //   815: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   818: aload #5
/*    */     //   820: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   823: ldc '. Not all arguments were provided. Missing '
/*    */     //   825: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   828: iload #14
/*    */     //   830: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   833: ldc ' int arguments ('
/*    */     //   835: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   838: aload #23
/*    */     //   840: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   843: ldc ') and '
/*    */     //   845: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   848: iload #15
/*    */     //   850: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   853: ldc ' object arguments ('
/*    */     //   855: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   858: aload #16
/*    */     //   860: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   863: ldc ').'
/*    */     //   865: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   868: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   871: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*    */     //   874: nop
/*    */     //   875: nop
/*    */     //   876: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #58	-> 12
/*    */     //   #99	-> 29
/*    */     //   #102	-> 30
/*    */     //   #103	-> 37
/*    */     //   #59	-> 47
/*    */     //   #104	-> 57
/*    */     //   #59	-> 61
/*    */     //   #60	-> 65
/*    */     //   #105	-> 75
/*    */     //   #60	-> 79
/*    */     //   #61	-> 83
/*    */     //   #106	-> 93
/*    */     //   #61	-> 97
/*    */     //   #62	-> 101
/*    */     //   #103	-> 102
/*    */     //   #107	-> 103
/*    */     //   #108	-> 121
/*    */     //   #109	-> 146
/*    */     //   #110	-> 150
/*    */     //   #113	-> 151
/*    */     //   #114	-> 156
/*    */     //   #115	-> 159
/*    */     //   #116	-> 162
/*    */     //   #117	-> 178
/*    */     //   #118	-> 202
/*    */     //   #119	-> 215
/*    */     //   #120	-> 228
/*    */     //   #121	-> 244
/*    */     //   #123	-> 250
/*    */     //   #117	-> 251
/*    */     //   #124	-> 257
/*    */     //   #116	-> 258
/*    */     //   #116	-> 269
/*    */     //   #126	-> 271
/*    */     //   #127	-> 274
/*    */     //   #128	-> 290
/*    */     //   #129	-> 314
/*    */     //   #130	-> 327
/*    */     //   #131	-> 340
/*    */     //   #132	-> 356
/*    */     //   #134	-> 362
/*    */     //   #128	-> 363
/*    */     //   #135	-> 369
/*    */     //   #127	-> 370
/*    */     //   #127	-> 381
/*    */     //   #137	-> 383
/*    */     //   #138	-> 405
/*    */     //   #137	-> 407
/*    */     //   #138	-> 410
/*    */     //   #137	-> 412
/*    */     //   #138	-> 415
/*    */     //   #137	-> 417
/*    */     //   #138	-> 420
/*    */     //   #137	-> 422
/*    */     //   #139	-> 425
/*    */     //   #137	-> 427
/*    */     //   #139	-> 430
/*    */     //   #137	-> 432
/*    */     //   #139	-> 435
/*    */     //   #137	-> 437
/*    */     //   #139	-> 440
/*    */     //   #137	-> 442
/*    */     //   #114	-> 448
/*    */     //   #140	-> 451
/*    */     //   #141	-> 452
/*    */     //   #64	-> 453
/*    */     //   #142	-> 470
/*    */     //   #145	-> 471
/*    */     //   #146	-> 478
/*    */     //   #65	-> 488
/*    */     //   #147	-> 498
/*    */     //   #65	-> 502
/*    */     //   #66	-> 506
/*    */     //   #148	-> 516
/*    */     //   #66	-> 520
/*    */     //   #67	-> 524
/*    */     //   #146	-> 525
/*    */     //   #149	-> 526
/*    */     //   #150	-> 544
/*    */     //   #151	-> 569
/*    */     //   #152	-> 573
/*    */     //   #155	-> 574
/*    */     //   #156	-> 579
/*    */     //   #157	-> 582
/*    */     //   #158	-> 585
/*    */     //   #159	-> 601
/*    */     //   #160	-> 625
/*    */     //   #161	-> 638
/*    */     //   #162	-> 651
/*    */     //   #163	-> 667
/*    */     //   #165	-> 673
/*    */     //   #159	-> 674
/*    */     //   #166	-> 680
/*    */     //   #158	-> 681
/*    */     //   #158	-> 692
/*    */     //   #168	-> 694
/*    */     //   #169	-> 697
/*    */     //   #170	-> 713
/*    */     //   #171	-> 737
/*    */     //   #172	-> 750
/*    */     //   #173	-> 763
/*    */     //   #174	-> 779
/*    */     //   #176	-> 785
/*    */     //   #170	-> 786
/*    */     //   #177	-> 792
/*    */     //   #169	-> 793
/*    */     //   #169	-> 804
/*    */     //   #179	-> 806
/*    */     //   #180	-> 828
/*    */     //   #179	-> 830
/*    */     //   #180	-> 833
/*    */     //   #179	-> 835
/*    */     //   #180	-> 838
/*    */     //   #179	-> 840
/*    */     //   #180	-> 843
/*    */     //   #179	-> 845
/*    */     //   #181	-> 848
/*    */     //   #179	-> 850
/*    */     //   #181	-> 853
/*    */     //   #179	-> 855
/*    */     //   #181	-> 858
/*    */     //   #179	-> 860
/*    */     //   #181	-> 863
/*    */     //   #179	-> 865
/*    */     //   #156	-> 871
/*    */     //   #182	-> 874
/*    */     //   #183	-> 875
/*    */     //   #68	-> 876
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   57	4	10	$i$f$getFactory-HpuvwBQ	I
/*    */     //   54	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
/*    */     //   75	4	10	$i$f$getInsertIndex-jn0FJLE	I
/*    */     //   72	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
/*    */     //   93	4	10	$i$f$getGroupAnchor-HpuvwBQ	I
/*    */     //   90	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
/*    */     //   47	55	8	$i$a$-push-FixupList$createAndInsertNode$1	I
/*    */     //   44	58	7	$this$createAndInsertNode_u24lambda_u241	Landroidx/compose/runtime/changelist/Operations;
/*    */     //   202	49	21	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*    */     //   199	52	20	arg$iv	I
/*    */     //   178	80	17	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*    */     //   175	83	16	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*    */     //   314	49	24	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*    */     //   311	52	22	arg$iv	I
/*    */     //   290	80	19	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*    */     //   287	83	18	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*    */     //   159	289	13	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*    */     //   162	286	14	missingIntCount$iv	I
/*    */     //   271	177	23	missingInts$iv	Ljava/lang/String;
/*    */     //   274	174	15	missingObjectCount$iv	I
/*    */     //   383	65	16	missingObjects$iv	Ljava/lang/String;
/*    */     //   150	302	12	$i$f$checkPrecondition	I
/*    */     //   147	305	11	value$iv$iv	Z
/*    */     //   29	424	6	$i$f$push	I
/*    */     //   26	427	4	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*    */     //   26	427	5	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*    */     //   498	4	10	$i$f$getInsertIndex-jn0FJLE	I
/*    */     //   495	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
/*    */     //   516	4	10	$i$f$getGroupAnchor-HpuvwBQ	I
/*    */     //   513	7	9	this_$iv	Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
/*    */     //   488	37	8	$i$a$-push-FixupList$createAndInsertNode$2	I
/*    */     //   485	40	7	$this$createAndInsertNode_u24lambda_u242	Landroidx/compose/runtime/changelist/Operations;
/*    */     //   625	49	21	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*    */     //   622	52	20	arg$iv	I
/*    */     //   601	80	17	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*    */     //   598	83	16	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*    */     //   737	49	24	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*    */     //   734	52	22	arg$iv	I
/*    */     //   713	80	19	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*    */     //   710	83	18	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*    */     //   582	289	13	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*    */     //   585	286	14	missingIntCount$iv	I
/*    */     //   694	177	23	missingInts$iv	Ljava/lang/String;
/*    */     //   697	174	15	missingObjectCount$iv	I
/*    */     //   806	65	16	missingObjects$iv	Ljava/lang/String;
/*    */     //   573	302	12	$i$f$checkPrecondition	I
/*    */     //   570	305	11	value$iv$iv	Z
/*    */     //   470	406	6	$i$f$push	I
/*    */     //   467	409	4	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*    */     //   467	409	5	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*    */     //   0	877	0	this	Landroidx/compose/runtime/changelist/FixupList;
/*    */     //   0	877	1	factory	Lkotlin/jvm/functions/Function0;
/*    */     //   0	877	2	insertIndex	I
/*    */     //   0	877	3	groupAnchor	Landroidx/compose/runtime/Anchor;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void endNodeInsert() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield pendingOperations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   4: invokevirtual isNotEmpty : ()Z
/*    */     //   7: istore_1
/*    */     //   8: iconst_0
/*    */     //   9: istore_2
/*    */     //   10: nop
/*    */     //   11: iload_1
/*    */     //   12: ifne -> 22
/*    */     //   15: iconst_0
/*    */     //   16: istore_3
/*    */     //   17: ldc 'Cannot end node insertion, there are no pending operations that can be realized.'
/*    */     //   19: invokestatic composeImmediateRuntimeError : (Ljava/lang/String;)V
/*    */     //   22: nop
/*    */     //   23: aload_0
/*    */     //   24: getfield pendingOperations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   27: aload_0
/*    */     //   28: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   31: invokevirtual popInto : (Landroidx/compose/runtime/changelist/Operations;)V
/*    */     //   34: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #71	-> 0
/*    */     //   #184	-> 10
/*    */     //   #187	-> 11
/*    */     //   #188	-> 15
/*    */     //   #72	-> 17
/*    */     //   #188	-> 19
/*    */     //   #190	-> 22
/*    */     //   #74	-> 23
/*    */     //   #75	-> 34
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	2	3	$i$a$-runtimeCheck-FixupList$endNodeInsert$1	I
/*    */     //   10	13	2	$i$f$runtimeCheck	I
/*    */     //   8	15	1	value$iv	Z
/*    */     //   0	35	0	this	Landroidx/compose/runtime/changelist/FixupList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final <V, T> void updateNode(Object value, @NotNull Function2 block) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc 'block'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield operations : Landroidx/compose/runtime/changelist/Operations;
/*    */     //   10: astore_3
/*    */     //   11: getstatic androidx/compose/runtime/changelist/Operation$UpdateNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*    */     //   14: checkcast androidx/compose/runtime/changelist/Operation
/*    */     //   17: astore #4
/*    */     //   19: iconst_0
/*    */     //   20: istore #5
/*    */     //   22: nop
/*    */     //   23: aload_3
/*    */     //   24: aload #4
/*    */     //   26: invokevirtual pushOp : (Landroidx/compose/runtime/changelist/Operation;)V
/*    */     //   29: aload_3
/*    */     //   30: invokestatic constructor-impl : (Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
/*    */     //   33: astore #6
/*    */     //   35: iconst_0
/*    */     //   36: istore #7
/*    */     //   38: aload #6
/*    */     //   40: getstatic androidx/compose/runtime/changelist/Operation$UpdateNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*    */     //   43: astore #8
/*    */     //   45: iconst_0
/*    */     //   46: istore #9
/*    */     //   48: iconst_0
/*    */     //   49: invokestatic constructor-impl : (I)I
/*    */     //   52: aload_1
/*    */     //   53: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*    */     //   56: aload #6
/*    */     //   58: getstatic androidx/compose/runtime/changelist/Operation$UpdateNode.INSTANCE : Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*    */     //   61: astore #8
/*    */     //   63: iconst_0
/*    */     //   64: istore #9
/*    */     //   66: iconst_1
/*    */     //   67: invokestatic constructor-impl : (I)I
/*    */     //   70: aload_2
/*    */     //   71: iconst_2
/*    */     //   72: invokestatic beforeCheckcastToFunctionOfArity : (Ljava/lang/Object;I)Ljava/lang/Object;
/*    */     //   75: checkcast kotlin/jvm/functions/Function2
/*    */     //   78: invokestatic setObject-DKhxnng : (Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
/*    */     //   81: nop
/*    */     //   82: nop
/*    */     //   83: aload_3
/*    */     //   84: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   87: aload_3
/*    */     //   88: aload #4
/*    */     //   90: invokevirtual getInts : ()I
/*    */     //   93: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*    */     //   96: if_icmpne -> 119
/*    */     //   99: aload_3
/*    */     //   100: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   103: aload_3
/*    */     //   104: aload #4
/*    */     //   106: invokevirtual getObjects : ()I
/*    */     //   109: invokestatic access$createExpectedArgMask : (Landroidx/compose/runtime/changelist/Operations;I)I
/*    */     //   112: if_icmpne -> 119
/*    */     //   115: iconst_1
/*    */     //   116: goto -> 120
/*    */     //   119: iconst_0
/*    */     //   120: istore #10
/*    */     //   122: nop
/*    */     //   123: iconst_0
/*    */     //   124: istore #11
/*    */     //   126: nop
/*    */     //   127: iload #10
/*    */     //   129: ifne -> 425
/*    */     //   132: iconst_0
/*    */     //   133: istore #12
/*    */     //   135: iconst_0
/*    */     //   136: istore #13
/*    */     //   138: new java/lang/StringBuilder
/*    */     //   141: dup
/*    */     //   142: invokespecial <init> : ()V
/*    */     //   145: astore #14
/*    */     //   147: aload #14
/*    */     //   149: astore #15
/*    */     //   151: iconst_0
/*    */     //   152: istore #16
/*    */     //   154: aload #4
/*    */     //   156: invokevirtual getInts : ()I
/*    */     //   159: istore #17
/*    */     //   161: iconst_0
/*    */     //   162: istore #18
/*    */     //   164: iload #18
/*    */     //   166: iload #17
/*    */     //   168: if_icmpge -> 232
/*    */     //   171: iload #18
/*    */     //   173: istore #19
/*    */     //   175: iconst_0
/*    */     //   176: istore #20
/*    */     //   178: iconst_1
/*    */     //   179: iload #19
/*    */     //   181: ishl
/*    */     //   182: aload_3
/*    */     //   183: invokestatic access$getPushedIntMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   186: iand
/*    */     //   187: ifeq -> 225
/*    */     //   190: iload #13
/*    */     //   192: ifle -> 203
/*    */     //   195: aload #15
/*    */     //   197: ldc ', '
/*    */     //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   202: pop
/*    */     //   203: aload #15
/*    */     //   205: aload #4
/*    */     //   207: iload #19
/*    */     //   209: invokestatic constructor-impl : (I)I
/*    */     //   212: invokevirtual intParamName-w8GmfQM : (I)Ljava/lang/String;
/*    */     //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   218: pop
/*    */     //   219: iload #13
/*    */     //   221: iconst_1
/*    */     //   222: iadd
/*    */     //   223: istore #13
/*    */     //   225: nop
/*    */     //   226: iinc #18, 1
/*    */     //   229: goto -> 164
/*    */     //   232: nop
/*    */     //   233: aload #14
/*    */     //   235: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   238: dup
/*    */     //   239: ldc 'toString(...)'
/*    */     //   241: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   244: astore #22
/*    */     //   246: iconst_0
/*    */     //   247: istore #14
/*    */     //   249: new java/lang/StringBuilder
/*    */     //   252: dup
/*    */     //   253: invokespecial <init> : ()V
/*    */     //   256: astore #16
/*    */     //   258: aload #16
/*    */     //   260: astore #17
/*    */     //   262: iconst_0
/*    */     //   263: istore #18
/*    */     //   265: aload #4
/*    */     //   267: invokevirtual getObjects : ()I
/*    */     //   270: istore #19
/*    */     //   272: iconst_0
/*    */     //   273: istore #20
/*    */     //   275: iload #20
/*    */     //   277: iload #19
/*    */     //   279: if_icmpge -> 343
/*    */     //   282: iload #20
/*    */     //   284: istore #21
/*    */     //   286: iconst_0
/*    */     //   287: istore #23
/*    */     //   289: iconst_1
/*    */     //   290: iload #21
/*    */     //   292: ishl
/*    */     //   293: aload_3
/*    */     //   294: invokestatic access$getPushedObjectMask$p : (Landroidx/compose/runtime/changelist/Operations;)I
/*    */     //   297: iand
/*    */     //   298: ifeq -> 336
/*    */     //   301: iload #13
/*    */     //   303: ifle -> 314
/*    */     //   306: aload #17
/*    */     //   308: ldc ', '
/*    */     //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   313: pop
/*    */     //   314: aload #17
/*    */     //   316: aload #4
/*    */     //   318: iload #21
/*    */     //   320: invokestatic constructor-impl : (I)I
/*    */     //   323: invokevirtual objectParamName-31yXWZQ : (I)Ljava/lang/String;
/*    */     //   326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   329: pop
/*    */     //   330: iload #14
/*    */     //   332: iconst_1
/*    */     //   333: iadd
/*    */     //   334: istore #14
/*    */     //   336: nop
/*    */     //   337: iinc #20, 1
/*    */     //   340: goto -> 275
/*    */     //   343: nop
/*    */     //   344: aload #16
/*    */     //   346: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   349: dup
/*    */     //   350: ldc 'toString(...)'
/*    */     //   352: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   355: astore #15
/*    */     //   357: new java/lang/StringBuilder
/*    */     //   360: dup
/*    */     //   361: invokespecial <init> : ()V
/*    */     //   364: ldc 'Error while pushing '
/*    */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   369: aload #4
/*    */     //   371: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   374: ldc '. Not all arguments were provided. Missing '
/*    */     //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   379: iload #13
/*    */     //   381: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   384: ldc ' int arguments ('
/*    */     //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   389: aload #22
/*    */     //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   394: ldc ') and '
/*    */     //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   399: iload #14
/*    */     //   401: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   404: ldc ' object arguments ('
/*    */     //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   409: aload #15
/*    */     //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   414: ldc ').'
/*    */     //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   419: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   422: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*    */     //   425: nop
/*    */     //   426: nop
/*    */     //   427: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #78	-> 6
/*    */     //   #191	-> 22
/*    */     //   #194	-> 23
/*    */     //   #195	-> 29
/*    */     //   #79	-> 38
/*    */     //   #196	-> 48
/*    */     //   #79	-> 52
/*    */     //   #80	-> 56
/*    */     //   #197	-> 66
/*    */     //   #80	-> 70
/*    */     //   #81	-> 81
/*    */     //   #195	-> 82
/*    */     //   #198	-> 83
/*    */     //   #199	-> 99
/*    */     //   #200	-> 122
/*    */     //   #201	-> 126
/*    */     //   #204	-> 127
/*    */     //   #205	-> 132
/*    */     //   #206	-> 135
/*    */     //   #207	-> 138
/*    */     //   #208	-> 154
/*    */     //   #209	-> 178
/*    */     //   #210	-> 190
/*    */     //   #211	-> 203
/*    */     //   #212	-> 219
/*    */     //   #214	-> 225
/*    */     //   #208	-> 226
/*    */     //   #215	-> 232
/*    */     //   #207	-> 233
/*    */     //   #207	-> 244
/*    */     //   #217	-> 246
/*    */     //   #218	-> 249
/*    */     //   #219	-> 265
/*    */     //   #220	-> 289
/*    */     //   #221	-> 301
/*    */     //   #222	-> 314
/*    */     //   #223	-> 330
/*    */     //   #225	-> 336
/*    */     //   #219	-> 337
/*    */     //   #226	-> 343
/*    */     //   #218	-> 344
/*    */     //   #218	-> 355
/*    */     //   #228	-> 357
/*    */     //   #229	-> 379
/*    */     //   #228	-> 381
/*    */     //   #229	-> 384
/*    */     //   #228	-> 386
/*    */     //   #229	-> 389
/*    */     //   #228	-> 391
/*    */     //   #229	-> 394
/*    */     //   #228	-> 396
/*    */     //   #230	-> 399
/*    */     //   #228	-> 401
/*    */     //   #230	-> 404
/*    */     //   #228	-> 406
/*    */     //   #230	-> 409
/*    */     //   #228	-> 411
/*    */     //   #230	-> 414
/*    */     //   #228	-> 416
/*    */     //   #205	-> 422
/*    */     //   #231	-> 425
/*    */     //   #232	-> 426
/*    */     //   #82	-> 427
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   48	4	9	$i$f$getValue-HpuvwBQ	I
/*    */     //   45	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*    */     //   66	4	9	$i$f$getBlock-HpuvwBQ	I
/*    */     //   63	7	8	this_$iv	Landroidx/compose/runtime/changelist/Operation$UpdateNode;
/*    */     //   38	44	7	$i$a$-push-FixupList$updateNode$1	I
/*    */     //   35	47	6	$this$updateNode_u24lambda_u244	Landroidx/compose/runtime/changelist/Operations;
/*    */     //   178	48	20	$i$a$-repeat-Operations$push$3$missingInts$1$1$iv	I
/*    */     //   175	51	19	arg$iv	I
/*    */     //   154	79	16	$i$a$-buildString-Operations$push$3$missingInts$1$iv	I
/*    */     //   151	82	15	$this$push_u24lambda_u246_u24lambda_u243$iv	Ljava/lang/StringBuilder;
/*    */     //   289	48	23	$i$a$-repeat-Operations$push$3$missingObjects$1$1$iv	I
/*    */     //   286	51	21	arg$iv	I
/*    */     //   265	79	18	$i$a$-buildString-Operations$push$3$missingObjects$1$iv	I
/*    */     //   262	82	17	$this$push_u24lambda_u246_u24lambda_u245$iv	Ljava/lang/StringBuilder;
/*    */     //   135	287	12	$i$a$-checkPrecondition-Operations$push$3$iv	I
/*    */     //   138	284	13	missingIntCount$iv	I
/*    */     //   246	176	22	missingInts$iv	Ljava/lang/String;
/*    */     //   249	173	14	missingObjectCount$iv	I
/*    */     //   357	65	15	missingObjects$iv	Ljava/lang/String;
/*    */     //   126	300	11	$i$f$checkPrecondition	I
/*    */     //   123	303	10	value$iv$iv	Z
/*    */     //   22	405	5	$i$f$push	I
/*    */     //   19	408	3	this_$iv	Landroidx/compose/runtime/changelist/Operations;
/*    */     //   19	408	4	operation$iv	Landroidx/compose/runtime/changelist/Operation;
/*    */     //   0	428	0	this	Landroidx/compose/runtime/changelist/FixupList;
/*    */     //   0	428	1	value	Ljava/lang/Object;
/*    */     //   0	428	2	block	Lkotlin/jvm/functions/Function2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String toDebugString(@NotNull String linePrefix) {
/* 85 */     Intrinsics.checkNotNullParameter(linePrefix, "linePrefix"); StringBuilder stringBuilder1 = new StringBuilder(), $this$toDebugString_u24lambda_u245 = stringBuilder1; int $i$a$-buildString-FixupList$toDebugString$1 = 0;
/* 86 */     $this$toDebugString_u24lambda_u245.append("FixupList instance containing " + getSize() + " operations");
/* 87 */     if (($this$toDebugString_u24lambda_u245.length() > 0)) $this$toDebugString_u24lambda_u245.append(":\n" + this.operations.toDebugString(linePrefix)); 
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\changelist\FixupList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */