package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditSearchReplace.kt", l = {182, 189, 204, 216, 240, 249, 257, 265, 275, 282, 288, 298, 303, 307, 317}, i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, n = {"$this", "edits", "editType", "fileNameToDocument", "context", "arguments", "project", "documentManager", "updatedDocumentCopies", "erroredBlocks", "fileNameToPath", "edit", "dryRun", "$this", "edits", "editType", "fileNameToDocument", "context", "arguments", "project", "documentManager", "updatedDocumentCopies", "erroredBlocks", "fileNameToPath", "edit", "dryRun", "$this", "edits", "editType", "fileNameToDocument", "context", "arguments", "project", "documentManager", "updatedDocumentCopies", "erroredBlocks", "fileNameToPath", "dryRun", "$this", "edits", "context", "arguments", "updatedDocumentCopies", "destination$iv$iv", "$this", "edits", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "fileName", "document", "changes", "dryRun", "editType", "context", "document", "changes", "errors", "prevDocument", "editType", "context", "changes", "prevDocument", "resultMsg", "editType", "resultMsg", "codeAfter", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "session", "path", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "session", "path", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "codeChanges", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "codeChanges", "semanticErrors", "$this", "editType", "fileNameToDocument", "context", "project", "codeChanges", "semanticErrors", "destination$iv$iv"}, m = "doSearchReplace$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditSearchReplace$doSearchReplace$4 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  Object L$8;
  
  Object L$9;
  
  Object L$10;
  
  Object L$11;
  
  Object L$12;
  
  boolean Z$0;
  
  int label;
  
  EditSearchReplace$doSearchReplace$4(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditSearchReplace.doSearchReplace$suspendImpl(EditSearchReplace.this, null, null, null, null, false, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSearchReplace$doSearchReplace$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */