/*    */ package ai.grazie.model.cloud;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Regex;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\t\bg\030\000 \0132\0020\001:\001\013J\b\020\b\032\0020\003H\026J\020\020\t\032\0020\0032\006\020\n\032\0020\003H\026R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0038VX\004¢\006\006\032\004\b\007\020\005ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/model/cloud/ExternalAPI;", "", "path", "", "getPath", "()Ljava/lang/String;", "prefix", "getPrefix", "route", "url", "server", "Companion", "model-cloud"})
/*    */ public interface ExternalAPI {
/*    */   @NotNull
/*    */   default String getPrefix() {
/* 14 */     return "/";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   String getPath();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\005"}, d2 = {"Lai/grazie/model/cloud/ExternalAPI$Companion;", "", "()V", "slashes", "Lkotlin/text/Regex;", "model-cloud"})
/*    */   public static final class Companion { @NotNull
/* 22 */     private static final Regex slashes = new Regex("/+"); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default String route() {
/* 30 */     String[] arrayOfString = new String[2]; arrayOfString[0] = getPrefix(); arrayOfString[1] = getPath();
/* 31 */     CharSequence charSequence = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[])arrayOfString), "/", null, null, 0, null, null, 62, null);
/* 32 */     Regex regex = Companion.slashes; String str = "/";
/* 33 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; return StringsKt.trim(regex.replace(charSequence, str), arrayOfChar);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default String url(@NotNull String server) {
/* 40 */     Intrinsics.checkNotNullParameter(server, "server"); String[] arrayOfString = new String[1]; arrayOfString[0] = "://"; List<String> list = StringsKt.split$default(server, arrayOfString, false, 0, 6, null); String protocol = list.get(0), host = list.get(1);
/* 41 */     String route = route();
/* 42 */     return protocol + "://" + protocol + "/" + host;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ExternalAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */