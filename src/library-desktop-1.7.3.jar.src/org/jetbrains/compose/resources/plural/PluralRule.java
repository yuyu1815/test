/*     */ package org.jetbrains.compose.resources.plural;
/*     */ 
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.IntRange;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\b\n\002\b\002\b\000\030\0002\0020\001:\001\017B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B\027\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\007¢\006\002\020\bJ\016\020\013\032\0020\f2\006\020\r\032\0020\016R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\016\020\004\032\0020\007X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule;", "", "category", "Lorg/jetbrains/compose/resources/plural/PluralCategory;", "condition", "", "(Lorg/jetbrains/compose/resources/plural/PluralCategory;Ljava/lang/String;)V", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "(Lorg/jetbrains/compose/resources/plural/PluralCategory;Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;)V", "getCategory", "()Lorg/jetbrains/compose/resources/plural/PluralCategory;", "appliesTo", "", "n", "", "Condition", "library"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class PluralRule {
/*     */   @NotNull
/*     */   private final PluralCategory category;
/*     */   
/*  13 */   private PluralRule(PluralCategory category, Condition condition) { this.category = category; this.condition = condition; } @NotNull private final Condition condition; public static final int $stable; @NotNull public final PluralCategory getCategory() { return this.category; }
/*     */    public PluralRule(@NotNull PluralCategory category, @NotNull String condition) {
/*  15 */     this(category, Condition.Companion.parse(condition));
/*     */   }
/*     */   public final boolean appliesTo(int n) {
/*  18 */     return this.condition.isFulfilled(n);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\t\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b2\030\000 \0132\0020\001:\b\n\013\f\r\016\017\020\021B\007\b\004¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\000H&J\020\020\006\032\0020\0042\006\020\007\032\0020\bH&J\b\020\t\032\0020\000H&\001\005\022\023\024\025\026¨\006\027"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "", "()V", "equivalentForInteger", "", "other", "isFulfilled", "n", "", "simplifyForInteger", "And", "Companion", "False", "Operand", "Or", "Parser", "Relation", "True", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$And;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$False;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Or;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Relation;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$True;", "library"})
/*     */   private static abstract class Condition { @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     
/*     */     private Condition() {}
/*     */     
/*     */     public abstract boolean isFulfilled(int param1Int);
/*     */     
/*     */     @NotNull
/*     */     public abstract Condition simplifyForInteger();
/*     */     
/*     */     public abstract boolean equivalentForInteger(@NotNull Condition param1Condition);
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\t¨\006\n"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;", "", "(Ljava/lang/String;I)V", "N", "I", "V", "W", "F", "T", "C", "library"})
/*  35 */     public enum Operand { N,
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  40 */       I,
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  45 */       V,
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  50 */       W,
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  55 */       F,
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  60 */       T,
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  65 */       C; @NotNull
/*     */       public static EnumEntries<Operand> getEntries() { return $ENTRIES; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\000\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\001¢\006\002\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\001H\026J\020\020\b\032\0020\0062\006\020\t\032\0020\nH\026J\b\020\013\032\0020\001H\026J\b\020\f\032\0020\rH\026R\016\020\002\032\0020\001X\004¢\006\002\n\000R\016\020\003\032\0020\001X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$And;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "left", "right", "(Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;)V", "equivalentForInteger", "", "other", "isFulfilled", "n", "", "simplifyForInteger", "toString", "", "library"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class And extends Condition { @NotNull
/*     */       private final PluralRule.Condition left; @NotNull
/*     */       private final PluralRule.Condition right; public static final int $stable;
/*  71 */       public And(@NotNull PluralRule.Condition left, @NotNull PluralRule.Condition right) { super(null); this.left = left;
/*  72 */         this.right = right; } public boolean isFulfilled(int n) { return (this.left.isFulfilled(n) && this.right.isFulfilled(n)); }
/*     */        @NotNull
/*     */       public PluralRule.Condition simplifyForInteger() {
/*  75 */         PluralRule.Condition leftSimplified = this.left.simplifyForInteger();
/*  76 */         if (Intrinsics.areEqual(leftSimplified, PluralRule.Condition.False.INSTANCE)) return PluralRule.Condition.False.INSTANCE;
/*     */         
/*  78 */         PluralRule.Condition rightSimplified = this.right.simplifyForInteger();
/*     */         
/*  80 */         if (Intrinsics.areEqual(leftSimplified, PluralRule.Condition.True.INSTANCE)) return rightSimplified; 
/*  81 */         if (Intrinsics.areEqual(rightSimplified, PluralRule.Condition.False.INSTANCE)) return PluralRule.Condition.False.INSTANCE; 
/*  82 */         if (Intrinsics.areEqual(rightSimplified, PluralRule.Condition.True.INSTANCE)) return leftSimplified;
/*     */ 
/*     */         
/*  85 */         if (leftSimplified.equivalentForInteger(rightSimplified)) return leftSimplified; 
/*  86 */         return new And(leftSimplified, rightSimplified);
/*     */       }
/*     */       
/*     */       public boolean equivalentForInteger(@NotNull PluralRule.Condition other) {
/*  90 */         Intrinsics.checkNotNullParameter(other, "other"); if (this == other) return true; 
/*  91 */         if (!(other instanceof And)) return false; 
/*  92 */         return (this.left.equivalentForInteger(((And)other).left) && this.right.equivalentForInteger(((And)other).right));
/*     */       } @NotNull
/*     */       public String toString() {
/*  95 */         return "" + this.left + " and " + this.left;
/*     */       } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\000\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\001¢\006\002\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\001H\026J\020\020\b\032\0020\0062\006\020\t\032\0020\nH\026J\b\020\013\032\0020\001H\026J\b\020\f\032\0020\rH\026R\016\020\002\032\0020\001X\004¢\006\002\n\000R\016\020\003\032\0020\001X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Or;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "left", "right", "(Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;)V", "equivalentForInteger", "", "other", "isFulfilled", "n", "", "simplifyForInteger", "toString", "", "library"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class Or extends Condition { @NotNull
/*     */       private final PluralRule.Condition left; @NotNull
/*     */       private final PluralRule.Condition right; public static final int $stable;
/* 101 */       public Or(@NotNull PluralRule.Condition left, @NotNull PluralRule.Condition right) { super(null); this.left = left;
/* 102 */         this.right = right; } public boolean isFulfilled(int n) { return (this.left.isFulfilled(n) || this.right.isFulfilled(n)); }
/*     */        @NotNull
/*     */       public PluralRule.Condition simplifyForInteger() {
/* 105 */         PluralRule.Condition leftSimplified = this.left.simplifyForInteger();
/* 106 */         if (Intrinsics.areEqual(leftSimplified, PluralRule.Condition.True.INSTANCE)) return PluralRule.Condition.True.INSTANCE;
/*     */         
/* 108 */         PluralRule.Condition rightSimplified = this.right.simplifyForInteger();
/*     */         
/* 110 */         if (Intrinsics.areEqual(leftSimplified, PluralRule.Condition.False.INSTANCE)) return rightSimplified; 
/* 111 */         if (Intrinsics.areEqual(rightSimplified, PluralRule.Condition.True.INSTANCE)) return PluralRule.Condition.True.INSTANCE; 
/* 112 */         if (Intrinsics.areEqual(rightSimplified, PluralRule.Condition.False.INSTANCE)) return leftSimplified;
/*     */ 
/*     */         
/* 115 */         if (leftSimplified.equivalentForInteger(rightSimplified)) return leftSimplified; 
/* 116 */         return new Or(leftSimplified, rightSimplified);
/*     */       }
/*     */       
/*     */       public boolean equivalentForInteger(@NotNull PluralRule.Condition other) {
/* 120 */         Intrinsics.checkNotNullParameter(other, "other"); if (this == other) return true; 
/* 121 */         if (!(other instanceof Or)) return false; 
/* 122 */         return (this.left.equivalentForInteger(((Or)other).left) && this.right.equivalentForInteger(((Or)other).right));
/*     */       } @NotNull
/*     */       public String toString() {
/* 125 */         return "" + this.left + " or " + this.left;
/*     */       } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\020\021\n\002\030\002\n\002\b\t\n\002\020\016\n\000\b\007\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\013J\020\020\016\032\0020\0072\006\020\017\032\0020\001H\026J\020\020\020\032\0020\0072\006\020\021\032\0020\005H\026J\b\020\022\032\0020\001H\026J\b\020\023\032\0020\024H\026R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\022\020\004\032\004\030\0010\005X\004¢\006\004\n\002\020\fR\026\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\004\n\002\020\r¨\006\025"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Relation;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "operand", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;", "operandDivisor", "", "comparisonIsNegated", "", "ranges", "", "Lkotlin/ranges/IntRange;", "(Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;Ljava/lang/Integer;Z[Lkotlin/ranges/IntRange;)V", "Ljava/lang/Integer;", "[Lkotlin/ranges/IntRange;", "equivalentForInteger", "other", "isFulfilled", "n", "simplifyForInteger", "toString", "", "library"})
/*     */     @StabilityInferred(parameters = 0)
/*     */     @SourceDebugExtension({"SMAP\nPluralRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluralRule.kt\norg/jetbrains/compose/resources/plural/PluralRule$Condition$Relation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,406:1\n12474#2,2:407\n12474#2,2:409\n*S KotlinDebug\n*F\n+ 1 PluralRule.kt\norg/jetbrains/compose/resources/plural/PluralRule$Condition$Relation\n*L\n144#1:407,2\n156#1:409,2\n*E\n"})
/*     */     public static final class Relation extends Condition { @NotNull
/*     */       private final PluralRule.Condition.Operand operand; @Nullable
/*     */       private final Integer operandDivisor; private final boolean comparisonIsNegated; @NotNull
/*     */       private final IntRange[] ranges; public static final int $stable = 8; public Relation(@NotNull PluralRule.Condition.Operand operand, @Nullable Integer operandDivisor, boolean comparisonIsNegated, @NotNull IntRange[] ranges) {
/* 133 */         super(null);
/*     */         this.operand = operand;
/*     */         this.operandDivisor = operandDivisor;
/*     */         this.comparisonIsNegated = comparisonIsNegated;
/*     */         this.ranges = ranges;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean isFulfilled(int n) {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield operand : Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;
/*     */         //   4: getstatic org/jetbrains/compose/resources/plural/PluralRule$Condition$Relation$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */         //   7: swap
/*     */         //   8: invokevirtual ordinal : ()I
/*     */         //   11: iaload
/*     */         //   12: tableswitch default -> 43, 1 -> 36, 2 -> 36
/*     */         //   36: iload_1
/*     */         //   37: invokestatic abs : (I)I
/*     */         //   40: goto -> 44
/*     */         //   43: iconst_0
/*     */         //   44: istore_2
/*     */         //   45: aload_0
/*     */         //   46: getfield operandDivisor : Ljava/lang/Integer;
/*     */         //   49: ifnull -> 64
/*     */         //   52: iload_2
/*     */         //   53: aload_0
/*     */         //   54: getfield operandDivisor : Ljava/lang/Integer;
/*     */         //   57: invokevirtual intValue : ()I
/*     */         //   60: irem
/*     */         //   61: goto -> 65
/*     */         //   64: iload_2
/*     */         //   65: istore_3
/*     */         //   66: aload_0
/*     */         //   67: getfield ranges : [Lkotlin/ranges/IntRange;
/*     */         //   70: astore #4
/*     */         //   72: iconst_0
/*     */         //   73: istore #5
/*     */         //   75: iconst_0
/*     */         //   76: istore #6
/*     */         //   78: aload #4
/*     */         //   80: arraylength
/*     */         //   81: istore #7
/*     */         //   83: iload #6
/*     */         //   85: iload #7
/*     */         //   87: if_icmpge -> 148
/*     */         //   90: aload #4
/*     */         //   92: iload #6
/*     */         //   94: aaload
/*     */         //   95: astore #8
/*     */         //   97: aload #8
/*     */         //   99: astore #9
/*     */         //   101: iconst_0
/*     */         //   102: istore #10
/*     */         //   104: aload #9
/*     */         //   106: invokevirtual getFirst : ()I
/*     */         //   109: istore #11
/*     */         //   111: iload_3
/*     */         //   112: aload #9
/*     */         //   114: invokevirtual getLast : ()I
/*     */         //   117: if_icmpgt -> 134
/*     */         //   120: iload #11
/*     */         //   122: iload_3
/*     */         //   123: if_icmpgt -> 130
/*     */         //   126: iconst_1
/*     */         //   127: goto -> 135
/*     */         //   130: iconst_0
/*     */         //   131: goto -> 135
/*     */         //   134: iconst_0
/*     */         //   135: ifeq -> 142
/*     */         //   138: iconst_1
/*     */         //   139: goto -> 149
/*     */         //   142: iinc #6, 1
/*     */         //   145: goto -> 83
/*     */         //   148: iconst_0
/*     */         //   149: aload_0
/*     */         //   150: getfield comparisonIsNegated : Z
/*     */         //   153: if_icmpeq -> 160
/*     */         //   156: iconst_1
/*     */         //   157: goto -> 161
/*     */         //   160: iconst_0
/*     */         //   161: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #135	-> 0
/*     */         //   #136	-> 36
/*     */         //   #137	-> 43
/*     */         //   #135	-> 44
/*     */         //   #139	-> 45
/*     */         //   #140	-> 52
/*     */         //   #142	-> 64
/*     */         //   #139	-> 65
/*     */         //   #144	-> 66
/*     */         //   #407	-> 75
/*     */         //   #144	-> 104
/*     */         //   #407	-> 135
/*     */         //   #408	-> 148
/*     */         //   #144	-> 149
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   104	31	10	$i$a$-any-PluralRule$Condition$Relation$isFulfilled$1	I
/*     */         //   101	34	9	it	Lkotlin/ranges/IntRange;
/*     */         //   97	45	8	element$iv	Ljava/lang/Object;
/*     */         //   75	74	5	$i$f$any	I
/*     */         //   72	77	4	$this$any$iv	[Ljava/lang/Object;
/*     */         //   45	117	2	expressionOperandValue	I
/*     */         //   66	96	3	moduloAppliedValue	I
/*     */         //   0	162	0	this	Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Relation;
/*     */         //   0	162	1	n	I
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @NotNull
/*     */       public PluralRule.Condition simplifyForInteger() {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield operand : Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;
/*     */         //   4: getstatic org/jetbrains/compose/resources/plural/PluralRule$Condition$Relation$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */         //   7: swap
/*     */         //   8: invokevirtual ordinal : ()I
/*     */         //   11: iaload
/*     */         //   12: tableswitch default -> 64, 1 -> 36, 2 -> 36
/*     */         //   36: new org/jetbrains/compose/resources/plural/PluralRule$Condition$Relation
/*     */         //   39: dup
/*     */         //   40: getstatic org/jetbrains/compose/resources/plural/PluralRule$Condition$Operand.N : Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;
/*     */         //   43: aload_0
/*     */         //   44: getfield operandDivisor : Ljava/lang/Integer;
/*     */         //   47: aload_0
/*     */         //   48: getfield comparisonIsNegated : Z
/*     */         //   51: aload_0
/*     */         //   52: getfield ranges : [Lkotlin/ranges/IntRange;
/*     */         //   55: invokespecial <init> : (Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;Ljava/lang/Integer;Z[Lkotlin/ranges/IntRange;)V
/*     */         //   58: checkcast org/jetbrains/compose/resources/plural/PluralRule$Condition
/*     */         //   61: goto -> 161
/*     */         //   64: aload_0
/*     */         //   65: getfield ranges : [Lkotlin/ranges/IntRange;
/*     */         //   68: astore_1
/*     */         //   69: iconst_0
/*     */         //   70: istore_2
/*     */         //   71: iconst_0
/*     */         //   72: istore_3
/*     */         //   73: aload_1
/*     */         //   74: arraylength
/*     */         //   75: istore #4
/*     */         //   77: iload_3
/*     */         //   78: iload #4
/*     */         //   80: if_icmpge -> 138
/*     */         //   83: aload_1
/*     */         //   84: iload_3
/*     */         //   85: aaload
/*     */         //   86: astore #5
/*     */         //   88: aload #5
/*     */         //   90: astore #6
/*     */         //   92: iconst_0
/*     */         //   93: istore #7
/*     */         //   95: aload #6
/*     */         //   97: invokevirtual getFirst : ()I
/*     */         //   100: istore #8
/*     */         //   102: iconst_0
/*     */         //   103: aload #6
/*     */         //   105: invokevirtual getLast : ()I
/*     */         //   108: if_icmpgt -> 124
/*     */         //   111: iload #8
/*     */         //   113: ifgt -> 120
/*     */         //   116: iconst_1
/*     */         //   117: goto -> 125
/*     */         //   120: iconst_0
/*     */         //   121: goto -> 125
/*     */         //   124: iconst_0
/*     */         //   125: ifeq -> 132
/*     */         //   128: iconst_1
/*     */         //   129: goto -> 139
/*     */         //   132: iinc #3, 1
/*     */         //   135: goto -> 77
/*     */         //   138: iconst_0
/*     */         //   139: aload_0
/*     */         //   140: getfield comparisonIsNegated : Z
/*     */         //   143: if_icmpeq -> 155
/*     */         //   146: getstatic org/jetbrains/compose/resources/plural/PluralRule$Condition$True.INSTANCE : Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$True;
/*     */         //   149: checkcast org/jetbrains/compose/resources/plural/PluralRule$Condition
/*     */         //   152: goto -> 161
/*     */         //   155: getstatic org/jetbrains/compose/resources/plural/PluralRule$Condition$False.INSTANCE : Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$False;
/*     */         //   158: checkcast org/jetbrains/compose/resources/plural/PluralRule$Condition
/*     */         //   161: areturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #148	-> 0
/*     */         //   #149	-> 36
/*     */         //   #150	-> 40
/*     */         //   #151	-> 43
/*     */         //   #152	-> 47
/*     */         //   #153	-> 51
/*     */         //   #149	-> 55
/*     */         //   #156	-> 64
/*     */         //   #409	-> 71
/*     */         //   #156	-> 95
/*     */         //   #409	-> 125
/*     */         //   #410	-> 138
/*     */         //   #156	-> 139
/*     */         //   #148	-> 161
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   95	30	7	$i$a$-any-PluralRule$Condition$Relation$simplifyForInteger$1	I
/*     */         //   92	33	6	it	Lkotlin/ranges/IntRange;
/*     */         //   88	44	5	element$iv	Ljava/lang/Object;
/*     */         //   71	68	2	$i$f$any	I
/*     */         //   69	70	1	$this$any$iv	[Ljava/lang/Object;
/*     */         //   0	162	0	this	Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Relation;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean equivalentForInteger(@NotNull PluralRule.Condition other) {
/* 161 */         Intrinsics.checkNotNullParameter(other, "other"); if (this == other) return true; 
/* 162 */         if (!(other instanceof Relation)) return false; 
/* 163 */         if (((this.operand == PluralRule.Condition.Operand.N || this.operand == PluralRule.Condition.Operand.I) ? true : false) != ((((Relation)other).operand == PluralRule.Condition.Operand.N || ((Relation)other).operand == PluralRule.Condition.Operand.I) ? true : false)) return false; 
/* 164 */         if (!Intrinsics.areEqual(this.operandDivisor, ((Relation)other).operandDivisor)) return false; 
/* 165 */         if (this.comparisonIsNegated != ((Relation)other).comparisonIsNegated) return false; 
/* 166 */         if (!Arrays.equals((Object[])this.ranges, (Object[])((Relation)other).ranges)) return false; 
/* 167 */         return true;
/*     */       }
/*     */       @NotNull
/*     */       public String toString() {
/* 171 */         StringBuilder $this$toString_u24lambda_u242 = new StringBuilder(); int $i$a$-run-PluralRule$Condition$Relation$toString$1 = 0;
/* 172 */         Intrinsics.checkNotNullExpressionValue(this.operand.name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); $this$toString_u24lambda_u242.append(this.operand.name().toLowerCase(Locale.ROOT));
/* 173 */         if (this.operandDivisor != null) {
/* 174 */           $this$toString_u24lambda_u242.append(" % ");
/* 175 */           $this$toString_u24lambda_u242.append(this.operandDivisor.intValue());
/*     */         } 
/* 177 */         $this$toString_u24lambda_u242.append(' ');
/* 178 */         if (this.comparisonIsNegated) {
/* 179 */           $this$toString_u24lambda_u242.append('!');
/*     */         }
/* 181 */         $this$toString_u24lambda_u242.append("= ");
/* 182 */         boolean first = true; IntRange[] arrayOfIntRange; byte b; int i;
/* 183 */         for (arrayOfIntRange = this.ranges, b = 0, i = arrayOfIntRange.length; b < i; ) { IntRange range = arrayOfIntRange[b];
/* 184 */           if (!first) {
/* 185 */             $this$toString_u24lambda_u242.append(',');
/*     */           }
/* 187 */           first = false;
/* 188 */           $this$toString_u24lambda_u242.append(range.getFirst());
/* 189 */           if (range.getFirst() != range.getLast()) {
/* 190 */             $this$toString_u24lambda_u242.append("..");
/* 191 */             $this$toString_u24lambda_u242.append(range.getLast());
/*     */           }  b++; }
/*     */         
/* 194 */         Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u242.toString(), "run(...)"); return $this$toString_u24lambda_u242.toString();
/*     */       } }
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\001H\026J\020\020\006\032\0020\0042\006\020\007\032\0020\bH\026J\b\020\t\032\0020\000H\026J\b\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$True;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "()V", "equivalentForInteger", "", "other", "isFulfilled", "n", "", "simplifyForInteger", "toString", "", "library"})
/*     */     private static final class True extends Condition { @NotNull
/*     */       public static final True INSTANCE = new True();
/* 199 */       private True() { super(null); }
/* 200 */       public boolean isFulfilled(int n) { return true; } @NotNull
/* 201 */       public True simplifyForInteger() { return this; }
/* 202 */       public boolean equivalentForInteger(@NotNull PluralRule.Condition other) { Intrinsics.checkNotNullParameter(other, "other"); return Intrinsics.areEqual(this, other); } @NotNull
/* 203 */       public String toString() { return ""; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\000\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\001H\026J\020\020\006\032\0020\0042\006\020\007\032\0020\bH\026J\b\020\t\032\0020\000H\026J\b\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$False;", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "()V", "equivalentForInteger", "", "other", "isFulfilled", "n", "", "simplifyForInteger", "toString", "", "library"})
/*     */     private static final class False extends Condition { @NotNull
/*     */       public static final False INSTANCE = new False();
/* 206 */       private False() { super(null); }
/* 207 */       public boolean isFulfilled(int n) { return false; } @NotNull
/* 208 */       public False simplifyForInteger() { return this; }
/* 209 */       public boolean equivalentForInteger(@NotNull PluralRule.Condition other) { Intrinsics.checkNotNullParameter(other, "other"); return Intrinsics.areEqual(this, other); } @NotNull
/* 210 */       public String toString() { return "(false)"; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\001\n\000\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\002J\b\020\013\032\0020\fH\002J\b\020\r\032\0020\006H\002J\b\020\016\032\0020\bH\002J\b\020\017\032\0020\nH\002J\b\020\020\032\0020\021H\002J\006\020\022\032\0020\nJ\b\020\023\032\0020\021H\002J\r\020\024\032\004\030\0010\006¢\006\002\020\025J\006\020\026\032\0020\027J\006\020\030\032\0020\031J\006\020\032\032\0020\033J\b\020\034\032\0020\fH\002J\006\020\035\032\0020\021J\b\020\036\032\0020\fH\002J\017\020\037\032\004\030\0010\fH\002¢\006\002\020 J\b\020!\032\0020\"H\002R\016\020\005\032\0020\006X\016¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006#"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Parser;", "", "description", "", "(Ljava/lang/String;)V", "currentIdx", "", "assert", "", "condition", "", "consumeNext", "", "consumeNextInt", "consumeWhitespaces", "eof", "nextAndCondition", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "nextComparisonIsNegated", "nextCondition", "nextModulusDivisor", "()Ljava/lang/Integer;", "nextOperand", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Operand;", "nextRange", "Lkotlin/ranges/IntRange;", "nextRelation", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Relation;", "nextUnchecked", "parse", "peekNext", "peekNextOrNull", "()Ljava/lang/Character;", "raise", "", "library"})
/*     */     @SourceDebugExtension({"SMAP\nPluralRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluralRule.kt\norg/jetbrains/compose/resources/plural/PluralRule$Condition$Parser\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,406:1\n37#2,2:407\n*S KotlinDebug\n*F\n+ 1 PluralRule.kt\norg/jetbrains/compose/resources/plural/PluralRule$Condition$Parser\n*L\n317#1:407,2\n*E\n"})
/*     */     private static final class Parser { @NotNull
/* 213 */       private final String description; private int currentIdx; public Parser(@NotNull String description) { this.description = description; }
/*     */       
/*     */       private final boolean eof() {
/* 216 */         return (this.currentIdx >= this.description.length());
/*     */       } private final char nextUnchecked() {
/* 218 */         return this.description.charAt(this.currentIdx);
/*     */       }
/*     */       private final void consumeWhitespaces() {
/* 221 */         while (!eof() && CharsKt.isWhitespace(nextUnchecked()))
/* 222 */           this.currentIdx++; 
/*     */       }
/*     */       
/*     */       private final Void raise() {
/* 226 */         throw new PluralRuleParseException(this.description, this.currentIdx + 1);
/*     */       }
/*     */       private final void assert(boolean condition) {
/* 229 */         if (!condition) { raise(); throw new KotlinNothingValueException(); }
/*     */       
/*     */       } private final Character peekNextOrNull() {
/* 232 */         return StringsKt.getOrNull(this.description, this.currentIdx);
/*     */       } private final char peekNext() {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: invokespecial peekNextOrNull : ()Ljava/lang/Character;
/*     */         //   4: dup
/*     */         //   5: ifnull -> 14
/*     */         //   8: invokevirtual charValue : ()C
/*     */         //   11: goto -> 28
/*     */         //   14: pop
/*     */         //   15: aload_0
/*     */         //   16: invokespecial raise : ()Ljava/lang/Void;
/*     */         //   19: pop
/*     */         //   20: new kotlin/KotlinNothingValueException
/*     */         //   23: dup
/*     */         //   24: invokespecial <init> : ()V
/*     */         //   27: athrow
/*     */         //   28: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #234	-> 0
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	29	0	this	Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Parser;
/*     */       }
/*     */       private final char consumeNext() {
/* 237 */         char next = peekNext();
/* 238 */         this.currentIdx++;
/* 239 */         return next;
/*     */       }
/*     */       
/*     */       private final int consumeNextInt() {
/* 243 */         assert(Character.isDigit(peekNext()));
/* 244 */         int integerValue = 0;
/* 245 */         int integerLastIdx = this.currentIdx;
/* 246 */         while (integerLastIdx < this.description.length() && Character.isDigit(this.description.charAt(integerLastIdx))) {
/* 247 */           integerValue *= 10;
/* 248 */           integerValue += this.description.charAt(integerLastIdx) - 48; integerLastIdx++;
/*     */         } 
/*     */         
/* 251 */         this.currentIdx = integerLastIdx;
/* 252 */         return integerValue;
/*     */       }
/*     */       @NotNull
/*     */       public final PluralRule.Condition parse() {
/* 256 */         consumeWhitespaces();
/* 257 */         if (eof()) return PluralRule.Condition.True.INSTANCE; 
/* 258 */         PluralRule.Condition condition = nextCondition();
/* 259 */         consumeWhitespaces();
/* 260 */         assert(eof());
/* 261 */         return condition;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       private final PluralRule.Condition nextCondition() {
/* 271 */         PluralRule.Condition condition = nextAndCondition();
/*     */         while (true) {
/* 273 */           consumeWhitespaces();
/* 274 */           byte b = 111; if (peekNextOrNull() == null) { peekNextOrNull(); break; }  if (peekNextOrNull().charValue() != b)
/* 275 */             break;  consumeNext();
/* 276 */           assert((consumeNext() == 'r'));
/* 277 */           condition = new PluralRule.Condition.Or(condition, nextAndCondition());
/*     */         } 
/* 279 */         return condition;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       private final PluralRule.Condition nextAndCondition() {
/* 289 */         PluralRule.Condition condition = nextRelation();
/*     */         while (true) {
/* 291 */           consumeWhitespaces();
/* 292 */           byte b = 97; if (peekNextOrNull() == null) { peekNextOrNull(); break; }  if (peekNextOrNull().charValue() != b)
/* 293 */             break;  consumeNext();
/* 294 */           assert((consumeNext() == 'n'));
/* 295 */           assert((consumeNext() == 'd'));
/* 296 */           condition = new PluralRule.Condition.And(condition, nextRelation());
/*     */         } 
/* 298 */         return condition;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @NotNull
/*     */       public final PluralRule.Condition.Relation nextRelation() {
/* 308 */         PluralRule.Condition.Operand operand = nextOperand();
/* 309 */         Integer divisor = nextModulusDivisor();
/* 310 */         boolean negated = nextComparisonIsNegated();
/* 311 */         IntRange[] arrayOfIntRange = new IntRange[1]; arrayOfIntRange[0] = nextRange(); List<IntRange> ranges = CollectionsKt.mutableListOf((Object[])arrayOfIntRange); while (true) {
/* 312 */           byte b = 44; if (peekNextOrNull() == null) { peekNextOrNull(); break; }  if (peekNextOrNull().charValue() == b) {
/* 313 */             consumeNext();
/* 314 */             ranges.add(nextRange()); continue;
/*     */           }  break;
/*     */         } 
/* 317 */         Collection<IntRange> $this$toTypedArray$iv = ranges; int $i$f$toTypedArray = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 407 */         Collection<IntRange> thisCollection$iv = $this$toTypedArray$iv;
/* 408 */         return new PluralRule.Condition.Relation(operand, divisor, negated, thisCollection$iv.<IntRange>toArray(new IntRange[0]));
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final PluralRule.Condition.Operand nextOperand() {
/*     */         consumeWhitespaces();
/*     */         char c = consumeNext();
/*     */         if ((c == 'c') ? true : ((c == 'e'))) {
/*     */         
/*     */         } else {
/*     */           raise();
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */         return (c == 'n') ? PluralRule.Condition.Operand.N : ((c == 'i') ? PluralRule.Condition.Operand.I : ((c == 'f') ? PluralRule.Condition.Operand.F : ((c == 't') ? PluralRule.Condition.Operand.T : ((c == 'v') ? PluralRule.Condition.Operand.V : ((c == 'w') ? PluralRule.Condition.Operand.W : (PluralRule.Condition.Operand)"JD-Core does not support Kotlin")))));
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Integer nextModulusDivisor() {
/*     */         consumeWhitespaces();
/*     */         if (peekNext() == '%') {
/*     */           consumeNext();
/*     */           consumeWhitespaces();
/*     */           return Integer.valueOf(consumeNextInt());
/*     */         } 
/*     */         return null;
/*     */       }
/*     */       
/*     */       public final boolean nextComparisonIsNegated() {
/*     */         consumeWhitespaces();
/*     */         char c = peekNext();
/*     */         if (c == '!') {
/*     */           consumeNext();
/*     */           assert((consumeNext() == '='));
/*     */           return true;
/*     */         } 
/*     */         if (c == '=') {
/*     */           consumeNext();
/*     */           return false;
/*     */         } 
/*     */         raise();
/*     */         throw new KotlinNothingValueException();
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final IntRange nextRange() {
/*     */         consumeWhitespaces();
/*     */         int start = consumeNextInt();
/*     */         byte b = 46;
/*     */         if (peekNextOrNull() == null) {
/*     */           peekNextOrNull();
/*     */         } else if (peekNextOrNull().charValue() == b) {
/*     */           consumeNext();
/*     */           assert((consumeNext() == '.'));
/*     */           int endInclusive = consumeNextInt();
/*     */           return new IntRange(start, endInclusive);
/*     */         } 
/*     */         return new IntRange(start, start);
/*     */       } }
/*     */ 
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Companion;", "", "()V", "parse", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "description", "", "library"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final PluralRule.Condition parse(@NotNull String description) {
/*     */         Intrinsics.checkNotNullParameter(description, "description");
/*     */         return (new PluralRule.Condition.Parser(description)).parse().simplifyForInteger();
/*     */       }
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRule$Condition$Companion;", "", "()V", "parse", "Lorg/jetbrains/compose/resources/plural/PluralRule$Condition;", "description", "", "library"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final PluralRule.Condition parse(@NotNull String description) {
/*     */       Intrinsics.checkNotNullParameter(description, "description");
/*     */       return (new PluralRule.Condition.Parser(description)).parse().simplifyForInteger();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\plural\PluralRule.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */