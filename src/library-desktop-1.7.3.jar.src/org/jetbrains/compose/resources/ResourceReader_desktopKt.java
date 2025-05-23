/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"getPlatformResourceReader", "Lorg/jetbrains/compose/resources/ResourceReader;", "library"})
/*    */ public final class ResourceReader_desktopKt {
/*    */   @NotNull
/*  7 */   public static final ResourceReader getPlatformResourceReader() { return new ResourceReader_desktopKt$getPlatformResourceReader$1(); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0005\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\022\n\002\b\003\n\002\020\t\n\002\b\003\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\002J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\002J\020\020\b\032\0020\0072\006\020\006\032\0020\007H\026J\026\020\t\032\0020\n2\006\020\006\032\0020\007H@¢\006\002\020\013J&\020\f\032\0020\n2\006\020\006\032\0020\0072\006\020\r\032\0020\0162\006\020\017\032\0020\016H@¢\006\002\020\020J\024\020\021\032\0020\022*\0020\0052\006\020\r\032\0020\016H\002¨\006\023"}, d2 = {"org/jetbrains/compose/resources/ResourceReader_desktopKt$getPlatformResourceReader$1", "Lorg/jetbrains/compose/resources/ResourceReader;", "getClassLoader", "Ljava/lang/ClassLoader;", "getResourceAsStream", "Ljava/io/InputStream;", "path", "", "getUri", "read", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readPart", "offset", "", "size", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipBytes", "", "library"}) @SourceDebugExtension({"SMAP\nResourceReader.desktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceReader.desktop.kt\norg/jetbrains/compose/resources/ResourceReader_desktopKt$getPlatformResourceReader$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/*    */   public static final class ResourceReader_desktopKt$getPlatformResourceReader$1 implements ResourceReader { @Nullable
/*  9 */     public Object read(@NotNull String path, @NotNull Continuation $completion) { InputStream resource = getResourceAsStream(path);
/* 10 */       InputStream inputStream1 = resource; Throwable throwable = null; try { InputStream input = inputStream1;
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
/* 48 */         int $i$a$-use-ResourceReader_desktopKt$getPlatformResourceReader$1$read$2 = 0;
/*    */         byte[] arrayOfByte = ByteStreamsKt.readBytes(input); }
/*    */       catch (Throwable throwable1)
/*    */       { throwable = throwable1 = null;
/*    */         throw throwable1; }
/*    */       finally
/*    */       { CloseableKt.closeFinally(inputStream1, throwable); }
/*    */       
/*    */       return arrayOfByte; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public Object readPart(@NotNull String path, long offset, long size, @NotNull Continuation $completion) {
/*    */       InputStream resource = getResourceAsStream(path);
/*    */       byte[] result = new byte[(int)size];
/*    */       InputStream inputStream1 = resource;
/*    */       Throwable throwable = null;
/*    */       try {
/*    */         InputStream input = inputStream1;
/*    */         int $i$a$-use-ResourceReader_desktopKt$getPlatformResourceReader$1$readPart$2 = 0;
/*    */         skipBytes(input, offset);
/*    */         int i = input.readNBytes(result, 0, (int)size);
/*    */       } catch (Throwable throwable1) {
/*    */         throwable = throwable1 = null;
/*    */         throw throwable1;
/*    */       } finally {
/*    */         CloseableKt.closeFinally(inputStream1, throwable);
/*    */       } 
/*    */       return result;
/*    */     }
/*    */     
/*    */     private final void skipBytes(InputStream $this$skipBytes, long offset) {
/*    */       long skippedBytes = 0L;
/*    */       while (skippedBytes < offset) {
/*    */         long count = $this$skipBytes.skip(offset - skippedBytes);
/*    */         if (count != 0L)
/*    */           skippedBytes += count; 
/*    */       } 
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String getUri(@NotNull String path) {
/*    */       URL resource;
/*    */       Intrinsics.checkNotNullParameter(path, "path");
/*    */       ClassLoader classLoader = getClassLoader();
/*    */       if (classLoader.getResource(path) == null) {
/*    */         classLoader.getResource(path);
/*    */         throw new MissingResourceException(path);
/*    */       } 
/*    */       Intrinsics.checkNotNullExpressionValue(resource.toURI().toString(), "toString(...)");
/*    */       return resource.toURI().toString();
/*    */     }
/*    */     
/*    */     private final InputStream getResourceAsStream(String path) {
/*    */       ClassLoader classLoader = getClassLoader();
/*    */       if (classLoader.getResourceAsStream(path) == null) {
/*    */         classLoader.getResourceAsStream(path);
/*    */         throw new MissingResourceException(path);
/*    */       } 
/*    */       return classLoader.getResourceAsStream(path);
/*    */     }
/*    */     
/*    */     private final ClassLoader getClassLoader() {
/*    */       if (getClass().getClassLoader() == null) {
/*    */         getClass().getClassLoader();
/*    */         throw new IllegalStateException("Cannot find class loader".toString());
/*    */       } 
/*    */       return getClass().getClassLoader();
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceReader_desktopKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */