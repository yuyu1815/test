/*    */ package ai.grazie.model.cloud.ip;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\022\n\002\b\004\n\002\020\016\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\000 \0242\0020\001:\001\024B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\013\032\0020\003HÆ\003J\023\020\f\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020H\002J\b\020\021\032\0020\022H\026J\t\020\023\032\0020\bHÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Lai/grazie/model/cloud/ip/IPv6Address;", "Lai/grazie/model/cloud/ip/IPAddress;", "bytes", "", "([B)V", "getBytes", "()[B", "display", "", "getDisplay", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nIPv6Address.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPv6Address.kt\nai/grazie/model/cloud/ip/IPv6Address\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
/*    */ public final class IPv6Address implements IPAddress { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final byte[] bytes; @NotNull
/*  6 */   private final String display; public IPv6Address(@NotNull byte[] bytes) { this.bytes = bytes;
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
/*    */ 
/*    */ 
/*    */     
/* 58 */     this.display = CollectionsKt.joinToString$default(CollectionsKt.chunked(ArraysKt.toList(getBytes()), 2), ":", null, null, 0, null, IPv6Address$display$1.INSTANCE, 30, null);
/*    */ 
/*    */     
/* 61 */     if (!(((getBytes()).length == 16) ? 1 : 0))
/*    */     
/*    */     { 
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
/*    */ 
/*    */       
/* 82 */       int $i$a$-require-IPv6Address$1 = 0; String str = "Invalid IPv6 address: " + getDisplay(); throw new IllegalArgumentException(str.toString()); }  } @NotNull public byte[] getBytes() { return this.bytes; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\000\n\002\020 \n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\026\020\007\032\b\022\004\022\0020\0060\b2\006\020\005\032\0020\006H\002J\016\020\t\032\0020\n2\006\020\005\032\0020\006J\020\020\013\032\004\030\0010\n2\006\020\f\032\0020\006¨\006\r"}, d2 = {"Lai/grazie/model/cloud/ip/IPv6Address$Companion;", "", "()V", "check", "", "ip", "", "chunks", "", "parse", "Lai/grazie/model/cloud/ip/IPv6Address;", "parseOrNull", "ipAddress", "model-cloud"}) @SourceDebugExtension({"SMAP\nIPv6Address.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPv6Address.kt\nai/grazie/model/cloud/ip/IPv6Address$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1#2:82\n1734#3,3:83\n1368#3:86\n1454#3,5:87\n1557#3:92\n1628#3,3:93\n*S KotlinDebug\n*F\n+ 1 IPv6Address.kt\nai/grazie/model/cloud/ip/IPv6Address$Companion\n*L\n29#1:83,3\n40#1:86\n40#1:87,5\n42#1:92\n42#1:93,3\n*E\n"}) public static final class Companion { private Companion() {} private final List<String> chunks(String ip) { String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; List<String> split = StringsKt.split$default(ip, arrayOfString, false, 0, 6, null); int zerosIndex = split.indexOf(""); int zerosCount = 8 - split.size() + 1; ArrayList<String> result = new ArrayList(); for (int i = 0, j = split.size(); i < j; i++) { if (i == zerosIndex) { ArrayList<String> arrayList1; byte b; ArrayList<String> arrayList2; for (arrayList2 = result, arrayList1 = new ArrayList(zerosCount), b = 0; b < zerosCount; ) { byte b1 = b, b2 = b1; ArrayList<String> arrayList = arrayList1; int $i$a$-List-IPv6Address$Companion$chunks$1 = 0; arrayList.add("0000"); b++; }  arrayList2.addAll(arrayList1); } else { result.add(StringsKt.padStart(split.get(i), 4, '0')); }  }  return result; } @Nullable public final IPv6Address parseOrNull(@NotNull String ipAddress) { Intrinsics.checkNotNullParameter(ipAddress, "ipAddress"); String ip = ipAddress; if (StringsKt.startsWith$default(ip, "[", false, 2, null) && StringsKt.endsWith$default(ip, "]", false, 2, null)) { Intrinsics.checkNotNullExpressionValue(ip.substring(1, ip.length() - 1), "substring(...)"); ip = ip.substring(1, ip.length() - 1); }  switch (ip.hashCode()) { case -1204607085: if (!ip.equals("localhost"))
/*    */             break;  return parse("0:0:0:0:0:0:0:1");case 57585: if (!ip.equals("::1"))
/*    */             break;  return parse("0:0:0:0:0:0:0:1");case -276788189: if (ip.equals("kubernetes.docker.internal"))
/*    */             return parse("0:0:0:0:0:0:0:1");  break; }  if (!check(ip))
/* 86 */         return null;  List<String> parts = chunks(ip); Iterable<String> $this$flatMap$iv = parts; int $i$f$flatMap = 0; Iterable<String> iterable1 = $this$flatMap$iv; Collection<Byte> destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 87 */       for (String element$iv$iv : iterable1) {
/* 88 */         String it = element$iv$iv; int $i$a$-flatMap-IPv6Address$Companion$parseOrNull$bytes$1 = 0; Iterable list$iv$iv = StringsKt.toList(it);
/* 89 */         CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */       } 
/* 91 */       $this$flatMap$iv = CollectionsKt.chunked(destination$iv$iv, 2); int $i$f$map = 0;
/* 92 */       Iterable<String> $this$flatMapTo$iv$iv = $this$flatMap$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$flatMap$iv, 10)); int $i$f$mapTo = 0;
/* 93 */       for (String item$iv$iv : $this$flatMapTo$iv$iv) {
/* 94 */         List list = (List)item$iv$iv; Collection<Byte> collection = destination$iv$iv; int $i$a$-map-IPv6Address$Companion$parseOrNull$bytes$2 = 0; collection.add(Byte.valueOf(UStringsKt.toUByte(CollectionsKt.joinToString$default(list, "", null, null, 0, null, null, 62, null), 16)));
/* 95 */       }  byte[] bytes = CollectionsKt.toByteArray(destination$iv$iv);
/*    */       return new IPv6Address(bytes); }
/*    */ 
/*    */     
/*    */     public final boolean check(@NotNull String ip) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'ip'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_1
/*    */       //   7: checkcast java/lang/CharSequence
/*    */       //   10: ldc ':::'
/*    */       //   12: checkcast java/lang/CharSequence
/*    */       //   15: iconst_0
/*    */       //   16: iconst_2
/*    */       //   17: aconst_null
/*    */       //   18: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */       //   21: ifeq -> 26
/*    */       //   24: iconst_0
/*    */       //   25: ireturn
/*    */       //   26: aload_1
/*    */       //   27: checkcast java/lang/CharSequence
/*    */       //   30: iconst_1
/*    */       //   31: anewarray java/lang/String
/*    */       //   34: astore_2
/*    */       //   35: aload_2
/*    */       //   36: iconst_0
/*    */       //   37: ldc '::'
/*    */       //   39: aastore
/*    */       //   40: aload_2
/*    */       //   41: iconst_0
/*    */       //   42: iconst_0
/*    */       //   43: bipush #6
/*    */       //   45: aconst_null
/*    */       //   46: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*    */       //   49: invokeinterface size : ()I
/*    */       //   54: iconst_1
/*    */       //   55: isub
/*    */       //   56: iconst_1
/*    */       //   57: if_icmple -> 62
/*    */       //   60: iconst_0
/*    */       //   61: ireturn
/*    */       //   62: aload_0
/*    */       //   63: aload_1
/*    */       //   64: invokespecial chunks : (Ljava/lang/String;)Ljava/util/List;
/*    */       //   67: astore_2
/*    */       //   68: aload_2
/*    */       //   69: invokeinterface size : ()I
/*    */       //   74: bipush #8
/*    */       //   76: if_icmpne -> 300
/*    */       //   79: aload_2
/*    */       //   80: checkcast java/lang/Iterable
/*    */       //   83: astore_3
/*    */       //   84: iconst_0
/*    */       //   85: istore #4
/*    */       //   87: aload_3
/*    */       //   88: instanceof java/util/Collection
/*    */       //   91: ifeq -> 110
/*    */       //   94: aload_3
/*    */       //   95: checkcast java/util/Collection
/*    */       //   98: invokeinterface isEmpty : ()Z
/*    */       //   103: ifeq -> 110
/*    */       //   106: iconst_1
/*    */       //   107: goto -> 169
/*    */       //   110: aload_3
/*    */       //   111: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   116: astore #5
/*    */       //   118: aload #5
/*    */       //   120: invokeinterface hasNext : ()Z
/*    */       //   125: ifeq -> 168
/*    */       //   128: aload #5
/*    */       //   130: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   135: astore #6
/*    */       //   137: aload #6
/*    */       //   139: checkcast java/lang/String
/*    */       //   142: astore #7
/*    */       //   144: iconst_0
/*    */       //   145: istore #8
/*    */       //   147: aload #7
/*    */       //   149: invokevirtual length : ()I
/*    */       //   152: iconst_4
/*    */       //   153: if_icmpgt -> 160
/*    */       //   156: iconst_1
/*    */       //   157: goto -> 161
/*    */       //   160: iconst_0
/*    */       //   161: ifne -> 118
/*    */       //   164: iconst_0
/*    */       //   165: goto -> 169
/*    */       //   168: iconst_1
/*    */       //   169: ifeq -> 300
/*    */       //   172: aload_2
/*    */       //   173: checkcast java/lang/Iterable
/*    */       //   176: astore_3
/*    */       //   177: iconst_0
/*    */       //   178: istore #4
/*    */       //   180: aload_3
/*    */       //   181: instanceof java/util/Collection
/*    */       //   184: ifeq -> 203
/*    */       //   187: aload_3
/*    */       //   188: checkcast java/util/Collection
/*    */       //   191: invokeinterface isEmpty : ()Z
/*    */       //   196: ifeq -> 203
/*    */       //   199: iconst_1
/*    */       //   200: goto -> 293
/*    */       //   203: aload_3
/*    */       //   204: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   209: astore #5
/*    */       //   211: aload #5
/*    */       //   213: invokeinterface hasNext : ()Z
/*    */       //   218: ifeq -> 292
/*    */       //   221: aload #5
/*    */       //   223: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   228: astore #6
/*    */       //   230: aload #6
/*    */       //   232: checkcast java/lang/String
/*    */       //   235: astore #7
/*    */       //   237: iconst_0
/*    */       //   238: istore #8
/*    */       //   240: new kotlin/ranges/IntRange
/*    */       //   243: dup
/*    */       //   244: iconst_0
/*    */       //   245: ldc 65535
/*    */       //   247: invokespecial <init> : (II)V
/*    */       //   250: astore #9
/*    */       //   252: aload #7
/*    */       //   254: bipush #16
/*    */       //   256: invokestatic toIntOrNull : (Ljava/lang/String;I)Ljava/lang/Integer;
/*    */       //   259: astore #10
/*    */       //   261: aload #10
/*    */       //   263: ifnull -> 283
/*    */       //   266: aload #9
/*    */       //   268: aload #10
/*    */       //   270: invokevirtual intValue : ()I
/*    */       //   273: invokevirtual contains : (I)Z
/*    */       //   276: ifeq -> 283
/*    */       //   279: iconst_1
/*    */       //   280: goto -> 284
/*    */       //   283: iconst_0
/*    */       //   284: nop
/*    */       //   285: ifne -> 211
/*    */       //   288: iconst_0
/*    */       //   289: goto -> 293
/*    */       //   292: iconst_1
/*    */       //   293: ifeq -> 300
/*    */       //   296: iconst_1
/*    */       //   297: goto -> 301
/*    */       //   300: iconst_0
/*    */       //   301: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #25	-> 6
/*    */       //   #26	-> 26
/*    */       //   #27	-> 62
/*    */       //   #29	-> 68
/*    */       //   #83	-> 87
/*    */       //   #84	-> 110
/*    */       //   #29	-> 147
/*    */       //   #84	-> 161
/*    */       //   #85	-> 168
/*    */       //   #29	-> 169
/*    */       //   #83	-> 180
/*    */       //   #84	-> 203
/*    */       //   #29	-> 240
/*    */       //   #29	-> 284
/*    */       //   #84	-> 285
/*    */       //   #85	-> 292
/*    */       //   #29	-> 293
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   147	14	8	$i$a$-all-IPv6Address$Companion$check$1	I
/*    */       //   144	17	7	it	Ljava/lang/String;
/*    */       //   137	31	6	element$iv	Ljava/lang/Object;
/*    */       //   87	82	4	$i$f$all	I
/*    */       //   84	85	3	$this$all$iv	Ljava/lang/Iterable;
/*    */       //   240	45	8	$i$a$-all-IPv6Address$Companion$check$2	I
/*    */       //   237	48	7	it	Ljava/lang/String;
/*    */       //   230	62	6	element$iv	Ljava/lang/Object;
/*    */       //   180	113	4	$i$f$all	I
/*    */       //   177	116	3	$this$all$iv	Ljava/lang/Iterable;
/*    */       //   68	234	2	parts	Ljava/util/List;
/*    */       //   0	302	0	this	Lai/grazie/model/cloud/ip/IPv6Address$Companion;
/*    */       //   0	302	1	ip	Ljava/lang/String;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final IPv6Address parse(@NotNull String ip) {
/*    */       Intrinsics.checkNotNullParameter(ip, "ip");
/*    */       if (parseOrNull(ip) == null) {
/*    */         parseOrNull(ip);
/*    */         throw new IllegalStateException(("Invalid IPv6 address: " + ip).toString());
/*    */       } 
/*    */       return parseOrNull(ip);
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\r\n\000\n\002\020 \n\002\020\005\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "chunk", "", "", "invoke"})
/*    */   static final class IPv6Address$display$1 extends Lambda implements Function1<List<? extends Byte>, CharSequence> {
/*    */     public static final IPv6Address$display$1 INSTANCE = new IPv6Address$display$1();
/*    */     
/*    */     IPv6Address$display$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     public final CharSequence invoke(List chunk) {
/*    */       Intrinsics.checkNotNullParameter(chunk, "chunk");
/*    */       return CollectionsKt.joinToString$default(chunk, "", null, null, 0, null, null.INSTANCE, 30, null);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (IPv6Address)other;
/*    */     if (!Arrays.equals(getBytes(), ((IPv6Address)other).getBytes()))
/*    */       return false; 
/*    */     return Intrinsics.areEqual(getDisplay(), ((IPv6Address)other).getDisplay());
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = Arrays.hashCode(getBytes());
/*    */     result = 31 * result + getDisplay().hashCode();
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final byte[] component1() {
/*    */     return this.bytes;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IPv6Address copy(@NotNull byte[] bytes) {
/*    */     Intrinsics.checkNotNullParameter(bytes, "bytes");
/*    */     return new IPv6Address(bytes);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "IPv6Address(bytes=" + Arrays.toString(this.bytes) + ")";
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ip\IPv6Address.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */