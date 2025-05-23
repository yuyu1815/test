/*    */ package ai.grazie.utils.mpp;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\021\n\002\020\016\n\002\b\b\n\002\020 \n\002\b\004\030\0002\0020\001B\033\b\026\022\022\020\002\032\n\022\006\b\001\022\0020\0040\003\"\0020\004¢\006\002\020\005B\017\b\026\022\006\020\002\032\0020\004¢\006\002\020\006B\027\b\026\022\006\020\002\032\0020\000\022\006\020\007\032\0020\004¢\006\002\020\bB\027\b\026\022\006\020\002\032\0020\000\022\006\020\t\032\0020\000¢\006\002\020\nB\027\b\026\022\006\020\007\032\0020\004\022\006\020\002\032\0020\000¢\006\002\020\013B\023\022\f\020\f\032\b\022\004\022\0020\0040\r¢\006\002\020\016J\006\020\017\032\0020\004J\006\020\020\032\0020\004R\024\020\f\032\b\022\004\022\0020\0040\rX\004¢\006\002\n\000¨\006\021"}, d2 = {"Lai/grazie/utils/mpp/DataLoader$Path;", "", "path", "", "", "([Ljava/lang/String;)V", "(Ljava/lang/String;)V", "part", "(Lai/grazie/utils/mpp/DataLoader$Path;Ljava/lang/String;)V", "otherPath", "(Lai/grazie/utils/mpp/DataLoader$Path;Lai/grazie/utils/mpp/DataLoader$Path;)V", "(Ljava/lang/String;Lai/grazie/utils/mpp/DataLoader$Path;)V", "parts", "", "(Ljava/util/List;)V", "toAbsolutePath", "toRelativePath", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nLoaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Loaders.kt\nai/grazie/utils/mpp/DataLoader$Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n1557#2:80\n1628#2,3:81\n774#2:84\n865#2,2:85\n10065#3:87\n10487#3,5:88\n*S KotlinDebug\n*F\n+ 1 Loaders.kt\nai/grazie/utils/mpp/DataLoader$Path\n*L\n6#1:80\n6#1:81,3\n6#1:84\n6#1:85,2\n8#1:87\n8#1:88,5\n*E\n"})
/*    */ public final class Path {
/*    */   public Path(@NotNull List parts) {
/*  6 */     List list1 = parts; Path path = this; int $i$f$map = 0;
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
/* 80 */     List list2 = list1; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 81 */     for (Object item$iv$iv : list2) {
/* 82 */       String str = (String)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-DataLoader$Path$parts$1 = 0; char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; collection1.add(StringsKt.trim(StringsKt.trim(str).toString(), arrayOfChar));
/* 83 */     }  Iterable $this$map$iv = collection; path = path; int $i$f$filter = 0;
/* 84 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 85 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-DataLoader$Path$parts$2 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 86 */      path.parts = (List)destination$iv$iv;
/*    */   }
/*    */   @NotNull
/*    */   private final List<String> parts;
/*    */   
/*    */   public Path(@NotNull String... path) {
/* 92 */     this((List<String>)destination$iv$iv);
/*    */   }
/*    */   
/*    */   public Path(@NotNull String path) {
/*    */     this(StringsKt.split$default(path, arrayOfString, false, 0, 6, null));
/*    */   }
/*    */   
/*    */   public Path(@NotNull Path path, @NotNull String part) {
/*    */     this(CollectionsKt.plus(path.parts, part));
/*    */   }
/*    */   
/*    */   public Path(@NotNull Path path, @NotNull Path otherPath) {
/*    */     this(CollectionsKt.plus(path.parts, otherPath.parts));
/*    */   }
/*    */   
/*    */   public Path(@NotNull String part, @NotNull Path path) {
/*    */     this(CollectionsKt.plus(CollectionsKt.listOf(part), path.parts));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String toRelativePath() {
/*    */     return CollectionsKt.joinToString$default(this.parts, "/", null, null, 0, null, null, 62, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String toAbsolutePath() {
/*    */     return CollectionsKt.joinToString$default(this.parts, "/", "/", null, 0, null, null, 60, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\DataLoader$Path.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */