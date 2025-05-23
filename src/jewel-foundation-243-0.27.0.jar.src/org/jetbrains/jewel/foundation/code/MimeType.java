/*     */ package org.jetbrains.jewel.foundation.code;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\024\n\002\020\b\n\002\b\005\b@\030\000 #2\0020\001:\002#$B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\r\020\006\032\0020\003¢\006\004\b\007\020\005J\017\020\b\032\0020\003H\002¢\006\004\b\t\020\005J\027\020\n\032\0020\0132\006\020\f\032\0020\003H\002¢\006\004\b\r\020\016J\r\020\017\032\0020\000¢\006\004\b\020\020\005J\021\020\021\032\004\030\0010\003H\000¢\006\004\b\022\020\005J\021\020\023\032\004\030\0010\003H\002¢\006\004\b\024\020\005J\031\020\025\032\004\030\0010\0032\006\020\026\032\0020\003H\002¢\006\004\b\027\020\030J\017\020\031\032\0020\003H\026¢\006\004\b\032\020\005J\032\020\033\032\0020\0132\b\020\034\032\004\030\0010\001HÖ\003¢\006\004\b\035\020\036J\020\020\037\032\0020 HÖ\001¢\006\004\b!\020\"R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006%"}, d2 = {"Lorg/jetbrains/jewel/foundation/code/MimeType;", "", "mimeType", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "displayName", "displayName-impl", "normalizeString", "normalizeString-impl", "isRelevantAttribute", "", "attribute", "isRelevantAttribute-impl", "(Ljava/lang/String;Ljava/lang/String;)Z", "base", "base-9EQw4cI", "getRole", "getRole-impl$foundation", "getFolderType", "getFolderType-impl", "getAttribute", "name", "getAttribute-impl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toString", "toString-impl", "equals", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "Companion", "Known", "foundation"})
/*     */ public final class MimeType {
/*     */   @NotNull
/*     */   private static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String mimeType;
/*     */   @Deprecated
/*     */   @NotNull
/*     */   public static final String ATTR_ROLE = "role";
/*     */   @Deprecated
/*     */   @NotNull
/*     */   public static final String ATTR_FOLDER_TYPE = "folderType";
/*     */   @Deprecated
/*     */   @NotNull
/*     */   public static final String ATTR_ROOT_TAG = "rootTag";
/*     */   @Deprecated
/*     */   @NotNull
/*     */   public static final String VALUE_RESOURCE = "resource";
/*     */   @Deprecated
/*     */   @NotNull
/*     */   public static final String VALUE_MANIFEST = "manifest";
/*     */   
/*     */   @NotNull
/*     */   public static final String displayName-impl(String arg0) {
/*  34 */     String str1 = normalizeString-impl(arg0);
/*     */ 
/*     */ 
/*     */     
/*  38 */     String str2 = getRole-impl$foundation(arg0);
/*     */ 
/*     */     
/*  41 */     if (Intrinsics.areEqual(str2, "resource")) {
/*  42 */       String folderType = getAttribute-impl(arg0, "folderType");
/*  43 */       if (folderType == null || MimeTypeKt.access$capitalizeAsciiOnly(folderType) == null) MimeTypeKt.access$capitalizeAsciiOnly(folderType); 
/*     */     } else {
/*     */     
/*  46 */     }  return Intrinsics.areEqual(str1, Known.INSTANCE.getKOTLIN-9EQw4cI()) ? (MimeTypeKt.isGradle-KcqRzx0(arg0) ? "Gradle DSL" : "Kotlin") : (Intrinsics.areEqual(str1, Known.INSTANCE.getJAVA-9EQw4cI()) ? "Java" : (Intrinsics.areEqual(str1, Known.INSTANCE.getXML-9EQw4cI()) ? ((str2 == null) ? "XML" : (Intrinsics.areEqual(str2, "manifest") ? "Manifest" : "XML")) : (
/*     */ 
/*     */ 
/*     */       
/*  50 */       Intrinsics.areEqual(str1, Known.INSTANCE.getJSON-9EQw4cI()) ? "JSON" : (
/*  51 */       Intrinsics.areEqual(str1, Known.INSTANCE.getTEXT-9EQw4cI()) ? "Text" : (
/*  52 */       Intrinsics.areEqual(str1, Known.INSTANCE.getREGEX-9EQw4cI()) ? "Regular Expression" : (
/*  53 */       Intrinsics.areEqual(str1, Known.INSTANCE.getGROOVY-9EQw4cI()) ? (MimeTypeKt.isGradle-KcqRzx0(arg0) ? "Gradle" : "Groovy") : (
/*  54 */       Intrinsics.areEqual(str1, Known.INSTANCE.getTOML-9EQw4cI()) ? (MimeTypeKt.isVersionCatalog-KcqRzx0(arg0) ? "Version Catalog" : "TOML") : (
/*  55 */       Intrinsics.areEqual(str1, Known.INSTANCE.getC-9EQw4cI()) ? "C" : (
/*  56 */       Intrinsics.areEqual(str1, Known.INSTANCE.getCPP-9EQw4cI()) ? "C++" : (
/*  57 */       Intrinsics.areEqual(str1, Known.INSTANCE.getSVG-9EQw4cI()) ? "SVG" : (
/*  58 */       Intrinsics.areEqual(str1, Known.INSTANCE.getAIDL-9EQw4cI()) ? "AIDL" : (
/*  59 */       Intrinsics.areEqual(str1, Known.INSTANCE.getSQL-9EQw4cI()) ? "SQL" : (
/*  60 */       Intrinsics.areEqual(str1, Known.INSTANCE.getPROGUARD-9EQw4cI()) ? "Shrinker Config" : (
/*  61 */       Intrinsics.areEqual(str1, Known.INSTANCE.getPROPERTIES-9EQw4cI()) ? "Properties" : (
/*  62 */       Intrinsics.areEqual(str1, Known.INSTANCE.getPROTO-9EQw4cI()) ? "Protobuf" : (
/*  63 */       Intrinsics.areEqual(str1, Known.INSTANCE.getPYTHON-9EQw4cI()) ? "Python" : (
/*  64 */       Intrinsics.areEqual(str1, Known.INSTANCE.getDART-9EQw4cI()) ? "Dart" : (
/*  65 */       Intrinsics.areEqual(str1, Known.INSTANCE.getRUST-9EQw4cI()) ? "Rust" : (
/*  66 */       Intrinsics.areEqual(str1, Known.INSTANCE.getJAVASCRIPT-9EQw4cI()) ? "JavaScript" : (
/*  67 */       Intrinsics.areEqual(str1, Known.INSTANCE.getAGSL-9EQw4cI()) ? "Android Graphics Shading Language" : (
/*  68 */       Intrinsics.areEqual(str1, Known.INSTANCE.getSHELL-9EQw4cI()) ? "Shell Script" : (
/*  69 */       Intrinsics.areEqual(str1, Known.INSTANCE.getYAML-9EQw4cI()) ? "YAML" : (
/*  70 */       Intrinsics.areEqual(str1, Known.INSTANCE.getGO-9EQw4cI()) ? "Go" : 
/*  71 */       arg0)))))))))))))))))))))));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String normalizeString-impl(String arg0) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_1
/*     */     //   2: aload_1
/*     */     //   3: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   6: invokevirtual getKOTLIN-9EQw4cI : ()Ljava/lang/String;
/*     */     //   9: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   12: ifne -> 405
/*     */     //   15: aload_1
/*     */     //   16: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   19: invokevirtual getJAVA-9EQw4cI : ()Ljava/lang/String;
/*     */     //   22: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   25: ifne -> 405
/*     */     //   28: aload_1
/*     */     //   29: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   32: invokevirtual getTEXT-9EQw4cI : ()Ljava/lang/String;
/*     */     //   35: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   38: ifne -> 405
/*     */     //   41: aload_1
/*     */     //   42: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   45: invokevirtual getXML-9EQw4cI : ()Ljava/lang/String;
/*     */     //   48: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   51: ifne -> 405
/*     */     //   54: aload_1
/*     */     //   55: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   58: invokevirtual getPROPERTIES-9EQw4cI : ()Ljava/lang/String;
/*     */     //   61: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   64: ifne -> 405
/*     */     //   67: aload_1
/*     */     //   68: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   71: invokevirtual getTOML-9EQw4cI : ()Ljava/lang/String;
/*     */     //   74: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   77: ifne -> 405
/*     */     //   80: aload_1
/*     */     //   81: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   84: invokevirtual getJSON-9EQw4cI : ()Ljava/lang/String;
/*     */     //   87: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   90: ifne -> 405
/*     */     //   93: aload_1
/*     */     //   94: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   97: invokevirtual getREGEX-9EQw4cI : ()Ljava/lang/String;
/*     */     //   100: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   103: ifne -> 405
/*     */     //   106: aload_1
/*     */     //   107: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   110: invokevirtual getGROOVY-9EQw4cI : ()Ljava/lang/String;
/*     */     //   113: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   116: ifne -> 405
/*     */     //   119: aload_1
/*     */     //   120: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   123: invokevirtual getC-9EQw4cI : ()Ljava/lang/String;
/*     */     //   126: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   129: ifne -> 405
/*     */     //   132: aload_1
/*     */     //   133: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   136: invokevirtual getCPP-9EQw4cI : ()Ljava/lang/String;
/*     */     //   139: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   142: ifne -> 405
/*     */     //   145: aload_1
/*     */     //   146: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   149: invokevirtual getSVG-9EQw4cI : ()Ljava/lang/String;
/*     */     //   152: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   155: ifne -> 405
/*     */     //   158: aload_1
/*     */     //   159: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   162: invokevirtual getAIDL-9EQw4cI : ()Ljava/lang/String;
/*     */     //   165: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   168: ifne -> 405
/*     */     //   171: aload_1
/*     */     //   172: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   175: invokevirtual getPROTO-9EQw4cI : ()Ljava/lang/String;
/*     */     //   178: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   181: ifne -> 405
/*     */     //   184: aload_1
/*     */     //   185: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   188: invokevirtual getSQL-9EQw4cI : ()Ljava/lang/String;
/*     */     //   191: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   194: ifne -> 405
/*     */     //   197: aload_1
/*     */     //   198: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   201: invokevirtual getPROGUARD-9EQw4cI : ()Ljava/lang/String;
/*     */     //   204: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   207: ifne -> 405
/*     */     //   210: aload_1
/*     */     //   211: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   214: invokevirtual getMANIFEST-9EQw4cI : ()Ljava/lang/String;
/*     */     //   217: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   220: ifne -> 405
/*     */     //   223: aload_1
/*     */     //   224: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   227: invokevirtual getRESOURCE-9EQw4cI : ()Ljava/lang/String;
/*     */     //   230: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   233: ifne -> 405
/*     */     //   236: aload_1
/*     */     //   237: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   240: invokevirtual getGRADLE-9EQw4cI : ()Ljava/lang/String;
/*     */     //   243: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   246: ifne -> 405
/*     */     //   249: aload_1
/*     */     //   250: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   253: invokevirtual getGRADLE_KTS-9EQw4cI : ()Ljava/lang/String;
/*     */     //   256: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   259: ifne -> 405
/*     */     //   262: aload_1
/*     */     //   263: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   266: invokevirtual getVERSION_CATALOG-9EQw4cI : ()Ljava/lang/String;
/*     */     //   269: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   272: ifne -> 405
/*     */     //   275: aload_1
/*     */     //   276: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   279: invokevirtual getPYTHON-9EQw4cI : ()Ljava/lang/String;
/*     */     //   282: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   285: ifne -> 405
/*     */     //   288: aload_1
/*     */     //   289: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   292: invokevirtual getDART-9EQw4cI : ()Ljava/lang/String;
/*     */     //   295: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   298: ifne -> 405
/*     */     //   301: aload_1
/*     */     //   302: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   305: invokevirtual getRUST-9EQw4cI : ()Ljava/lang/String;
/*     */     //   308: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   311: ifne -> 405
/*     */     //   314: aload_1
/*     */     //   315: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   318: invokevirtual getJAVASCRIPT-9EQw4cI : ()Ljava/lang/String;
/*     */     //   321: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   324: ifne -> 405
/*     */     //   327: aload_1
/*     */     //   328: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   331: invokevirtual getTYPESCRIPT-9EQw4cI : ()Ljava/lang/String;
/*     */     //   334: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   337: ifne -> 405
/*     */     //   340: aload_1
/*     */     //   341: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   344: invokevirtual getAGSL-9EQw4cI : ()Ljava/lang/String;
/*     */     //   347: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   350: ifne -> 405
/*     */     //   353: aload_1
/*     */     //   354: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   357: invokevirtual getSHELL-9EQw4cI : ()Ljava/lang/String;
/*     */     //   360: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   363: ifne -> 405
/*     */     //   366: aload_1
/*     */     //   367: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   370: invokevirtual getYAML-9EQw4cI : ()Ljava/lang/String;
/*     */     //   373: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   376: ifne -> 405
/*     */     //   379: aload_1
/*     */     //   380: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   383: invokevirtual getGO-9EQw4cI : ()Ljava/lang/String;
/*     */     //   386: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   389: ifne -> 405
/*     */     //   392: aload_1
/*     */     //   393: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   396: invokevirtual getUNKNOWN-9EQw4cI : ()Ljava/lang/String;
/*     */     //   399: invokestatic equals-impl0 : (Ljava/lang/String;Ljava/lang/String;)Z
/*     */     //   402: ifeq -> 407
/*     */     //   405: aload_0
/*     */     //   406: areturn
/*     */     //   407: aload_0
/*     */     //   408: checkcast java/lang/CharSequence
/*     */     //   411: bipush #59
/*     */     //   413: iconst_0
/*     */     //   414: iconst_0
/*     */     //   415: bipush #6
/*     */     //   417: aconst_null
/*     */     //   418: invokestatic indexOf$default : (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
/*     */     //   421: istore_1
/*     */     //   422: iload_1
/*     */     //   423: iconst_m1
/*     */     //   424: if_icmpne -> 431
/*     */     //   427: aload_0
/*     */     //   428: goto -> 443
/*     */     //   431: aload_0
/*     */     //   432: iconst_0
/*     */     //   433: iload_1
/*     */     //   434: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   437: dup
/*     */     //   438: ldc 'substring(...)'
/*     */     //   440: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   443: astore_3
/*     */     //   444: aload_3
/*     */     //   445: invokevirtual hashCode : ()I
/*     */     //   448: lookupswitch default -> 1186, -1938871656 -> 1000, -1860883247 -> 724, -1809365313 -> 820, -1786494349 -> 1013, -1248326952 -> 700, -1082380511 -> 857, -803922150 -> 772, -723118015 -> 909, -261457194 -> 1052, -261278343 -> 784, -261020869 -> 748, -261000696 -> 1039, -260831746 -> 760, -227171396 -> 736, -105630993 -> 844, -44036898 -> 1065, -43840953 -> 883, -43411450 -> 974, 205126536 -> 987, 302663708 -> 796, 454428157 -> 935, 516492528 -> 1026, 886992732 -> 712, 994470943 -> 832, 1154342227 -> 870, 1154521078 -> 896, 1154778552 -> 948, 1154967675 -> 961, 1440428940 -> 808, 1514357736 -> 922
/*     */     //   700: aload_3
/*     */     //   701: ldc 'application/xml'
/*     */     //   703: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   706: ifne -> 1096
/*     */     //   709: goto -> 1186
/*     */     //   712: aload_3
/*     */     //   713: ldc 'application/ld+json'
/*     */     //   715: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   718: ifne -> 1105
/*     */     //   721: goto -> 1186
/*     */     //   724: aload_3
/*     */     //   725: ldc 'application/x-ecmascript'
/*     */     //   727: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   730: ifne -> 1141
/*     */     //   733: goto -> 1186
/*     */     //   736: aload_3
/*     */     //   737: ldc 'image/svg+xml'
/*     */     //   739: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   742: ifne -> 1114
/*     */     //   745: goto -> 1186
/*     */     //   748: aload_3
/*     */     //   749: ldc 'text/x-rust'
/*     */     //   751: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   754: ifne -> 1159
/*     */     //   757: goto -> 1186
/*     */     //   760: aload_3
/*     */     //   761: ldc 'text/x-yaml'
/*     */     //   763: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   766: ifne -> 1177
/*     */     //   769: goto -> 1186
/*     */     //   772: aload_3
/*     */     //   773: ldc 'application/vnd.api+json'
/*     */     //   775: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   778: ifne -> 1105
/*     */     //   781: goto -> 1186
/*     */     //   784: aload_3
/*     */     //   785: ldc 'text/x-java'
/*     */     //   787: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   790: ifne -> 1078
/*     */     //   793: goto -> 1186
/*     */     //   796: aload_3
/*     */     //   797: ldc 'application/ecmascript'
/*     */     //   799: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   802: ifne -> 1141
/*     */     //   805: goto -> 1186
/*     */     //   808: aload_3
/*     */     //   809: ldc 'application/javascript'
/*     */     //   811: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   814: ifne -> 1141
/*     */     //   817: goto -> 1186
/*     */     //   820: aload_3
/*     */     //   821: ldc 'application/hal+json'
/*     */     //   823: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   826: ifne -> 1105
/*     */     //   829: goto -> 1186
/*     */     //   832: aload_3
/*     */     //   833: ldc 'text/ecmascript'
/*     */     //   835: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   838: ifne -> 1141
/*     */     //   841: goto -> 1186
/*     */     //   844: aload_3
/*     */     //   845: ldc_w 'text/x-java-source'
/*     */     //   848: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   851: ifne -> 1078
/*     */     //   854: goto -> 1186
/*     */     //   857: aload_3
/*     */     //   858: ldc_w 'text/dart'
/*     */     //   861: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   864: ifne -> 1132
/*     */     //   867: goto -> 1186
/*     */     //   870: aload_3
/*     */     //   871: ldc_w 'application/x-dart'
/*     */     //   874: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   877: ifne -> 1132
/*     */     //   880: goto -> 1186
/*     */     //   883: aload_3
/*     */     //   884: ldc_w 'application/json'
/*     */     //   887: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   890: ifne -> 1105
/*     */     //   893: goto -> 1186
/*     */     //   896: aload_3
/*     */     //   897: ldc_w 'application/x-java'
/*     */     //   900: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   903: ifne -> 1078
/*     */     //   906: goto -> 1186
/*     */     //   909: aload_3
/*     */     //   910: ldc_w 'application/x-javascript'
/*     */     //   913: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   916: ifne -> 1141
/*     */     //   919: goto -> 1186
/*     */     //   922: aload_3
/*     */     //   923: ldc_w 'application/kotlin-source'
/*     */     //   926: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   929: ifne -> 1087
/*     */     //   932: goto -> 1186
/*     */     //   935: aload_3
/*     */     //   936: ldc_w 'application/typescriptapplication/x-typescript'
/*     */     //   939: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   942: ifne -> 1150
/*     */     //   945: goto -> 1186
/*     */     //   948: aload_3
/*     */     //   949: ldc_w 'application/x-rust'
/*     */     //   952: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   955: ifne -> 1159
/*     */     //   958: goto -> 1186
/*     */     //   961: aload_3
/*     */     //   962: ldc_w 'application/x-yaml'
/*     */     //   965: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   968: ifne -> 1177
/*     */     //   971: goto -> 1186
/*     */     //   974: aload_3
/*     */     //   975: ldc_w 'application/yaml'
/*     */     //   978: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   981: ifne -> 1177
/*     */     //   984: goto -> 1186
/*     */     //   987: aload_3
/*     */     //   988: ldc_w 'application/x-python-script'
/*     */     //   991: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   994: ifne -> 1123
/*     */     //   997: goto -> 1186
/*     */     //   1000: aload_3
/*     */     //   1001: ldc_w 'text/x-kotlin'
/*     */     //   1004: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1007: ifne -> 1087
/*     */     //   1010: goto -> 1186
/*     */     //   1013: aload_3
/*     */     //   1014: ldc_w 'text/x-python'
/*     */     //   1017: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1020: ifne -> 1123
/*     */     //   1023: goto -> 1186
/*     */     //   1026: aload_3
/*     */     //   1027: ldc_w 'text/x-kotlin-source'
/*     */     //   1030: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1033: ifne -> 1087
/*     */     //   1036: goto -> 1186
/*     */     //   1039: aload_3
/*     */     //   1040: ldc_w 'text/x-sksl'
/*     */     //   1043: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1046: ifne -> 1168
/*     */     //   1049: goto -> 1186
/*     */     //   1052: aload_3
/*     */     //   1053: ldc_w 'text/x-dart'
/*     */     //   1056: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1059: ifne -> 1132
/*     */     //   1062: goto -> 1186
/*     */     //   1065: aload_3
/*     */     //   1066: ldc_w 'application/dart'
/*     */     //   1069: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1072: ifne -> 1132
/*     */     //   1075: goto -> 1186
/*     */     //   1078: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1081: invokevirtual getJAVA-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1084: goto -> 1187
/*     */     //   1087: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1090: invokevirtual getKOTLIN-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1093: goto -> 1187
/*     */     //   1096: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1099: invokevirtual getXML-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1102: goto -> 1187
/*     */     //   1105: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1108: invokevirtual getJSON-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1111: goto -> 1187
/*     */     //   1114: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1117: invokevirtual getXML-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1120: goto -> 1187
/*     */     //   1123: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1126: invokevirtual getPYTHON-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1129: goto -> 1187
/*     */     //   1132: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1135: invokevirtual getDART-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1138: goto -> 1187
/*     */     //   1141: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1144: invokevirtual getJAVASCRIPT-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1147: goto -> 1187
/*     */     //   1150: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1153: invokevirtual getTYPESCRIPT-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1156: goto -> 1187
/*     */     //   1159: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1162: invokevirtual getRUST-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1165: goto -> 1187
/*     */     //   1168: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1171: invokevirtual getAGSL-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1174: goto -> 1187
/*     */     //   1177: getstatic org/jetbrains/jewel/foundation/code/MimeType$Known.INSTANCE : Lorg/jetbrains/jewel/foundation/code/MimeType$Known;
/*     */     //   1180: invokevirtual getYAML-9EQw4cI : ()Ljava/lang/String;
/*     */     //   1183: goto -> 1187
/*     */     //   1186: aload_3
/*     */     //   1187: astore_2
/*     */     //   1188: iload_1
/*     */     //   1189: iconst_m1
/*     */     //   1190: if_icmpne -> 1195
/*     */     //   1193: aload_2
/*     */     //   1194: areturn
/*     */     //   1195: aload_0
/*     */     //   1196: checkcast java/lang/CharSequence
/*     */     //   1199: iconst_1
/*     */     //   1200: newarray char
/*     */     //   1202: astore #4
/*     */     //   1204: aload #4
/*     */     //   1206: iconst_0
/*     */     //   1207: bipush #59
/*     */     //   1209: castore
/*     */     //   1210: aload #4
/*     */     //   1212: iconst_0
/*     */     //   1213: iconst_0
/*     */     //   1214: bipush #6
/*     */     //   1216: aconst_null
/*     */     //   1217: invokestatic split$default : (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   1220: checkcast java/lang/Iterable
/*     */     //   1223: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*     */     //   1226: iconst_1
/*     */     //   1227: invokestatic drop : (Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;
/*     */     //   1230: invokestatic sorted : (Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
/*     */     //   1233: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1238: invokestatic mapNotNull : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   1241: aload_0
/*     */     //   1242: <illegal opcode> invoke : (Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*     */     //   1247: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   1250: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1255: invokestatic map : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   1258: ldc_w '; '
/*     */     //   1261: checkcast java/lang/CharSequence
/*     */     //   1264: aconst_null
/*     */     //   1265: aconst_null
/*     */     //   1266: iconst_0
/*     */     //   1267: aconst_null
/*     */     //   1268: aconst_null
/*     */     //   1269: bipush #62
/*     */     //   1271: aconst_null
/*     */     //   1272: invokestatic joinToString$default : (Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1275: astore_3
/*     */     //   1276: aload_3
/*     */     //   1277: checkcast java/lang/CharSequence
/*     */     //   1280: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   1283: ifne -> 1290
/*     */     //   1286: iconst_1
/*     */     //   1287: goto -> 1291
/*     */     //   1290: iconst_0
/*     */     //   1291: ifeq -> 1304
/*     */     //   1294: aload_2
/*     */     //   1295: aload_3
/*     */     //   1296: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1301: goto -> 1305
/*     */     //   1304: aload_2
/*     */     //   1305: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #75	-> 0
/*     */     //   #77	-> 2
/*     */     //   #78	-> 15
/*     */     //   #79	-> 28
/*     */     //   #80	-> 41
/*     */     //   #81	-> 54
/*     */     //   #82	-> 67
/*     */     //   #83	-> 80
/*     */     //   #84	-> 93
/*     */     //   #85	-> 106
/*     */     //   #86	-> 119
/*     */     //   #87	-> 132
/*     */     //   #88	-> 145
/*     */     //   #89	-> 158
/*     */     //   #90	-> 171
/*     */     //   #91	-> 184
/*     */     //   #92	-> 197
/*     */     //   #93	-> 210
/*     */     //   #94	-> 223
/*     */     //   #95	-> 236
/*     */     //   #96	-> 249
/*     */     //   #97	-> 262
/*     */     //   #98	-> 275
/*     */     //   #99	-> 288
/*     */     //   #100	-> 301
/*     */     //   #101	-> 314
/*     */     //   #102	-> 327
/*     */     //   #103	-> 340
/*     */     //   #104	-> 353
/*     */     //   #105	-> 366
/*     */     //   #106	-> 379
/*     */     //   #107	-> 392
/*     */     //   #110	-> 407
/*     */     //   #112	-> 422
/*     */     //   #112	-> 443
/*     */     //   #115	-> 1078
/*     */     //   #119	-> 1087
/*     */     //   #121	-> 1096
/*     */     //   #125	-> 1105
/*     */     //   #127	-> 1114
/*     */     //   #129	-> 1123
/*     */     //   #134	-> 1132
/*     */     //   #140	-> 1141
/*     */     //   #142	-> 1150
/*     */     //   #144	-> 1159
/*     */     //   #146	-> 1168
/*     */     //   #149	-> 1177
/*     */     //   #151	-> 1186
/*     */     //   #112	-> 1187
/*     */     //   #111	-> 1187
/*     */     //   #154	-> 1188
/*     */     //   #155	-> 1193
/*     */     //   #159	-> 1195
/*     */     //   #160	-> 1199
/*     */     //   #161	-> 1223
/*     */     //   #162	-> 1226
/*     */     //   #163	-> 1230
/*     */     //   #164	-> 1238
/*     */     //   #172	-> 1241
/*     */     //   #173	-> 1255
/*     */     //   #174	-> 1258
/*     */     //   #158	-> 1275
/*     */     //   #176	-> 1276
/*     */     //   #176	-> 1291
/*     */     //   #177	-> 1294
/*     */     //   #179	-> 1304
/*     */     //   #176	-> 1305
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   444	743	3	base	Ljava/lang/String;
/*     */     //   422	884	1	baseEnd	I
/*     */     //   1188	118	2	normalizedBase	Ljava/lang/String;
/*     */     //   1276	30	3	attributes	Ljava/lang/String;
/*     */     //   0	1306	0	arg0	Ljava/lang/String;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Pair normalizeString_impl$lambda$0(String it) {
/* 165 */     Intrinsics.checkNotNullParameter(it, "it"); int index = StringsKt.indexOf$default(it, '=', 0, false, 6, null);
/*     */     
/* 167 */     Intrinsics.checkNotNullExpressionValue(it.substring(0, index), "substring(...)"); Intrinsics.checkNotNullExpressionValue(it.substring(index + 1), "substring(...)"); return (index != -1) ? TuplesKt.to(StringsKt.trim(it.substring(0, index)).toString(), StringsKt.trim(it.substring(index + 1)).toString()) : 
/*     */       
/* 169 */       null;
/*     */   }
/*     */   
/* 172 */   private static final boolean normalizeString_impl$lambda$1(String $arg0, Pair it) { Intrinsics.checkNotNullParameter(it, "it"); return isRelevantAttribute-impl($arg0, (String)it.getFirst()); } private static final String normalizeString_impl$lambda$2(Pair it) {
/* 173 */     Intrinsics.checkNotNullParameter(it, "it"); return "" + it.getFirst() + "=" + it.getFirst();
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
/*     */   private static final boolean isRelevantAttribute-impl(String arg0, String attribute) {
/* 185 */     String str = attribute; switch (str.hashCode()) { case 3506294: if (!str.equals("role")) break; case 1380090712: if (!str.equals("rootTag")) break; case -828032824: if (str.equals("folderType"));
/*     */         break; }
/*     */ 
/*     */ 
/*     */     
/* 190 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String base-9EQw4cI(String arg0)
/*     */   {
/* 199 */     return constructor-impl(StringsKt.trim(StringsKt.substringBefore$default(arg0, ';', null, 2, null)).toString()); } @Nullable
/*     */   public static final String getRole-impl$foundation(String arg0) {
/* 201 */     return getAttribute-impl(arg0, "role");
/*     */   } private static final String getFolderType-impl(String arg0) {
/* 203 */     return getAttribute-impl(arg0, "folderType");
/*     */   }
/*     */   private static final String getAttribute-impl(String arg0, String name) {
/* 206 */     String marker = name + "=";
/* 207 */     int start = StringsKt.indexOf$default(arg0, marker, 0, false, 6, null);
/* 208 */     if (start == -1) {
/* 209 */       return null;
/*     */     }
/* 211 */     start += marker.length();
/* 212 */     int end = start;
/* 213 */     while (end < arg0.length() && !CharsKt.isWhitespace(arg0.charAt(end))) {
/* 214 */       end++;
/*     */     }
/* 216 */     Intrinsics.checkNotNullExpressionValue(arg0.substring(start, end), "substring(...)"); return StringsKt.removeSurrounding(arg0.substring(start, end), "\"");
/*     */   }
/*     */   @NotNull
/* 219 */   public static String toString-impl(String arg0) { return arg0; } public static int hashCode-impl(String arg0) { return arg0.hashCode(); } public int hashCode() { return hashCode-impl(this.mimeType); } public static boolean equals-impl(String arg0, Object other) { return !(other instanceof MimeType) ? false : (!!Intrinsics.areEqual(arg0, ((MimeType)other).unbox-impl())); } public boolean equals(Object other) { return equals-impl(this.mimeType, other); } @NotNull public String toString() { return toString-impl(this.mimeType); }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static String constructor-impl(@NotNull String mimeType) {
/*     */     Intrinsics.checkNotNullParameter(mimeType, "mimeType");
/*     */     return mimeType;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final boolean equals-impl0(String p1, String p2) {
/*     */     return Intrinsics.areEqual(p1, p2);
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/foundation/code/MimeType$Companion;", "", "<init>", "()V", "ATTR_ROLE", "", "ATTR_FOLDER_TYPE", "ATTR_ROOT_TAG", "VALUE_RESOURCE", "VALUE_MANIFEST", "foundation"})
/*     */   private static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\bA\n\002\020\016\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\027\020E\032\004\030\0010\0052\006\020F\032\0020G¢\006\004\bH\020IR\023\020\004\032\0020\005¢\006\n\n\002\020\b\032\004\b\006\020\007R\023\020\t\032\0020\005¢\006\n\n\002\020\b\032\004\b\n\020\007R\023\020\013\032\0020\005¢\006\n\n\002\020\b\032\004\b\f\020\007R\023\020\r\032\0020\005¢\006\n\n\002\020\b\032\004\b\016\020\007R\023\020\017\032\0020\005¢\006\n\n\002\020\b\032\004\b\020\020\007R\023\020\021\032\0020\005¢\006\n\n\002\020\b\032\004\b\022\020\007R\023\020\023\032\0020\005¢\006\n\n\002\020\b\032\004\b\024\020\007R\023\020\025\032\0020\005¢\006\n\n\002\020\b\032\004\b\026\020\007R\023\020\027\032\0020\005¢\006\n\n\002\020\b\032\004\b\030\020\007R\023\020\031\032\0020\005¢\006\n\n\002\020\b\032\004\b\032\020\007R\023\020\033\032\0020\005¢\006\n\n\002\020\b\032\004\b\034\020\007R\023\020\035\032\0020\005¢\006\n\n\002\020\b\032\004\b\036\020\007R\023\020\037\032\0020\005¢\006\n\n\002\020\b\032\004\b \020\007R\023\020!\032\0020\005¢\006\n\n\002\020\b\032\004\b\"\020\007R\023\020#\032\0020\005¢\006\n\n\002\020\b\032\004\b$\020\007R\023\020%\032\0020\005¢\006\n\n\002\020\b\032\004\b&\020\007R\023\020'\032\0020\005¢\006\n\n\002\020\b\032\004\b(\020\007R\023\020)\032\0020\005¢\006\n\n\002\020\b\032\004\b*\020\007R\023\020+\032\0020\005¢\006\n\n\002\020\b\032\004\b,\020\007R\023\020-\032\0020\005¢\006\n\n\002\020\b\032\004\b.\020\007R\023\020/\032\0020\005¢\006\n\n\002\020\b\032\004\b0\020\007R\023\0201\032\0020\005¢\006\n\n\002\020\b\032\004\b2\020\007R\023\0203\032\0020\005¢\006\n\n\002\020\b\032\004\b4\020\007R\023\0205\032\0020\005¢\006\n\n\002\020\b\032\004\b6\020\007R\023\0207\032\0020\005¢\006\n\n\002\020\b\032\004\b8\020\007R\023\0209\032\0020\005¢\006\n\n\002\020\b\032\004\b:\020\007R\023\020;\032\0020\005¢\006\n\n\002\020\b\032\004\b<\020\007R\023\020=\032\0020\005¢\006\n\n\002\020\b\032\004\b>\020\007R\023\020?\032\0020\005¢\006\n\n\002\020\b\032\004\b@\020\007R\023\020A\032\0020\005¢\006\n\n\002\020\b\032\004\bB\020\007R\023\020C\032\0020\005¢\006\n\n\002\020\b\032\004\bD\020\007¨\006J"}, d2 = {"Lorg/jetbrains/jewel/foundation/code/MimeType$Known;", "", "<init>", "()V", "KOTLIN", "Lorg/jetbrains/jewel/foundation/code/MimeType;", "getKOTLIN-9EQw4cI", "()Ljava/lang/String;", "Ljava/lang/String;", "JAVA", "getJAVA-9EQw4cI", "TEXT", "getTEXT-9EQw4cI", "UNKNOWN", "getUNKNOWN-9EQw4cI", "XML", "getXML-9EQw4cI", "PROPERTIES", "getPROPERTIES-9EQw4cI", "TOML", "getTOML-9EQw4cI", "JSON", "getJSON-9EQw4cI", "REGEX", "getREGEX-9EQw4cI", "GROOVY", "getGROOVY-9EQw4cI", "C", "getC-9EQw4cI", "CPP", "getCPP-9EQw4cI", "SVG", "getSVG-9EQw4cI", "AIDL", "getAIDL-9EQw4cI", "PROTO", "getPROTO-9EQw4cI", "SQL", "getSQL-9EQw4cI", "PROGUARD", "getPROGUARD-9EQw4cI", "PYTHON", "getPYTHON-9EQw4cI", "JAVASCRIPT", "getJAVASCRIPT-9EQw4cI", "TYPESCRIPT", "getTYPESCRIPT-9EQw4cI", "DART", "getDART-9EQw4cI", "RUST", "getRUST-9EQw4cI", "AGSL", "getAGSL-9EQw4cI", "SHELL", "getSHELL-9EQw4cI", "YAML", "getYAML-9EQw4cI", "GO", "getGO-9EQw4cI", "RESOURCE", "getRESOURCE-9EQw4cI", "MANIFEST", "getMANIFEST-9EQw4cI", "GRADLE", "getGRADLE-9EQw4cI", "GRADLE_KTS", "getGRADLE_KTS-9EQw4cI", "VERSION_CATALOG", "getVERSION_CATALOG-9EQw4cI", "fromMarkdownLanguageName", "name", "", "fromMarkdownLanguageName-YABSuFg", "(Ljava/lang/String;)Ljava/lang/String;", "foundation"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Known
/*     */   {
/*     */     @NotNull
/* 246 */     public static final Known INSTANCE = new Known(); @NotNull private static final String KOTLIN = MimeType.constructor-impl("text/kotlin"); @NotNull public final String getKOTLIN-9EQw4cI() { return KOTLIN; }
/*     */     
/*     */     @NotNull
/* 249 */     private static final String JAVA = MimeType.constructor-impl("text/java"); @NotNull public final String getJAVA-9EQw4cI() { return JAVA; }
/*     */     
/*     */     @NotNull
/* 252 */     private static final String TEXT = MimeType.constructor-impl("text/plain"); @NotNull public final String getTEXT-9EQw4cI() { return TEXT; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/* 262 */     private static final String UNKNOWN = MimeType.constructor-impl("text/unknown"); @NotNull public final String getUNKNOWN-9EQw4cI() { return UNKNOWN; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/* 269 */     private static final String XML = MimeType.constructor-impl("text/xml"); @NotNull public final String getXML-9EQw4cI() { return XML; } @NotNull
/* 270 */     private static final String PROPERTIES = MimeType.constructor-impl("text/properties"); @NotNull public final String getPROPERTIES-9EQw4cI() { return PROPERTIES; } @NotNull
/* 271 */     private static final String TOML = MimeType.constructor-impl("text/toml"); @NotNull public final String getTOML-9EQw4cI() { return TOML; } @NotNull
/* 272 */     private static final String JSON = MimeType.constructor-impl("text/json"); @NotNull public final String getJSON-9EQw4cI() { return JSON; } @NotNull
/* 273 */     private static final String REGEX = MimeType.constructor-impl("text/x-regex-source"); @NotNull public final String getREGEX-9EQw4cI() { return REGEX; } @NotNull
/* 274 */     private static final String GROOVY = MimeType.constructor-impl("text/groovy"); @NotNull public final String getGROOVY-9EQw4cI() { return GROOVY; } @NotNull
/* 275 */     private static final String C = MimeType.constructor-impl("text/c"); @NotNull public final String getC-9EQw4cI() { return C; } @NotNull
/* 276 */     private static final String CPP = MimeType.constructor-impl("text/c++"); @NotNull public final String getCPP-9EQw4cI() { return CPP; } @NotNull
/* 277 */     private static final String SVG = MimeType.constructor-impl("image/svg+xml"); @NotNull public final String getSVG-9EQw4cI() { return SVG; } @NotNull
/* 278 */     private static final String AIDL = MimeType.constructor-impl("text/x-aidl-source"); @NotNull public final String getAIDL-9EQw4cI() { return AIDL; } @NotNull
/* 279 */     private static final String PROTO = MimeType.constructor-impl("text/x-protobuf"); @NotNull public final String getPROTO-9EQw4cI() { return PROTO; } @NotNull
/* 280 */     private static final String SQL = MimeType.constructor-impl("text/x-sql"); @NotNull public final String getSQL-9EQw4cI() { return SQL; } @NotNull
/* 281 */     private static final String PROGUARD = MimeType.constructor-impl("text/x-proguard"); @NotNull public final String getPROGUARD-9EQw4cI() { return PROGUARD; } @NotNull
/* 282 */     private static final String PYTHON = MimeType.constructor-impl("text/python"); @NotNull public final String getPYTHON-9EQw4cI() { return PYTHON; } @NotNull
/* 283 */     private static final String JAVASCRIPT = MimeType.constructor-impl("text/javascript"); @NotNull public final String getJAVASCRIPT-9EQw4cI() { return JAVASCRIPT; } @NotNull
/* 284 */     private static final String TYPESCRIPT = MimeType.constructor-impl("text/typescript"); @NotNull public final String getTYPESCRIPT-9EQw4cI() { return TYPESCRIPT; } @NotNull
/* 285 */     private static final String DART = MimeType.constructor-impl("application/dart"); @NotNull public final String getDART-9EQw4cI() { return DART; } @NotNull
/* 286 */     private static final String RUST = MimeType.constructor-impl("text/rust"); @NotNull public final String getRUST-9EQw4cI() { return RUST; } @NotNull
/* 287 */     private static final String AGSL = MimeType.constructor-impl("text/x-agsl"); @NotNull public final String getAGSL-9EQw4cI() { return AGSL; } @NotNull
/* 288 */     private static final String SHELL = MimeType.constructor-impl("application/x-sh"); @NotNull public final String getSHELL-9EQw4cI() { return SHELL; } @NotNull
/* 289 */     private static final String YAML = MimeType.constructor-impl("text/yaml"); @NotNull public final String getYAML-9EQw4cI() { return YAML; } @NotNull
/* 290 */     private static final String GO = MimeType.constructor-impl("text/go"); @NotNull public final String getGO-9EQw4cI() { return GO; }
/*     */     
/*     */     @NotNull
/* 293 */     private static final String RESOURCE = MimeType.constructor-impl(MimeType.toString-impl(XML) + "; role=resource"); @NotNull public final String getRESOURCE-9EQw4cI() { return RESOURCE; } @NotNull
/* 294 */     private static final String MANIFEST = MimeType.constructor-impl(MimeType.toString-impl(XML) + ";role=manifest rootTag=manifest"); @NotNull public final String getMANIFEST-9EQw4cI() { return MANIFEST; } @NotNull
/* 295 */     private static final String GRADLE = MimeType.constructor-impl(MimeType.toString-impl(GROOVY) + "; role=gradle"); @NotNull public final String getGRADLE-9EQw4cI() { return GRADLE; } @NotNull
/* 296 */     private static final String GRADLE_KTS = MimeType.constructor-impl(MimeType.toString-impl(KOTLIN) + "; role=gradle"); @NotNull public final String getGRADLE_KTS-9EQw4cI() { return GRADLE_KTS; } @NotNull
/* 297 */     private static final String VERSION_CATALOG = MimeType.constructor-impl(MimeType.toString-impl(TOML) + "; role=version-catalog"); public static final int $stable; @NotNull public final String getVERSION_CATALOG-9EQw4cI() { return VERSION_CATALOG; }
/*     */     
/*     */     @Nullable
/*     */     public final String fromMarkdownLanguageName-YABSuFg(@NotNull String name) {
/* 301 */       Intrinsics.checkNotNullParameter(name, "name"); String str = name; switch (str.hashCode()) { case -934799095: if (!str.equals("regexp")) break; case -989164661: if (!str.equals("protobuf")) break; case 96515: if (!str.equals("c++")) break; case 3532465: if (!str.equals("sksl")) break; case 101429325: if (!str.equals("json5")) break; case -1240339754: if (!str.equals("golang")) break; case 3593: if (!str.equals("py")) break; case 3401: if (!str.equals("js")) break; case 120911: if (!str.equals("zsh")) break; case 114126: if (!str.equals("sql")) break; case -104338729: if (!str.equals("python3")) break; case -104338730: if (!str.equals("python2")) break; case 3075967: if (!str.equals("dart")) break; case 3512292: if (!str.equals("rust")) break; case 3254818: if (!str.equals("java")) break; case 3669: if (!str.equals("sh")) break; case 118807: if (!str.equals("xml")) break; case 3271912: if (!str.equals("json")) break; case 119768: if (!str.equals("yml")) break; case -522285947: if (!str.equals("typescript")) break; case 2993840: if (!str.equals("aidl")) break; case 3701415: if (!str.equals("yaml")) break; case -973197092: if (!str.equals("python")) break; case 99: if (!str.equals("c")) break; case 114276: if (!str.equals("svg")) break; case -1125574399: if (!str.equals("kotlin")) break; case 3304: if (!str.equals("go")) break; case 3433: if (!str.equals("kt")) break; case 106538: if (!str.equals("kts")) break; case 3565914: if (!str.equals("toml")) break; case 188995949: if (!str.equals("javascript")) break; case 108392519: if (!str.equals("regex")) break; case -1237466098: if (!str.equals("groovy")) break; case 109403696: if (!str.equals("shell")) break; case 3016404: if (!str.equals("bash")) break; case -926053069: if (!str.equals("properties")) {
/*     */             break;
/*     */           } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 346 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\code\MimeType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */