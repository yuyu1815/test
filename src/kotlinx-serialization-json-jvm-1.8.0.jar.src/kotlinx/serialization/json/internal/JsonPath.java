/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\021\n\002\b\002\n\002\020\025\n\000\n\002\020\b\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\006\b\000\030\0002\0020\001:\001\033B\007¢\006\004\b\002\020\003J\016\020\013\032\0020\f2\006\020\r\032\0020\016J\016\020\017\032\0020\f2\006\020\020\032\0020\nJ\020\020\021\032\0020\f2\b\020\022\032\004\030\0010\001J\006\020\023\032\0020\fJ\006\020\024\032\0020\fJ\006\020\025\032\0020\026J\022\020\027\032\0020\0262\b\020\030\032\004\030\0010\001H\002J\b\020\031\032\0020\fH\002J\b\020\032\032\0020\026H\026R\030\020\004\032\n\022\006\022\004\030\0010\0010\005X\016¢\006\004\n\002\020\006R\016\020\007\032\0020\bX\016¢\006\002\n\000R\016\020\t\032\0020\nX\016¢\006\002\n\000¨\006\034"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "<init>", "()V", "currentObjectPath", "", "[Ljava/lang/Object;", "indicies", "", "currentDepth", "", "pushDescriptor", "", "sd", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "updateDescriptorIndex", "index", "updateCurrentMapKey", "key", "resetCurrentMapKey", "popDescriptor", "getPath", "", "prettyString", "it", "resize", "toString", "Tombstone", "kotlinx-serialization-json"})
/*     */ public final class JsonPath
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÂ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "<init>", "()V", "kotlinx-serialization-json"})
/*     */   private static final class Tombstone
/*     */   {
/*     */     @NotNull
/*     */     public static final Tombstone INSTANCE = new Tombstone();
/*     */   }
/*     */   @NotNull
/*  32 */   private Object[] currentObjectPath = new Object[8];
/*     */   
/*     */   @NotNull
/*     */   private int[] indicies;
/*     */   
/*     */   private int currentDepth;
/*     */ 
/*     */   
/*     */   public JsonPath() {
/*     */     int[] arrayOfInt;
/*     */     JsonPath jsonPath;
/*  43 */     for (byte b = 0; b < 8; ) { byte b1 = b; arrayOfInt[b1] = -1; b++; }  jsonPath.indicies = arrayOfInt;
/*  44 */     this.currentDepth = -1;
/*     */   }
/*     */   
/*     */   public final void pushDescriptor(@NotNull SerialDescriptor sd) {
/*  48 */     Intrinsics.checkNotNullParameter(sd, "sd"); int depth = ++this.currentDepth;
/*  49 */     if (depth == this.currentObjectPath.length) {
/*  50 */       resize();
/*     */     }
/*  52 */     this.currentObjectPath[depth] = sd;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void updateDescriptorIndex(int index) {
/*  57 */     this.indicies[this.currentDepth] = index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void updateCurrentMapKey(@Nullable Object key) {
/*  68 */     if (this.indicies[this.currentDepth] != -2) { this.currentDepth++; if (this.currentDepth == this.currentObjectPath.length)
/*  69 */         resize();  }
/*     */     
/*  71 */     this.currentObjectPath[this.currentDepth] = key;
/*  72 */     this.indicies[this.currentDepth] = -2;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void resetCurrentMapKey() {
/*  77 */     if (this.indicies[this.currentDepth] == -2) {
/*  78 */       this.currentObjectPath[this.currentDepth] = Tombstone.INSTANCE;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final void popDescriptor() {
/*  84 */     int depth = this.currentDepth;
/*  85 */     if (this.indicies[depth] == -2) {
/*  86 */       this.indicies[depth] = -1;
/*  87 */       int i = this.currentDepth; this.currentDepth = i + -1;
/*     */     } 
/*     */     
/*  90 */     if (this.currentDepth != -1) {
/*     */       
/*  92 */       int i = this.currentDepth; this.currentDepth = i + -1;
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
/*     */   @NotNull
/*     */   public final String getPath() {
/*     */     // Byte code:
/*     */     //   0: new java/lang/StringBuilder
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore_1
/*     */     //   8: aload_1
/*     */     //   9: astore_2
/*     */     //   10: iconst_0
/*     */     //   11: istore_3
/*     */     //   12: aload_2
/*     */     //   13: ldc '$'
/*     */     //   15: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   18: pop
/*     */     //   19: aload_0
/*     */     //   20: getfield currentDepth : I
/*     */     //   23: iconst_1
/*     */     //   24: iadd
/*     */     //   25: istore #4
/*     */     //   27: iconst_0
/*     */     //   28: istore #5
/*     */     //   30: iload #5
/*     */     //   32: iload #4
/*     */     //   34: if_icmpge -> 211
/*     */     //   37: iload #5
/*     */     //   39: istore #6
/*     */     //   41: iconst_0
/*     */     //   42: istore #7
/*     */     //   44: aload_0
/*     */     //   45: getfield currentObjectPath : [Ljava/lang/Object;
/*     */     //   48: iload #6
/*     */     //   50: aaload
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: instanceof kotlinx/serialization/descriptors/SerialDescriptor
/*     */     //   58: ifeq -> 161
/*     */     //   61: aload #8
/*     */     //   63: checkcast kotlinx/serialization/descriptors/SerialDescriptor
/*     */     //   66: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   71: getstatic kotlinx/serialization/descriptors/StructureKind$LIST.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$LIST;
/*     */     //   74: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   77: ifeq -> 120
/*     */     //   80: aload_0
/*     */     //   81: getfield indicies : [I
/*     */     //   84: iload #6
/*     */     //   86: iaload
/*     */     //   87: iconst_m1
/*     */     //   88: if_icmpeq -> 204
/*     */     //   91: aload_2
/*     */     //   92: ldc '['
/*     */     //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   97: pop
/*     */     //   98: aload_2
/*     */     //   99: aload_0
/*     */     //   100: getfield indicies : [I
/*     */     //   103: iload #6
/*     */     //   105: iaload
/*     */     //   106: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   109: pop
/*     */     //   110: aload_2
/*     */     //   111: ldc ']'
/*     */     //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   116: pop
/*     */     //   117: goto -> 204
/*     */     //   120: aload_0
/*     */     //   121: getfield indicies : [I
/*     */     //   124: iload #6
/*     */     //   126: iaload
/*     */     //   127: istore #9
/*     */     //   129: iload #9
/*     */     //   131: iflt -> 204
/*     */     //   134: aload_2
/*     */     //   135: ldc '.'
/*     */     //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   140: pop
/*     */     //   141: aload_2
/*     */     //   142: aload #8
/*     */     //   144: checkcast kotlinx/serialization/descriptors/SerialDescriptor
/*     */     //   147: iload #9
/*     */     //   149: invokeinterface getElementName : (I)Ljava/lang/String;
/*     */     //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   157: pop
/*     */     //   158: goto -> 204
/*     */     //   161: aload #8
/*     */     //   163: getstatic kotlinx/serialization/json/internal/JsonPath$Tombstone.INSTANCE : Lkotlinx/serialization/json/internal/JsonPath$Tombstone;
/*     */     //   166: if_acmpeq -> 204
/*     */     //   169: aload_2
/*     */     //   170: ldc '['
/*     */     //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   175: pop
/*     */     //   176: aload_2
/*     */     //   177: ldc '''
/*     */     //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   182: pop
/*     */     //   183: aload_2
/*     */     //   184: aload #8
/*     */     //   186: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   189: pop
/*     */     //   190: aload_2
/*     */     //   191: ldc '''
/*     */     //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   196: pop
/*     */     //   197: aload_2
/*     */     //   198: ldc ']'
/*     */     //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   203: pop
/*     */     //   204: nop
/*     */     //   205: iinc #5, 1
/*     */     //   208: goto -> 30
/*     */     //   211: nop
/*     */     //   212: aload_1
/*     */     //   213: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   216: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 0
/*     */     //   #99	-> 12
/*     */     //   #100	-> 19
/*     */     //   #101	-> 44
/*     */     //   #102	-> 53
/*     */     //   #103	-> 61
/*     */     //   #104	-> 80
/*     */     //   #105	-> 91
/*     */     //   #106	-> 98
/*     */     //   #107	-> 110
/*     */     //   #110	-> 120
/*     */     //   #112	-> 129
/*     */     //   #113	-> 134
/*     */     //   #114	-> 141
/*     */     //   #117	-> 161
/*     */     //   #118	-> 169
/*     */     //   #120	-> 176
/*     */     //   #122	-> 183
/*     */     //   #123	-> 190
/*     */     //   #124	-> 197
/*     */     //   #126	-> 204
/*     */     //   #100	-> 205
/*     */     //   #127	-> 211
/*     */     //   #98	-> 212
/*     */     //   #98	-> 216
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   129	29	9	idx	I
/*     */     //   44	161	7	$i$a$-repeat-JsonPath$getPath$1$1	I
/*     */     //   53	152	8	element	Ljava/lang/Object;
/*     */     //   41	164	6	it	I
/*     */     //   12	200	3	$i$a$-buildString-JsonPath$getPath$1	I
/*     */     //   10	202	2	$this$getPath_u24lambda_u241	Ljava/lang/StringBuilder;
/*     */     //   0	217	0	this	Lkotlinx/serialization/json/internal/JsonPath;
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
/*     */   private final String prettyString(Object it) {
/* 132 */     if (((it instanceof SerialDescriptor) ? it : null) == null || ((it instanceof SerialDescriptor) ? it : null).getSerialName() == null) ((it instanceof SerialDescriptor) ? it : null).getSerialName();  return String.valueOf(it);
/*     */   }
/*     */   private final void resize() {
/* 135 */     int newSize = this.currentDepth * 2;
/* 136 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.currentObjectPath, newSize), "copyOf(...)"); this.currentObjectPath = Arrays.copyOf(this.currentObjectPath, newSize);
/* 137 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.indicies, newSize), "copyOf(...)"); this.indicies = Arrays.copyOf(this.indicies, newSize);
/*     */   } @NotNull
/*     */   public String toString() {
/* 140 */     return getPath();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */